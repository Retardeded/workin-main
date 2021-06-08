package pl.edu.agh.soa.entities;


import javax.persistence.*;

@Entity
@Table(name = "clubs")
public class ClubEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String name;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private ClubPresidentEntity clubPresident;


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

    public void setClubPresident(ClubPresidentEntity dean) {
        this.clubPresident = dean;
    }
}
