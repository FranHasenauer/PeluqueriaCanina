
package com.crudnarf.peluqueriacanina.logica;

import com.crudnarf.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia  controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, 
            String raza, String color, String observaciones, 
            String alergico, String atenEsp, String nombreDuenio, String cel) {
      
        //Creamos duenio y asignamos valores
         Duenio duenio = new Duenio();
         duenio.setNombre(nombreDuenio);
         duenio.setCelDuenio(cel);
         
         //Creamos mascota y asignamos mascotas
         Mascota masco = new Mascota();
         masco.setNombre(nombreMasco);
         masco.setRaza(raza);
         masco.setColor(color);
         masco.setAlergico(alergico);
         masco.setAtencion_especial(atenEsp);
         masco.setObservaciones(observaciones);
         masco.setUnDuenio(duenio);
         
         controlPersis.guardar(duenio,masco);
    }

    public List<Mascota> traerMascotas() {
        return       controlPersis.traerMascotas();

    }

    public void borrarMascota(int num_cliente) {
    controlPersis.borrarMascota(num_cliente);
    }

   
    
    
}
