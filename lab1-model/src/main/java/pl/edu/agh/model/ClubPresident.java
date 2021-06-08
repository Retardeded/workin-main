package pl.edu.agh.model;

public class ClubPresident {

    private int id;
    private String speciality;
    private String name;

    public ClubPresident() {
    }

    public ClubPresident(String speciality, String name) {
        this.speciality = speciality;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
