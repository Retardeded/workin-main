package pl.edu.agh.db.mappers;

import pl.edu.agh.db.entities.FacultyEntity;
import pl.edu.agh.model.Faculty;

public class FacultiesMapper {

    public static Faculty entityToModel(FacultyEntity entity){
        Faculty model = new Faculty();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setDean(DeansMapper.entityToModel(entity.getDean()));
        return model;
    }

    public static FacultyEntity modelToEntity(Faculty model){
        FacultyEntity entity = new FacultyEntity();
        entity.setDean(DeansMapper.modelToEntity(model.getDean()));
        entity.setId(model.getId());
        entity.setName(model.getName());
        return entity;
    }
}
