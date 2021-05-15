package pl.edu.agh.rest.model;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {
    private List<Student> students;

    public StudentsList() {
        students = new ArrayList<>();
    }

    public List<Student> getAllStudents(){
        return students;
    }

    public void addStudent(Student newStudent) throws Exception {
        if (getStudentByAlbum(newStudent.getAlbum()) != null){
            throw new Exception("Student already exists");
        }
        else {
            students.add(newStudent);
        }
    }

    public Student getStudentByAlbum(int album){
        for(Student student : students){
            if (student.getAlbum() == album){
                return student;
            }
        }
        return null;
    }

    public List<Student> getStudentByName(String name){
        ArrayList<Student> studentsList = new ArrayList<>();
        for(Student student : students){
            if (student.getName().toLowerCase().equals(name.toLowerCase())){
                studentsList.add(student);
            }
        }
        return studentsList;
    }

    public List<Student> getStudentByCourse(String course){
        ArrayList<Student> studentsList = new ArrayList<>();
        for(Student student : students){
            if (student.getCourses().contains(course)){
                studentsList.add(student);
            }
        }
        return studentsList;
    }

    public void deleteStudentByAlbum(int album){
        students.remove(getStudentByAlbum(album));
    }

    public String addCourseToStudent(int album, String course){
        if(getStudentByAlbum(album) != null) {
            getStudentByAlbum(album).getCourses().add(course);
            return "Course added";
        }
        else
            return "Student does not exist";
    }

    public String updatePicture(int album, String picturePath){
        getStudentByAlbum(album).setPicturePath(picturePath);
        return "Picture Changed";
    }

    public void updateStudentByAlbum(int album, String name) throws Exception {
        if (getStudentByAlbum(album) == null){
            throw new Exception("Student does not exist");
        }
        else{
            getStudentByAlbum(album).setName(name);
        }
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

    public void removeStudentByAlbum(int album){
        students.remove(getStudentByAlbum(album));
    }


    public StudentsList setDefaultData(){

        Student student = new Student.Builder()
                .withName("Pioter")
                .withAlbum(303030)
                .withPicturePath("Default.jpg")
                .build();
        student.addCourse("Mobilne");
        student.addCourse("SOA");
        students.add(student);

        Student student2 = new Student.Builder()
                .withName("Mateusz")
                .withAlbum(303033)
                .withPicturePath("Default.jpg")
                .build();
        student2.addCourse("Mobilne");
        student2.addCourse("SOA");
        student2.addCourse("Studio Projektowe");
        students.add(student2);

        return this;
    }


}