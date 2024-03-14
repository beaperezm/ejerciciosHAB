package com.hackaboss;

public class ExploradorTarea {

    Tarea tarea = new Tarea();

    public void explorarTarea(Tarea tarea) {
        System.out.println(tarea.getTarea());
        for (Tarea tareaHija : tarea.getTareaPrincipal()) {
            explorarTarea(tareaHija);
        }
        for (Tarea tareaHija : tarea.getSubtarea()) {
            explorarTarea(tareaHija);
        }
        for (Tarea tareaHija : tarea.getSubsubtarea()) {
            explorarTarea(tareaHija);
        }
    }
}
