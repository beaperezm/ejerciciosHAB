package com.hackaboss.ejercicio1integrador.persistencia;

import com.hackaboss.ejercicio1integrador.logica.Equipo;
import com.hackaboss.ejercicio1integrador.logica.Partido;
import com.hackaboss.ejercicio1integrador.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    EquipoJpaController equipoJpa = new EquipoJpaController();
    PartidoJpaController partidoJpa = new PartidoJpaController();
    
    public void crearEquipo(Equipo equipo) {
        equipoJpa.create(equipo);
    }
    
    public List<Equipo> traerEquipos() {
        return equipoJpa.findEquipoEntities();
    }
    
      public void eliminarEquipo(int id) {
        try {
            equipoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarEquipo(Equipo equipo) {
        try {
            equipoJpa.edit(equipo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Equipo obtenerEquipo(int id) {
        return equipoJpa.findEquipo(id);
        
    }

    public void crearPartido(Partido partido) {
        partidoJpa.create(partido);
    }

  
    public List<Partido> traerPartidos() {
        return partidoJpa.findPartidoEntities();
    }

    public void eliminarPartido(int id) {
        try {
            partidoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarPartido(Partido partido) {
        try {
            partidoJpa.edit(partido);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
