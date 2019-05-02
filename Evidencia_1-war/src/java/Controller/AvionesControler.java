/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Aviones;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Cdis
 */
@Named(value = "avionesControler")
@SessionScoped
public class AvionesControler implements Serializable {
    
    @EJB
    private Facade.AvionesFacade facadeAviones;
    private Aviones aviones=new Aviones();

    /**
     * Creates a new instance of AvionesControler
     */
    public AvionesControler() {
    }
    
    public List<Aviones> getAllAviones()
    {
        return facadeAviones.findAll();
        
    }
    
    public void createEntityAviones(Aviones aviones)
    {
        facadeAviones.create(aviones);
        
    }
    
    public void deleteAvion()
    {
        
    }

    public Aviones getAviones() {
        return aviones;
    }

    public void setAviones(Aviones aviones) {
        this.aviones = aviones;
    }
    
    
    
}
