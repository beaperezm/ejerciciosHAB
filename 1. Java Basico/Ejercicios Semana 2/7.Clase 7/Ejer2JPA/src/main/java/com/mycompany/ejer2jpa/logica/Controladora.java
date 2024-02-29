package com.mycompany.ejer2jpa.logica;

import com.mycompany.ejer2jpa.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearPlatillo(Platillo platillo1) {
        controlPersis.crearPlatillo(platillo1); 
    }

    public List<Platillo> traerPlatillos() {
        return controlPersis.traerPlatillo();
    }
    
    public void borrarPlatillo(Long id) {
        controlPersis.borrarPlatillo(id);
    }

    public Platillo buscarPlatillo(Long id) {
        return controlPersis.buscarPlatillo(id);
    }

    public void editarPlatillo(Platillo editarPlatillo) {
        controlPersis.editarPlatillo(editarPlatillo);
    }
    
  
    
}
