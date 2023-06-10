
package com.crudnarf.peluqueriacanina.persistencia;

import com.crudnarf.peluqueriacanina.logica.Duenio;
import com.crudnarf.peluqueriacanina.logica.Mascota;
import com.crudnarf.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class ControladoraPersistencia {
   DuenioJpaController duenioJpa = new DuenioJpaController();
   MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        //Crear duenio en BD
      duenioJpa.create(duenio);
      //Crear mascota en BD
      mascotaJpa.create(masco);
      
        JOptionPane optionPane = new JOptionPane("Se guardó correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Guardado exitoso!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
      
      
    }

    public List<Mascota> traerMascotas() {
        return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
       try {
           mascotaJpa.destroy(num_cliente);
       } catch (NonexistentEntityException ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   
    
    
}
