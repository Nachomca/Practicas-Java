/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import Modelo.Empleado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javafx.scene.control.DatePicker;

/**
 *
 * @author alumno
 */
public class PanelJLista extends javax.swing.JPanel {

     private ArrayList <Empleado> list = new ArrayList<Empleado>();
     private ArrayList <Empleado> listaux = new ArrayList<Empleado>();

    /**
     * Creates new form PanelJLista
     */
    public PanelJLista() {
        initComponents();
    }
    
    public void actualizaLista(){
        this.list=AccesoA.rellenaArray();
    }
    
    public void iniciarJList(){
        if(list.isEmpty()){//SI EL ARRAYLIST ESTÁ VACIO
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"AVISO. No hay ningún jugador registrado.");
        }
    }
    
    private DefaultListModel modeloLista(int b)
    {
        if(b == 0)
        {

            DefaultListModel<Empleado> modelo = new DefaultListModel<Empleado>();


            for(int i = 0; i < list.size(); i++ )
            {
                modelo.addElement(list.get(i));
            }
            return modelo;
        }else
        {

            DefaultListModel<Empleado> modelo = new DefaultListModel<Empleado>();


            for(int i = 0; i < listaux.size(); i++ )
            {
                modelo.addElement(listaux.get(i));
            }

            return modelo;
        }
    }
    
    public void rellenaJList(int b)
    {
        if(b == 0)
            jList1.setModel(modeloLista(b));
        else
            jList1.setModel(modeloLista(b));
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        BotonMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        BotonFiltrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jList1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        BotonMostrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonMostrar.setText("Mostrar");
        BotonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JList");

        BotonFiltrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonFiltrar.setText("Filtrar por fechas");
        BotonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione la primera fecha");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Seleccione la segunda fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(BotonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(BotonMostrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(17, 17, 17)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(BotonFiltrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarActionPerformed
        String men;
        Object jlist = jList1.getSelectedValue();

        if(jList1.getSelectedIndex() != -1)
        {
            men = "El elemento seleccionado es: \n" + jlist.toString();
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, men);
        }else
        {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "ERROR. No se ha seleccionado ningún elemento.");
        }
    }//GEN-LAST:event_BotonMostrarActionPerformed

    private void BotonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltrarActionPerformed

        
        if((jCalendar1.getDate().getTime() > jCalendar2.getDate().getTime()) && (jCalendar1.getDate()!=null || jCalendar2.getDate() != null)){
             JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "ERROR.La primera fecha no puede ser mayor que la segunda");

        }
        else{
            SimpleDateFormat sdf1;
            sdf1 = new SimpleDateFormat("yyyy-MM-dd");

            String fecha1 = sdf1.format(jCalendar1.getDate());


            SimpleDateFormat sdf2;
            sdf2 = new SimpleDateFormat("yyyy-MM-dd");

            String fechita2 = sdf2.format(jCalendar2.getDate()); 
            String consulta = "SELECT * FROM empleado where fechaAlta between '" + fecha1 + "' AND '" + fechita2 + "'";
            listaux = AccesoA.filtraArray(consulta);
            rellenaJList(1);
        }
        
        
        
    }//GEN-LAST:event_BotonFiltrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFiltrar;
    private javax.swing.JButton BotonMostrar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
