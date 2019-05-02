/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Vuelos;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Cdis
 */
@Named(value = "controllerVuelos")
@SessionScoped
public class ControllerVuelos implements Serializable {

    
    @EJB
    private Facade.VuelosFacade facadeVuelos;
    private Vuelos vuelos =new Vuelos();
    /**
     * Creates a new instance of ControllerVuelos
     */
    public ControllerVuelos() {
    }
    
    
    
    
    public List<Vuelos> getAllVuelos()
    {
        return facadeVuelos.findAll();
    }
    
    
    public void createEntityVuelos(Vuelos vuelos)
    {
        facadeVuelos.create(vuelos);
    }

    public Vuelos getVuelos() {
        return vuelos;
    }

    public void setVuelos(Vuelos vuelos) {
        this.vuelos = vuelos;
    }
    
    
    
    
}
