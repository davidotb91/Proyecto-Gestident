/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidades.Paciente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author angel
 */
@Stateless
public class PacienteFacade extends AbstractFacade<Paciente> {

    @PersistenceContext(unitName = "WebDentPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PacienteFacade() {
        super(Paciente.class);
    }
    
}
