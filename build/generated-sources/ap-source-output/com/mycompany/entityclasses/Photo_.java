package com.mycompany.entityclasses;

import com.mycompany.entityclasses.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-07T19:39:14")
@StaticMetamodel(Photo.class)
public class Photo_ { 

    public static volatile SingularAttribute<Photo, String> extension;
    public static volatile SingularAttribute<Photo, Customer> customerId;
    public static volatile SingularAttribute<Photo, Integer> id;

}