package pl.edu.agh.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlType(propOrder={"name","album","picturePath","courses"})
public class Student {

    private String name;
    private Integer album;
    private String picturePath = "defaultPicture.jpg";
    private List<String> courses;


    public Student() {
    }

    public Student(String name, int album) {
        this.name = name;
        this.album = album;
    }

    public void setAlbum(int album) {
        this.album = album;
    }

    public Student(String name, int album, List<String> courses) {
        this(name, album);
        this.courses = courses;
    }

    public Student(String name, int album, String picturePath) {
        this(name, album);
        this.picturePath = picturePath;
    }

    public Student(String name, int album, String picturePath, List<String> courses) {
        this(name, album, picturePath);
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getAlbum() {
        return album;
    }

    public String getPicturePath() {
        return picturePath;
    }

    @XmlElementWrapper(name = "courses")
    @XmlElement(name = "courses")
    public List<String> getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public void addCourse(String c) {
        if(courses == null)
        {
            courses = new ArrayList<>();
        }
        courses.add(c);
    }

    public static final class Builder {
        private String name;
        private Integer album;
        private String picturePath;
        private List<String> courses;

        public Builder() {
        }

        public static Builder aStudent() {
            return new Builder();
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAlbum(Integer album) {
            this.album = album;
            return this;
        }

        public Builder withPicturePath(String picturePath) {
            this.picturePath = picturePath;
            return this;
        }

        public Builder withCourses(List<String> courses) {
            this.courses = courses;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.setName(name);
            student.setAlbum(album);
            student.setPicturePath(picturePath);
            student.setCourses(courses);
            return student;
        }
    }

    @Override
    public String toString() {
        String result = this.getAlbum() + ", " + this.getName() + ", ";
        if (this.getCourses() != null){
            result += this.getCourses();
        }
//        else{
//            result += "";
//        }
        return result;
    }
}