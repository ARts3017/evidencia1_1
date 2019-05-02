/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Nombre;
import Facade.NombreFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Cdis
 */
@Named(value = "nombreController")
@SessionScoped
public class NombreController implements Serializable {

    @EJB
    private Facade.NombreFacade facade;
    private Nombre nombre=new Nombre();
    /**
     * Creates a new instance of NombreController
     */
    public NombreController() {
    }

    
    public List<Nombre> getAll()
    {
        return facade.findAll();
    }
    
    public void addEntityNombre(Nombre name)
    {
        
        
       
        facade.create(name);
    }
    

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
        
        
    }
    
    
    
}
