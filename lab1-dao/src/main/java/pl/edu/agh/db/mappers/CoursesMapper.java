package pl.edu.agh.db.mappers;

import pl.edu.agh.db.entities.CourseEntity;

public class CoursesMapper {

    public static String entityToModel(CourseEntity entity){
        return entity.getName();
    }

    public static CourseEntity modelToEntity(String course){
        CourseEntity entity = new CourseEntity();
        entity.setName(course);
        return entity;
    }

}
