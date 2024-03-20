
package com.hackaboss.ejercicio1integrador.logica;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Partido implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_partido;
    private Date fecha;
    private int resultadoEquipo1;
    private int resultadoEquipo2;
    
    @ManyToOne
    private Equipo equipo1;
    
    @ManyToOne
    private Equipo equipo2;

    public Partido() {
    }

    public Partido(int id_partido, Date fecha, int resultadoEquipo1, int resultadoEquipo2, Equipo equipo1, Equipo equipo2) {
        this.id_partido = id_partido;
        this.fecha = fecha;
        this.resultadoEquipo1 = resultadoEquipo1;
        this.resultadoEquipo2 = resultadoEquipo2;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getResultadoEquipo1() {
        return resultadoEquipo1;
    }

    public void setResultadoEquipo1(int resultadoEquipo1) {
        this.resultadoEquipo1 = resultadoEquipo1;
    }

    public int getResultadoEquipo2() {
        return resultadoEquipo2;
    }

    public void setResultadoEquipo2(int resultadoEquipo2) {
        this.resultadoEquipo2 = resultadoEquipo2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
    
    
    public String fechaFormateada() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fecha);
    }

  

}
