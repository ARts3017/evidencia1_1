/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Estados;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Cdis
 */
@Named(value = "estadosController")
@SessionScoped
public class EstadosController implements Serializable {

    
    
    @EJB 
    private Facade.EstadosFacade facadeEstdos;
    private Estados estados=new Estados();
            
    /**
     * Creates a new instance of EstadosController
     */
    public EstadosController() {
    }
    
    
    public List<Estados> getAllEstados()
    {
       return facadeEstdos.findAll();
    }
    
    
    public void createEntityEstados(Estados estados)
    {
        facadeEstdos.create(estados);
    }

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }
    
    
    
    
    
    
    
    
}
