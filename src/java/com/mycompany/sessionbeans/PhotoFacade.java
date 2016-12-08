/*
 * Created by Osman Balci on 2016.04.23  * 
 * Copyright © 2016 Osman Balci. All rights reserved. * 
 */
package com.mycompany.sessionbeans;

import com.mycompany.entityclasses.Photo;
import java.util.List; // Added to the generated code
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Balci
 */
// @Stateless annotation implies that the conversational state with the client shall NOT be maintained.
@Stateless

public class PhotoFacade extends AbstractFacade<Photo> {
    @PersistenceContext(unitName = "Buy4UPU")
    private EntityManager em;

    // @Override annotation indicates that the super class AbstractFacade's getEntityManager() method is overridden.
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    /* 
    This constructor method invokes the parent abstract class AbstractFacade.java's
    constructor method AbstractFacade, which in turn initializes its entityClass instance
    variable with the Photo class object reference returned by the Photo.class.
     */
    public PhotoFacade() {
        super(Photo.class);
    }

    // The following method is added to the generated code.
    /**
     * @param customerID is the Primary Key of the Customer entity in a table row in the PizzaHutDB database.
     * @return a list of photos associated with the Customer whose primary key is customerID
     */
    public List<Photo> findPhotosByCustomerID(Integer customerID) {

        return (List<Photo>) em.createNamedQuery("Photo.findPhotosByCustomerID")
                .setParameter("customerId", customerID)
                .getResultList();
    }

    /* The following methods are inherited from the parent AbstractFacade class:
    
        create
        edit
        find
        findAll
        remove
     */
}
