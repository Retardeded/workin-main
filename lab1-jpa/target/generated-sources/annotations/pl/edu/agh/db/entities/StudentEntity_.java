package pl.edu.agh.db.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StudentEntity.class)
public abstract class StudentEntity_ {

	public static volatile SetAttribute<StudentEntity, CourseEntity> courses;
	public static volatile SingularAttribute<StudentEntity, String> name;
	public static volatile SingularAttribute<StudentEntity, String> avatarPath;
	public static volatile SingularAttribute<StudentEntity, Integer> id;
	public static volatile SingularAttribute<StudentEntity, Integer> age;
	public static volatile SingularAttribute<StudentEntity, FacultyEntity> faculty;

}

