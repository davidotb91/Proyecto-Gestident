/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.servicio;

import com.ec.entidades.Administrador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author angel
 */
@Stateless
public class AdministradorFacade extends AbstractFacade<Administrador> {

    @PersistenceContext(unitName = "WebDentPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdministradorFacade() {
        super(Administrador.class);
    }
    
}
