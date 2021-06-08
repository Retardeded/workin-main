package pl.edu.agh.soa.entities;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clubs")
public class ClubEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "clubId")
    private int id;

    private String name;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private ClubPresidentEntity clubPresident;


    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinTable(name = "student_clubs",
            joinColumns = {@JoinColumn(name = "clubId")},
            inverseJoinColumns = {@JoinColumn(name = "studentAlbum")})
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

    public ClubPresidentEntity getClubPresident() {
        return clubPresident;
    }

    public void setClubPresident(ClubPresidentEntity clubPresident) {
        this.clubPresident = clubPresident;
    }
}
