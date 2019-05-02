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
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Cdis
 */
@Named(value = "vuelosFacade")
@SessionScoped
public class VuelosFacade implements Serializable {
    
    @EJB
    private Facade.VuelosFacade facadeVuelos;
    private Vuelos vuelos=new Vuelos();

    /**
     * Creates a new instance of VuelosFacade
     */
    public VuelosFacade() {
    }
    
    public List<Vuelos> getAllVuelos()
    {
        return facadeVuelos.findAll();
    }
    
    
    public void creteEntityVuelos()
            
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
