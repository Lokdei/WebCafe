package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(City.class)
public abstract class City_ {

	public static volatile SingularAttribute<City, String> code;
	public static volatile SingularAttribute<City, Province> province;
	public static volatile SingularAttribute<City, String> alpha;
	public static volatile SingularAttribute<City, Long> latitude;
	public static volatile SingularAttribute<City, String> name;
	public static volatile SingularAttribute<City, Integer> id;
	public static volatile SingularAttribute<City, Date> creationDate;
	public static volatile SingularAttribute<City, Long> longitude;

}

