/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Nombre;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Cdis
 */
@Stateless
public class NombreFacade extends AbstractFacade<Nombre> {

    @PersistenceContext(unitName = "Evidencia_1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NombreFacade() {
        super(Nombre.class);
    }
    
}
