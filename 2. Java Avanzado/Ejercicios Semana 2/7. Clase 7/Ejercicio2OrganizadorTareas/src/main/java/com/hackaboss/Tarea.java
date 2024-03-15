package com.hackaboss;

import java.util.ArrayList;
import java.util.List;

public class Tarea {

    private int id;
    private String tarea;
    List<Tarea> tareaPrincipal;
    List<Tarea> subtarea;
    List<Tarea> subsubtarea;

    public Tarea(int id, String tarea) {
        this.id = id;
        this.tarea = tarea;
        this.tareaPrincipal = new ArrayList<>();
        this.subtarea = new ArrayList<>();
        this.subsubtarea = new ArrayList<>();
    }

    public Tarea(String tarea) {
        this.tarea = tarea;
        this.tareaPrincipal = new ArrayList<>();
        this.subtarea = new ArrayList<>();
        this.subsubtarea = new ArrayList<>();
    }

    public Tarea() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public List<Tarea> getSubtarea() {
        return subtarea;
    }

    public void setSubtarea(List<Tarea> subtarea) {
        this.subtarea = subtarea;
    }

    public List<Tarea> getSubsubtarea() {
        return subsubtarea;
    }

    public void setSubsubtarea(List<Tarea> subsubtarea) {
        this.subsubtarea = subsubtarea;
    }

    public List<Tarea> getTareaPrincipal() {
        return tareaPrincipal;
    }

    public void setTareaPrincipal(List<Tarea> tareaPrincipal) {
        this.tareaPrincipal = tareaPrincipal;
    }


    @Override
    public String toString() {
        return '{' +
                "id=" + id +
                ", tarea='" + tarea + '\'' +
              //  ", tareaPrincipal=" + tareaPrincipal +
                ", subtarea=" + subtarea +
             //   ", subsubtarea=" + subsubtarea +
                "}\n";
    }
}
