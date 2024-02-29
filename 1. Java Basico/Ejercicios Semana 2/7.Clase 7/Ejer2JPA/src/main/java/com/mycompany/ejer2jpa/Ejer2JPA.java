package com.mycompany.ejer2jpa;

import com.mycompany.ejer2jpa.logica.Controladora;
import com.mycompany.ejer2jpa.logica.Platillo;
import java.util.List;

public class Ejer2JPA {

    public static void main(String[] args) {
        
        Controladora control = new Controladora ();
        
        
             // 1. Creando datos
             
        Platillo platillo1 = new Platillo("Paella", "400g de Arroz bomba, 1kg Pollo,250g Garrofón, 12 Habas tiernas, 1 Tomate, 2 dientes de ajo, Azafrán, 1 cucharadita Pimentón dulce, 1.5l Caldo de pollo, Sal, 1 chorrito Aceite de oliva, 1 Hoja de laurel", 25.0);
        
       control.crearPlatillo(platillo1); 
      
        Platillo platillo2 = new Platillo("Tortilla de patatas", "8 huevos camperos, 1kg patatas para fritura, Aceite de oliva virgen extra, 1 cebolla grande, sal", 15.0);
        control.crearPlatillo(platillo2);
      
        Platillo platillo3 = new Platillo("Empanada Gallega", "500gr Harina, 30g levadura fresca, 1 huevo, sal, 2 cebollas, 1 pimiento verde, 1 pimiento rojo, 300g atún en converva, 15g tomate frito, pimentón, aceite de oliva", 12.0);
        control.crearPlatillo(platillo3);
      
      
        
             // 2. Eliminando datos
        control.borrarPlatillo(2L);
        System.out.println("Platillo borrado correctamente");
             
             
             // 3. Editando datos
        Platillo editarPlatillo = control.buscarPlatillo(1L);
        editarPlatillo.setPrecio(30);
        System.out.println("Platillo editado correctamente");
             
        control.editarPlatillo (editarPlatillo);
        
        
              // 4. Leyendo datos
        List<Platillo> listaPlatillos = control.traerPlatillos();
      
        System.out.println("--------- LISTADO DE PLATILLOS ---------");
        for(Platillo plat: listaPlatillos) {
            System.out.println(plat);
        }
    
    
    }
}
