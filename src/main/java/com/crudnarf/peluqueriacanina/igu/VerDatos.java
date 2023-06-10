package com.crudnarf.peluqueriacanina.igu;

import com.crudnarf.peluqueriacanina.logica.Controladora;
import com.crudnarf.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerDatos extends javax.swing.JFrame {
Controladora control = new Controladora();
   
    public VerDatos() {
         initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Kalam", 0, 48)); // NOI18N
        jLabel10.setText("Visualización de datos");

        tablaMascotas.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.white));
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel1.setFont(new java.awt.Font("Kalam", 0, 18)); // NOI18N
        jLabel1.setText("Datos de mascotas");

        btnEditar.setFont(new java.awt.Font("Kalam", 0, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon("E:\\DESARROLLO\\PeluqueriaCanina\\asset\\btnEditar.png")); // NOI18N
        btnEditar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnEliminar.setFont(new java.awt.Font("Kalam", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon("E:\\DESARROLLO\\PeluqueriaCanina\\asset\\btnBorrar-Transparente.png")); // NOI18N
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       CargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Buscar el elemento de la tabla que queremos eliminar y lo tiene que identificar!
        //Controlo que la tabla no este vacia
        if(tablaMascotas.getRowCount() > 0){
            //Controlo que se haya seleccionado una mascota
                if(tablaMascotas.getSelectedRow() !=- 1){
                    //Obtengo Id de la mascota a borrar
                    int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                        //LLamo al metodo borrar
                    control.borrarMascota(num_cliente);
                        //Avisar al usuario
                        mostrarMensaje("Mascota eliminada correctamente", "Info", "Borrado de mascota");
                        CargarTabla();
                  }
                        else{
                    mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al eliminar");
                   }
    }//GEN-LAST:event_btnEliminarActionPerformed
                  else{
                        mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
                        }
    }  
      public void mostrarMensaje(String mensaje, String tipo, String titulo){
                             JOptionPane optionPane = new JOptionPane(mensaje);   
                             if(tipo.equals("Info")){
                                 optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
                             }
                             else if (tipo.equals("Error")){
                                 optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
                             }
                             JDialog dialog = optionPane.createDialog(titulo);
                             dialog.setAlwaysOnTop(true);
                             dialog.setVisible(true);
      }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    private void CargarTabla() {
       DefaultTableModel  modeloTabla =new DefaultTableModel(){
       @Override
       public boolean isCellEditable(int row, int column){
       return false;
               }
       };
       //Establecemos nombres de columnas
       String titulos[] = {"Num", "Nombre","Color","Raza","Alergico","At. Especial","Dueño","Cel"}; 
       modeloTabla.setColumnIdentifiers(titulos);
       //Carga de datos desde la BD
       List<Mascota> listaMascotas = control.traerMascotas();
       //Recorrer la lista y mostrar los elementos en la tabla
       if(listaMascotas !=null){
       for(Mascota masco: listaMascotas){
           Object[] objeto ={masco.getNum_cliente(), masco.getNombre(),masco.getColor(),masco.getRaza(),masco.getAlergico(),
           masco.getAtencion_especial(),
           masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCelDuenio()};
           
           modeloTabla.addRow(objeto);
                   }
            }
       //Asignarle a Jtable en el modelo
       tablaMascotas.setModel(modeloTabla);
       
       
    }
}
