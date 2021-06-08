package pl.edu.agh.soa.entities;


import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "students")
public class StudentEntity {

    @Column
    private String name;

    @Id
    @Column(name = "studentAlbum")
    private int album;

    @Column
    private String avatarPath = "defaultAvatar.jpg";

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable
    private Set<CourseEntity> courses;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private ClubEntity club;


    public ClubEntity getClub() {
        return club;
    }

    public void setClub(ClubEntity faculty) {
        this.club = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlbum() {
        return album;
    }

    public void setAlbum(Integer id) {
        this.album = id;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public Set<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(Set<CourseEntity> courses) {
        this.courses = courses;
    }
}
