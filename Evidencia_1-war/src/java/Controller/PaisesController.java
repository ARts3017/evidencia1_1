/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Paises;
import Facade.PaisesFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Cdis
 */
@Named(value = "paisesController")
@SessionScoped
public class PaisesController implements Serializable {

    
    
    @EJB
    private Facade.PaisesFacade facadePaises;
    private Paises paises=new Paises();
    
    /**
     * Creates a new instance of PaisesController
     */
    
    
    
    
    public PaisesController() {
    }
    
    
    public List<Paises> getAllPaises()
    {
        return facadePaises.findAll();
    }
    
    
    public void createEntityPaises(Paises paises)
    {
        facadePaises.create(paises);
    }

    public PaisesFacade getFacadePaises() {
        return facadePaises;
    }

    public void setFacadePaises(PaisesFacade facadePaises) {
        this.facadePaises = facadePaises;
    }

    public Paises getPaises() {
        return paises;
    }

    public void setPaises(Paises paises) {
        this.paises = paises;
    }

    
    
    
}
