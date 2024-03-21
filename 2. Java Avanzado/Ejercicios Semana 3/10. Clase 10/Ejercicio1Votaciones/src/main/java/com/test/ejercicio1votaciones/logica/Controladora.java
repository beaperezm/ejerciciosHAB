package com.test.ejercicio1votaciones.logica;

import com.test.ejercicio1votaciones.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearVotos(Voto voto) {
        controlPersis.crearVotos(voto);
    }

   public List<Voto> traerVotos() {
        return controlPersis.traerVotos();
    }

    

   
    
}
