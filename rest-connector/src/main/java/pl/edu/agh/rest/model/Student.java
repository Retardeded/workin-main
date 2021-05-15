package pl.edu.agh.rest.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder={"name","album","picturePath","courses"})
public class Student {

    private String name;
    private Integer album;
    private String picturePath;
    private List<String> courses;


    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "album")
    public int getAlbum() {
        return album;
    }

    public void setAlbum(Integer album) {
        this.album = album;
    }

    @XmlElement(name = "picturePath")
    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    @XmlElementWrapper(name = "courses")
    @XmlElement(name = "course")
    public List<String> getCourses() {
        return courses;
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

}