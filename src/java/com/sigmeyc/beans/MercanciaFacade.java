/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigmeyc.beans;

import com.sigmeyc.entities.Mercancia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ivan
 */
@Stateless
public class MercanciaFacade extends AbstractFacade<Mercancia> {

    @PersistenceContext(unitName = "sigmeycPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MercanciaFacade() {
        super(Mercancia.class);
    }
    
}
