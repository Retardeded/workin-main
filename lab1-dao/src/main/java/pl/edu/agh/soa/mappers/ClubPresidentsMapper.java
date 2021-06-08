package pl.edu.agh.soa.mappers;

import pl.edu.agh.soa.entities.ClubPresidentEntity;
import pl.edu.agh.model.ClubPresident;

public class ClubPresidentsMapper {

    public static ClubPresident entityToModel(ClubPresidentEntity entity){
        ClubPresident clubPresident = new ClubPresident();
        clubPresident.setId(entity.getId());
        clubPresident.setSpeciality(entity.getSpeciality());
        clubPresident.setName(entity.getName());
        return clubPresident;
    }

    public static ClubPresidentEntity modelToEntity(ClubPresident clubPresident){
        ClubPresidentEntity clubPresidentEntity = new ClubPresidentEntity();
        clubPresidentEntity.setSpeciality(clubPresident.getSpeciality());
        clubPresidentEntity.setId(clubPresident.getId());
        clubPresidentEntity.setName(clubPresident.getName());
        return clubPresidentEntity;
    }

}
