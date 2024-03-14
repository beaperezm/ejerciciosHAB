package com.hackaboss;

public class ExploradorDirectorio {

    Directorio directorio = new Directorio();

    public void explorarDirectorio(Directorio directorio) {
        System.out.println(directorio.getNombre());
        for(Directorio directorioHijo : directorio.getSubdirectorios()) {
            explorarDirectorio(directorioHijo);
        }
    }
}
