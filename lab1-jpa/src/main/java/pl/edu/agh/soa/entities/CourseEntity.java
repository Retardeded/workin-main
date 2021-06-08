package pl.edu.agh.soa.entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "courses")
public class CourseEntity {

    @Id
    @GeneratedValue
    @Column(name = "courseID")
    private int id;

    @Column
    private String name;

    @ManyToMany(mappedBy="courses")
    private Set<StudentEntity> students;

    public Set<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(Set<StudentEntity> students) {
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}