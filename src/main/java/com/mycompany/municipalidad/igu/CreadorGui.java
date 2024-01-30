
package com.mycompany.municipalidad.igu;

import com.mycompany.municipalidad.logica.Controladora;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class CreadorGui extends javax.swing.JFrame {

    Controladora control = new Controladora(); //instancia de controladora
    
    public CreadorGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreLabel = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        crearButton = new javax.swing.JButton();
        crearLabel = new javax.swing.JLabel();
        legajoLabel1 = new javax.swing.JLabel();
        legajoTextField1 = new javax.swing.JTextField();
        salirButton = new javax.swing.JButton();
        limpiarButton1 = new javax.swing.JButton();
        nombreLabel1 = new javax.swing.JLabel();
        demandanteTextField1 = new javax.swing.JTextField();
        legajoLabel2 = new javax.swing.JLabel();
        montoTextField2 = new javax.swing.JTextField();
        fechaLabel = new javax.swing.JLabel();
        fechaTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombreLabel.setText("Nombre");

        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        crearButton.setText("Crear");
        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButtonActionPerformed(evt);
            }
        });

        crearLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        crearLabel.setText("Crear perfil");

        legajoLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        legajoLabel1.setText("Legajo");

        legajoTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legajoTextField1ActionPerformed(evt);
            }
        });

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        limpiarButton1.setText("Limpiar");
        limpiarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarButton1ActionPerformed(evt);
            }
        });

        nombreLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombreLabel1.setText("Demandante");

        demandanteTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demandanteTextField1ActionPerformed(evt);
            }
        });

        legajoLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        legajoLabel2.setText("Monto");

        montoTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoTextField2ActionPerformed(evt);
            }
        });

        fechaLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fechaLabel.setText("Fecha");

        fechaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(crearLabel)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(limpiarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(legajoLabel1)
                            .addComponent(nombreLabel))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(legajoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(legajoLabel2)
                            .addComponent(nombreLabel1)
                            .addComponent(fechaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(demandanteTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(montoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(crearLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(legajoTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legajoLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel1)
                    .addComponent(demandanteTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montoTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(legajoLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaLabel))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed
    String nombre = nombreTextField.getText(); //GUARDA EL CAMPO DE TEXTO EN LA VARIABLE NOMBRE 
    int legajo = Integer.parseInt(legajoTextField1.getText()); // GUARDA LO DEL CAMPO DEL TEXTO EN LA VARIABLE LEGAJO Y LO PASO A STRING 
    String demandante = demandanteTextField1.getText();
    int monto = Integer.parseInt(montoTextField2.getText());
    String fecha = fechaTextField.getText();


    mostrarMensaje("Individuo generado Correctamente!","info","Creacion exitosa");


    
    
    
        control.crearIndividuo(nombre, legajo, demandante, monto, fecha); // PASA LOS DATOS DE LAS VARIBALES A LA CONTROLADORA, LA CONTROLADORA MEDIAMNTE CREAR INDIVIDUO CREA EL OBJETO.
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

    
    
    
    }//GEN-LAST:event_crearButtonActionPerformed

    private void legajoTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legajoTextField1ActionPerformed

    }//GEN-LAST:event_legajoTextField1ActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirButtonActionPerformed

    private void limpiarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarButton1ActionPerformed

        nombreTextField.setText("");
        legajoTextField1.setText("");
        demandanteTextField1.setText("");
        montoTextField2.setText("");
        fechaTextField.setText("");

    }//GEN-LAST:event_limpiarButton1ActionPerformed

    private void demandanteTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demandanteTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_demandanteTextField1ActionPerformed

    private void montoTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoTextField2ActionPerformed

    private void fechaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTextFieldActionPerformed
    }//GEN-LAST:event_fechaTextFieldActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearButton;
    private javax.swing.JLabel crearLabel;
    private javax.swing.JTextField demandanteTextField1;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JTextField fechaTextField;
    private javax.swing.JLabel legajoLabel1;
    private javax.swing.JLabel legajoLabel2;
    private javax.swing.JTextField legajoTextField1;
    private javax.swing.JButton limpiarButton1;
    private javax.swing.JTextField montoTextField2;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel nombreLabel1;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
}
