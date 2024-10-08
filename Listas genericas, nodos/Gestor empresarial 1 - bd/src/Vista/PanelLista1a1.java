/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.AccesoA;
import Modelo.Empleado;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class PanelLista1a1 extends javax.swing.JPanel {

    static int num;
    static String apellido;
    
    public PanelLista1a1() {
        initComponents();
        rellenaLista();
        BotAv2.setVisible(false);
        BotRet2.setVisible(false);
    }

    public void rellenaLista(){
        Empleado em = AccesoA.primero();
        num = em.getNumero();
        setJTextField(em);
    }
    
    public void rellenaLista2(){
        Empleado em = AccesoA.primero2(apellido);
        num = em.getNumero();
        setJTextField(em);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotAvanzar = new javax.swing.JButton();
        jLabelNumero = new javax.swing.JLabel();
        jTFSueldo = new javax.swing.JTextField();
        jTextNumero = new javax.swing.JTextField();
        jLabelSueldo = new javax.swing.JLabel();
        jTextSueldoMax = new javax.swing.JTextField();
        jLabelFechaAlta = new javax.swing.JLabel();
        jTextApellido = new javax.swing.JTextField();
        jTFFecha = new javax.swing.JTextField();
        BotRetroceder = new javax.swing.JButton();
        jLabelSueldoMax = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabelFoto = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        BotRet2 = new javax.swing.JButton();
        BotAv2 = new javax.swing.JButton();

        BotAvanzar.setText("Avanzar");
        BotAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAvanzarActionPerformed(evt);
            }
        });

        jLabelNumero.setText("Número:");

        jTextNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumeroActionPerformed(evt);
            }
        });

        jLabelSueldo.setText("Sueldo");
        jLabelSueldo.setToolTipText("");

        jLabelFechaAlta.setText("Fecha de Alta");

        jTFFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFechaActionPerformed(evt);
            }
        });

        BotRetroceder.setText("Retroceder");
        BotRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotRetrocederActionPerformed(evt);
            }
        });

        jLabelSueldoMax.setText("Sueldo Máximo:");

        jLabelApellido.setText("Apellido");

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Lista1 a 1");

        jLabelNombre.setText("Nombre");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un apellido" }));
        jComboBox1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jComboBox1ComponentAdded(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        BotRet2.setText("Retroceder");
        BotRet2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotRet2ActionPerformed(evt);
            }
        });

        BotAv2.setText("Avanzar");
        BotAv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAv2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabelTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(BotRet2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotRetroceder))
                            .addComponent(jLabelSueldoMax, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSueldo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApellido, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFSueldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextSueldoMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelFechaAlta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BotAvanzar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotAv2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNumero)
                        .addGap(365, 365, 365)
                        .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(34, 34, 34)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addComponent(jLabelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSueldo)
                    .addComponent(jTFSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSueldoMax)
                    .addComponent(jTextSueldoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaAlta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotAvanzar)
                        .addComponent(BotAv2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotRetroceder)
                        .addComponent(BotRet2)))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setJTextField(Empleado p){

            
          jTextNumero.setText(String.valueOf(p.getNumero()));
          jTFNombre.setText(p.getNombre());
          jTextApellido.setText(p.getApellido());
          jTFSueldo.setText(String.valueOf(p.getSueldo()));
          jTextSueldoMax.setText(String.valueOf(p.getSueldoMax()));
          jTFFecha.setText(String.valueOf(p.getFechaAlta()));
          ImageIcon icon = new ImageIcon("src/Fotos/"+p.getFoto());
          jLabelFoto.setIcon(icon);
    }
    
    public void iniBotones(){
        BotRetroceder.setEnabled(false);
    }
    
    private void BotAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAvanzarActionPerformed

            Empleado em = AccesoA.Avanzar(num);
            num = em.getNumero();
            setJTextField(em);
            
            if(AccesoA.esUltimo(em))
                BotAvanzar.setEnabled(false);
            
            BotRetroceder.setEnabled(true);


    }//GEN-LAST:event_BotAvanzarActionPerformed

    private void jTextNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNumeroActionPerformed

    private void BotRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotRetrocederActionPerformed
            Empleado em = AccesoA.Retroceder(num);
            num = em.getNumero();
            setJTextField(em);
            
            if(AccesoA.esPrimero(em))
                BotRetroceder.setEnabled(false);
            
            BotAvanzar.setEnabled(true);
            

    }//GEN-LAST:event_BotRetrocederActionPerformed

    private void jTFFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFechaActionPerformed
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        apellido = jComboBox1.getSelectedItem().toString();
        rellenaLista2();
        BotAvanzar.setVisible(false);
        BotRetroceder.setVisible(false);
        BotAv2.setVisible(true);
        BotRet2.setVisible(true);

        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jComboBox1ComponentAdded
        
    }//GEN-LAST:event_jComboBox1ComponentAdded

    private void BotRet2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotRet2ActionPerformed
        Empleado em = AccesoA.Ret2(num,apellido);
            num = em.getNumero();
            setJTextField(em);
            
    }//GEN-LAST:event_BotRet2ActionPerformed

    private void BotAv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAv2ActionPerformed
        Empleado em = AccesoA.Av2(num,apellido);
            num = em.getNumero();
            setJTextField(em);

    }//GEN-LAST:event_BotAv2ActionPerformed
    public  void InicializaComboBox(){
          String [] apellidos = AccesoA.ContarApellidos();
          
          for(int i = 0; i<apellidos.length; i++){
            jComboBox1.addItem(apellidos[i]);
          }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotAv2;
    private javax.swing.JButton BotAvanzar;
    private javax.swing.JButton BotRet2;
    private javax.swing.JButton BotRetroceder;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelFechaAlta;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelSueldo;
    private javax.swing.JLabel jLabelSueldoMax;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTFFecha;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFSueldo;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextSueldoMax;
    // End of variables declaration//GEN-END:variables
}
