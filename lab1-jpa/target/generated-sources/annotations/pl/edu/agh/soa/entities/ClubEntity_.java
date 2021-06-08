package pl.edu.agh.soa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ClubEntity.class)
public abstract class ClubEntity_ {

	public static volatile SingularAttribute<ClubEntity, String> name;
	public static volatile SingularAttribute<ClubEntity, ClubPresidentEntity> clubPresident;
	public static volatile SingularAttribute<ClubEntity, Integer> id;

}

