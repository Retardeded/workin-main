package pl.edu.agh.db.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CourseEntity.class)
public abstract class CourseEntity_ {

	public static volatile SingularAttribute<CourseEntity, String> name;
	public static volatile SetAttribute<CourseEntity, StudentEntity> students;
	public static volatile SingularAttribute<CourseEntity, Integer> id;

}

