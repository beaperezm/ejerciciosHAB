package com.mycompany.ejer2jpa.persistencia;

import com.mycompany.ejer2jpa.logica.Platillo;
import com.mycompany.ejer2jpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    PlatilloJpaController platilloJpa = new PlatilloJpaController();

    public void crearPlatillo(Platillo platillo) {
        platilloJpa.create(platillo);  
    }
    
    public List<Platillo> traerPlatillo() {
        return platilloJpa.findPlatilloEntities();
    }
    
    public void borrarPlatillo(Long id) {
        try {
            platilloJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public Platillo buscarPlatillo(Long id) {
        return platilloJpa.findPlatillo(id);
        
    }
    
    public void editarPlatillo (Platillo platillo) {
        try {
            platilloJpa.edit(platillo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
