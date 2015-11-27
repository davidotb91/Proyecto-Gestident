/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entitis.FichaClinica;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author david
 */
@Stateless
public class FichaClinicaFacade extends AbstractFacade<FichaClinica> {

    @PersistenceContext(unitName = "gestydentV01PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FichaClinicaFacade() {
        super(FichaClinica.class);
    }
    
}
