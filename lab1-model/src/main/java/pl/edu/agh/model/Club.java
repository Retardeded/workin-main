package pl.edu.agh.model;

public class Club {

    private int id;
    private String name;
    private ClubPresident clubPresident;

    public Club() {
    }

    public Club(String name, ClubPresident clubPresident){
        this.name = name;
        this.clubPresident = clubPresident;
    }

    public ClubPresident getClubPresident() {
        return clubPresident;
    }

    public void setClubPresident(ClubPresident clubPresident) {
        this.clubPresident = clubPresident;
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
