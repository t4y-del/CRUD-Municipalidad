
package com.mycompany.municipalidad.igu;

import com.mycompany.municipalidad.logica.Controladora;
import com.mycompany.municipalidad.logica.Individuo;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class BuscadorGui extends javax.swing.JFrame {
    
    Controladora control = new Controladora(); //agrego la instancia de la controladora para acceder a los metodos de la controladora (Osea la logica)

    public BuscadorGui() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaIndividuos = new javax.swing.JTable();
        salirButton = new javax.swing.JButton();
        eliminarButton1 = new javax.swing.JButton();
        modifButton = new javax.swing.JButton();
        RefreshButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("CONSULTA PERIFLES");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaIndividuos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaIndividuos);

        salirButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        salirButton.setText("SALIR");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        eliminarButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        eliminarButton1.setText("ELIMINAR");
        eliminarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButton1ActionPerformed(evt);
            }
        });

        modifButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        modifButton.setText("MODIFICAR");
        modifButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifButtonActionPerformed(evt);
            }
        });

        RefreshButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        RefreshButton2.setText("ACTUALIZAR");
        RefreshButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eliminarButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(RefreshButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(eliminarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(modifButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(RefreshButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
    //PARA REUTILIZAR CODIGO//

        cargarTabla();


    }//GEN-LAST:event_formWindowOpened

    private void eliminarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButton1ActionPerformed
        
        //CONTROL DE QUE LA TABLA NO ESTE VACIA 
        if (tablaIndividuos.getRowCount() > 0 ){
            //Valido que se haya seleccionado un registro
            if (tablaIndividuos.getSelectedRow()!=-1){
                
                //(si detecta que la tabla no esta vacia) Obtengo la id del Individuo para borrar
                //Convierto el id en tipo string y luego en tipo entero
                int Id = Integer.parseInt(String.valueOf(tablaIndividuos.getValueAt(tablaIndividuos.getSelectedRow(), 0)));
                
                //se envia a la logica
                control.borrarIndiv(Id);
                cargarTabla();
                mostrarMensaje("Individuo Eliminado Correctamente!","info","Borrado exitoso");
                this.dispose();
                BuscadorGui buscador = new BuscadorGui();
                buscador.setVisible(true);
                buscador.setLocationRelativeTo(null);
    

            
            }
            else{
                mostrarMensaje("No selecciono un Registro para Eliminar","Error","Error al eliminar!");
            }
        }
        
        else {
            mostrarMensaje("La tabla esta vacia","Error","Error al eliminar");
            cargarTabla();

        }
    }          
        
        
    public void mostrarMensaje (String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if (tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        

   
        
        
    
            
            
    }//GEN-LAST:event_eliminarButton1ActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
    this.dispose();
    BuscadorGui buscador = new BuscadorGui();
    buscador.setVisible(true);
    buscador.setLocationRelativeTo(null);
    

        
    }//GEN-LAST:event_salirButtonActionPerformed

    private void modifButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifButtonActionPerformed

        //CONTROL DE QUE LA TABLA NO ESTE VACIA 
        if (tablaIndividuos.getRowCount() > 0 ){
            //Valido que se haya seleccionado un registro
            if (tablaIndividuos.getSelectedRow()!=-1){

         
    //Codigo del modificar
            //TOMO EL ID QUE DESEO MODIFICAR
            int Id = Integer.parseInt(String.valueOf(tablaIndividuos.getValueAt(tablaIndividuos.getSelectedRow(), 0)));
            
            ModifIndiv modif = new ModifIndiv(Id);
            modif.setVisible(true);
            modif.setLocationRelativeTo(null);
            
            this.dispose();
            
            
            }
            else{
                mostrarMensaje("No selecciono un Registro para Modificar","Error","Error al modificar!");
            }
        }
        
        else {
            mostrarMensaje("La tabla esta vacia","Error","Error al modificar");
            cargarTabla();

        }
                
               
    }//GEN-LAST:event_modifButtonActionPerformed

    private void RefreshButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RefreshButton2;
    private javax.swing.JButton eliminarButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifButton;
    private javax.swing.JButton salirButton;
    private javax.swing.JTable tablaIndividuos;
    // End of variables declaration//GEN-END:variables

    
    
    private void cargarTabla() {
    
        /*HACEMOS QUE LA TABLA NO SEA EDITABLE*/
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            @Override /*sobrescribe el modelo por defecto que haya (en este caso el de defaulttablemodel, pone todo en null)*/
            public boolean isCellEditable(int row, int column) {
                return false;
            }        
        };
    
        
        /* PONEMOS TITULOS A LAS COLUMNAS*/
        String titulos[] = {"Id","Nombre","Legajo","Demandante","Monto","Fecha"};
        modeloTabla.setColumnIdentifiers(titulos);
        
       
        //Traer los individuos desde la base de datos
        List <Individuo> listaIndividuos = control.traerIndividuos();             // acabo de crear un metodo en Controladora.java para traer individuos
        
        //seteamos los datos en la tabla
        if (listaIndividuos.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            for (Individuo individuo : listaIndividuos) {
                modeloTabla.addRow(new Object[]{individuo.getId(), individuo.getNombre(), individuo.getLegajo(), individuo.getDemandante(), individuo.getMonto(), individuo.getFecha()});
                
        }
        
        
        
        
        
        tablaIndividuos.setModel(modeloTabla);

        
                
    }
    
}
    
}
    
