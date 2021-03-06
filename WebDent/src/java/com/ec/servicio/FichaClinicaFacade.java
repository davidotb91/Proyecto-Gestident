/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidades.FichaClinica;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author angel
 */
@Stateless
public class FichaClinicaFacade extends AbstractFacade<FichaClinica> {

    @PersistenceContext(unitName = "WebDentPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FichaClinicaFacade() {
        super(FichaClinica.class);
    }
    
}
