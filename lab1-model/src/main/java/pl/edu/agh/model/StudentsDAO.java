package pl.edu.agh.model;

import java.util.ArrayList;
import java.util.List;

public class StudentsDAO {
    private List<Student> studentsList;

    public StudentsDAO() {
        studentsList = new ArrayList<Student>();
    }

    public List<Student> getAllStudents(){
        return studentsList;
    }

    public void addStudent(Student newStudent) throws Exception {
        if (getStudentById(newStudent.getAlbum()) != null){
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


    public Student getStudentById(int id){
        for(Student student : studentsList){
            if (student.getAlbum() == id){
                return student;
            }
        }
        return null;
    }

    public void updateStudentById(int id, String name) throws Exception {
        if (getStudentById(id) == null){
            throw new Exception("Student does not exist");
        }
        else{
            getStudentById(id).setName(name);
        }
    }

    public void removeStudentById(int id){
        studentsList.remove(getStudentById(id));
    }

    public String addCourseToStudent(int id, String course){
        if(getStudentById(id) != null) {
            getStudentById(id).getCourses().add(course);
            return "Course added successfully";
        }
        else
            return "Student does not exist";
    }

    public String updateAvatar(int id, String avatarPath){
        getStudentById(id).setPicturePath(avatarPath);
        return "Avatar Changed Successfully";
    }

    public Student updateStudent(int id, Student student) throws Exception{
        if (getStudentById(id) == null){
            throw new Exception("Student does not exist");
        }
        else{
            updateStudentById(id, student.getName());
            updateAvatar(id, student.getPicturePath());
            getStudentById(id).setCourses(student.getCourses());
        }
        return student;
    }


    public StudentsDAO populateListWithDefaultData(){
        ArrayList<String> courses = new ArrayList<>();
        courses.add("SOA");
        courses.add("Technologie Mobilne");
        courses.add("Kompilatory");
        courses.add("Interfejsy multimodalne");
        //studentsList.add(new Student("Jacek",1, 21, courses));
        //studentsList.add(new Student("Kasia",2, 24, courses));
        //studentsList.add(new Student("Basia",3, 22, courses));
        //studentsList.add(new Student("Kasia", 4, 20, courses));
        //studentsList.add(new Student("Jacek", 5, 22, courses));
        return this;
    }


}
