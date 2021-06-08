package pl.edu.agh.soa.dao;

import pl.edu.agh.soa.entities.ClubEntity;
import pl.edu.agh.soa.entities.CourseEntity;
import pl.edu.agh.soa.entities.StudentEntity;
import pl.edu.agh.soa.mappers.CoursesMapper;
import pl.edu.agh.soa.mappers.ClubsMapper;
import pl.edu.agh.soa.mappers.StudentsMapper;
import pl.edu.agh.model.ClubPresident;
import pl.edu.agh.model.Club;
import pl.edu.agh.model.Student;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.*;
import java.util.stream.Collectors;

@Stateless
public class StudentsDAO{

    @PersistenceContext(unitName = "studentsThis")
    EntityManager em;


    public List<Student> getAllStudents() {
        return getAllStudents(Collections.emptyMap());
    }

    public List<Student> getAllStudents(Map<String, String> params) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<StudentEntity> criteriaQuery = builder.createQuery(StudentEntity.class);
        Root<StudentEntity> root = criteriaQuery.from(StudentEntity.class);
        if(params.isEmpty()) {
            criteriaQuery.select(root);
        }
        else {
            List<Predicate> predicates = new ArrayList<Predicate>();
            for(Map.Entry<String, String> param : params.entrySet()){
                if(param.getKey().equals("course")){
                    predicates.add(builder.equal(root.join("courses", JoinType.INNER).get("name")
                            ,param.getValue()));
                }
                else{
                    predicates.add(builder.equal(root.get(param.getKey()), param.getValue()));
                }
            }
            criteriaQuery.select(root).where(predicates.toArray(new Predicate[]{}));
        }
        TypedQuery<StudentEntity> query = em.createQuery(criteriaQuery);
        List<StudentEntity> resultList = query.getResultList();


        if(resultList == null)
        {
            System.out.println("null");
            return null;
        }
        return resultList.stream().map(StudentsMapper::entityToModel).collect(Collectors.toList());
    }



    public void addStudent(Student student){

        StudentEntity studentEntity = StudentsMapper.modelToEntity(student);
        studentEntity.setCourses(new HashSet<>());
        for(String course : student.getCourses()){
            CourseEntity courseEntity = CoursesMapper.modelToEntity(course);
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<CourseEntity> criteriaQuery = builder.createQuery(CourseEntity.class);
            Root<CourseEntity> root = criteriaQuery.from(CourseEntity.class);
            criteriaQuery.select(root);
            TypedQuery<CourseEntity> query = em.createQuery(criteriaQuery);
            List<CourseEntity> resultList = query.getResultList();
            for (CourseEntity result : resultList){
                if (result.getName().equals(course)){
                    courseEntity = result;
                }
            }
            studentEntity.getCourses().add(courseEntity);
        }

        if (student.getClub() != null){
            ClubEntity clubEntity = ClubsMapper.modelToEntity(student.getClub());
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<ClubEntity> criteriaQuery = builder.createQuery(ClubEntity.class);
            Root<ClubEntity> root = criteriaQuery.from(ClubEntity.class);
            criteriaQuery.select(root);
            TypedQuery<ClubEntity> query = em.createQuery(criteriaQuery);
            List<ClubEntity> resultList = query.getResultList();
            for (ClubEntity result : resultList){
                if (result.getName().equals(student.getClub().getName())){
                    clubEntity = result;
                }
            }
            studentEntity.setClub(clubEntity);
            if(clubEntity.getStudents() == null) {
                clubEntity.setStudents(new HashSet<>());
            }
            clubEntity.getStudents().add(studentEntity);
            //clubEntity.setStudents(studentEntity);
            em.persist(clubEntity);
        }
        em.persist(studentEntity);
    }

    public Student getStudentByAlbum(int album) {
        return StudentsMapper.entityToModel(em.find(StudentEntity.class, album));
    }

    public void removeStudentByAlbum(int album) {
        StudentEntity s = em.find(StudentEntity.class, album);
        em.remove(s);
    }

    public Student updateStudent(int album, Student student) {
        StudentEntity studentEntity = StudentsMapper.modelToEntity(student);
        studentEntity.setCourses(new HashSet<>());
        for(String course : student.getCourses()){
            CourseEntity courseEntity = CoursesMapper.modelToEntity(course);
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<CourseEntity> criteriaQuery = builder.createQuery(CourseEntity.class);
            Root<CourseEntity> root = criteriaQuery.from(CourseEntity.class);
            criteriaQuery.select(root);
            TypedQuery<CourseEntity> query = em.createQuery(criteriaQuery);
            List<CourseEntity> resultList = query.getResultList();
            for (CourseEntity result : resultList){
                if (result.getName().equals(course)){
                    courseEntity = result;
                }
            }
            studentEntity.getCourses().add(courseEntity);
        }
        studentEntity.setAlbum(album);
        em.merge(studentEntity);
        return student;
    }

}
