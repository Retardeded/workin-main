package pl.edu.agh.soa.mappers;

import pl.edu.agh.soa.entities.ClubEntity;
import pl.edu.agh.model.Club;

public class ClubsMapper {

    public static Club entityToModel(ClubEntity entity){
        Club model = new Club();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setClubPresident(ClubPresidentsMapper.entityToModel(entity.getClubPresident()));
        return model;
    }

    public static ClubEntity modelToEntity(Club model){
        ClubEntity entity = new ClubEntity();
        entity.setClubPresident(ClubPresidentsMapper.modelToEntity(model.getClubPresident()));
        entity.setId(model.getId());
        entity.setName(model.getName());
        return entity;
    }
}
