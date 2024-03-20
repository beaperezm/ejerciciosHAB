package com.hackaboss.ejercicio1integrador.logica;

import com.hackaboss.ejercicio1integrador.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearEquipo(Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }
    
    public List<Equipo> traerEquipos () {
        return controlPersis.traerEquipos();
    }
    
       public void eliminarEquipo (int id) {
        controlPersis.eliminarEquipo(id);
    }
       
    public void editarEquipo (Equipo equipo) {
        controlPersis.editarEquipo(equipo);
    }
    
    
    
    //  PARTIDO
        public void crearPartido(Partido partido) {
        controlPersis.crearPartido(partido);
    }
    
    public List<Partido> traerPartidos () {
        return controlPersis.traerPartidos();
    }
    
       public void eliminarPartido (int id) {
        controlPersis.eliminarPartido(id);
    }
       
    public void editarPartido(Partido partido) {
        controlPersis.editarPartido(partido);
    }
    

    public void crearPartido(Partido partido, int idEquipo1, int idEquipo2) {
        Equipo equipoid1 = controlPersis.obtenerEquipo(idEquipo1);
        Equipo equipoid2 = controlPersis.obtenerEquipo(idEquipo2);
        
        partido.setEquipo1(equipoid1);
        partido.setEquipo2(equipoid2);
        
        controlPersis.crearPartido(partido);
    }
            
    
}
