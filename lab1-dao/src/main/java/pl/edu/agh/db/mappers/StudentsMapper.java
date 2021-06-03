package pl.edu.agh.db.mappers;

import pl.edu.agh.db.entities.CourseEntity;
import pl.edu.agh.db.entities.StudentEntity;
import pl.edu.agh.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StudentsMapper {

    public static StudentEntity modelToEntity(Student student){
        StudentEntity entity = new StudentEntity();
        Set<CourseEntity> courses = new java.util.HashSet<>();
        entity.setName(student.getName());
        entity.setAvatarPath(student.getPicturePath());
        entity.setAlbum(student.getAlbum());
        entity.setFaculty(FacultiesMapper.modelToEntity(student.getFaculty()));
        for (String course : student.getCourses()) {
            courses.add(CoursesMapper.modelToEntity(course));
        }
        entity.setCourses(courses);
        return entity;
    }

    public static Student entityToModel(StudentEntity entity){
        Student student = new Student();
        List<String> courses = new ArrayList<>();
        student.setName(entity.getName());
        student.setAlbum(entity.getAlbum());
        student.setPicturePath(entity.getAvatarPath());
        student.setFaculty(FacultiesMapper.entityToModel(entity.getFaculty()));
        for (CourseEntity course: entity.getCourses()){
            courses.add(course.getName());
        }
        student.setCourses(courses);
        return student;
    }

}
