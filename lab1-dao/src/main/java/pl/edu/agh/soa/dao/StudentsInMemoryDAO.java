package pl.edu.agh.soa.dao;

import java.util.ArrayList;
import java.util.List;
import pl.edu.agh.model.Student;

public class StudentsInMemoryDAO {
    private List<Student> studentsList;

    public StudentsInMemoryDAO() {
        studentsList = new ArrayList<Student>();
    }

    public List<Student> getAllStudents(){
        return studentsList;
    }

    public void addStudent(Student newStudent) throws Exception {
        if (getStudentByAlbum(newStudent.getAlbum()) != null){
            throw new Exception("Student already exists");
        }
        else {
            studentsList.add(newStudent);
        }
    }

    public List<Student> getStudentByName(String name){
        ArrayList<Student> result = new ArrayList<>();
        for(Student student : studentsList){
            if (student.getName().toLowerCase().equals(name.toLowerCase())){
                result.add(student);
            }
        }
        return result;
    }


    public Student getStudentByAlbum(int album){
        for(Student student : studentsList){
            if (student.getAlbum() == album)
            {
                return student;
            }
        }
        return null;
    }

    public List<Student> getStudentByCourse(String course){
        ArrayList<Student> students = new ArrayList<>();
        for(Student student : studentsList){
            if (student.getCourses().contains(course)){
                students.add(student);
            }
        }
        return students;
    }

    public void updateStudentByAlbum(int album, String name) throws Exception {
        if (getStudentByAlbum(album) == null){
            throw new Exception("Student does not exist");
        }
        else{
            getStudentByAlbum(album).setName(name);
        }
    }

    public void removeStudentByAlbum(int album){
        studentsList.remove(getStudentByAlbum(album));
    }

    public String addCourseToStudent(int album, String course){
        if(getStudentByAlbum(album) != null) {
            getStudentByAlbum(album).getCourses().add(course);
            return "Course added successfully";
        }
        else
            return "Student does not exist";
    }

    public String updatePicture(int album, String picturePath){
        getStudentByAlbum(album).setPicturePath(picturePath);
        return "Avatar Changed Successfully";
    }

    public Student updateStudent(int album, Student student) throws Exception{
        if (getStudentByAlbum(album) == null){
            throw new Exception("Student does not exist");
        }
        else{
            updateStudentByAlbum(album, student.getName());
            updatePicture(album, student.getPicturePath());
            getStudentByAlbum(album).setCourses(student.getCourses());
        }
        return student;
    }

    public void deleteStudentByAlbum(int album){
        studentsList.remove(getStudentByAlbum(album));
    }


    public StudentsInMemoryDAO populateListWithDefaultData(){
        ArrayList<String> courses = new ArrayList<>();
        courses.add("SOA");
        courses.add("Technologie Mobilne");
        courses.add("Kompilatory");
        courses.add("Interfejsy multimodalne");
        studentsList.add(new Student("Jacek",303030, "Default.jpg", courses));
        studentsList.add(new Student("Kasia",333333, "Default.jpg", courses));
        studentsList.add(new Student("Basia",313131, "Default.jpg", courses));
        studentsList.add(new Student("Kasia", 323232, "Default.jpg", courses));
        studentsList.add(new Student("Jacek", 5, "Default.jpg", courses));
        return this;
    }

}
