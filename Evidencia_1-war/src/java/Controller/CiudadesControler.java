/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Aviones;
import Entity.Ciudades;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Cdis
 */
@Named(value = "ciudadesControler")
@SessionScoped
public class CiudadesControler implements Serializable {
    
    @EJB
    private Facade.CiudadesFacade ciudadesFacade;
    private Ciudades ciudades=new  Ciudades();

    /**
     * Creates a new instance of CiudadesControler
     */
    public CiudadesControler() {
    }

    public Ciudades getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }
    
    private List<Ciudades> getAllCiudades()
    {
        return ciudadesFacade.findAll();
        
    }
    
    public void createEntityCiudades(Ciudades ciudades)
    {
         ciudadesFacade.create(ciudades);
    }
    
    
    
    
    
    
}
