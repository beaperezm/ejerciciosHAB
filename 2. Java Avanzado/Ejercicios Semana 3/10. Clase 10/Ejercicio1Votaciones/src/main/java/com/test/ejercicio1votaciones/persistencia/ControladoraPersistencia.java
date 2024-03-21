package com.test.ejercicio1votaciones.persistencia;

import com.test.ejercicio1votaciones.logica.Voto;
import java.util.List;


public class ControladoraPersistencia {
    
    VotoJpaController votoJpa = new VotoJpaController();

    public void crearVotos(Voto voto) {
        votoJpa.create(voto);
    }

     public List<Voto> traerVotos() {
        return votoJpa.findVotoEntities();
    }

}
