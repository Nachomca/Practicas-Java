/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import modelo.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class PanelAltasAnalista extends javax.swing.JPanel {

    private Lista <Empleado> lista;
    ArrayList<Empleado> aux;
    
    /**
     * Creates new form PanelAltasAnalista
     */
    public PanelAltasAnalista() {
        initComponents();
    }

    public void actualizarLista(Lista <Empleado> lista)
    {
        this.lista = lista;
    }
    
    public void actualizarArray(ArrayList <Empleado> aux)
    {
        this.aux = aux;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNumero = new javax.swing.JLabel();
        jTextFecha = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextSueldo = new javax.swing.JTextField();
        ButtonAceptar = new javax.swing.JButton();
        jTextNumero = new javax.swing.JTextField();
        jTextNombre = new javax.swing.JTextField();
        ButtonCancelar = new javax.swing.JButton();
        jLabelFecha = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSueldo = new javax.swing.JLabel();
        jLabelPlus = new javax.swing.JLabel();
        jTextPlus = new javax.swing.JTextField();
        jLabelConducta = new javax.swing.JLabel();
        jTextConducta = new javax.swing.JTextField();

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNumero.setText("Número:");

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");

        ButtonAceptar.setText("Aceptar");
        ButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptarActionPerformed(evt);
            }
        });

        ButtonCancelar.setText("Borrar todo");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        jLabelFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelFecha.setText("Fecha Alta:");

        jLabelTitulo.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Alta de Analista");

        jLabelSueldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSueldo.setText("Sueldo:");

        jLabelPlus.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelPlus.setText("Plus Anual");

        jLabelConducta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelConducta.setText("Conducta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButtonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonAceptar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPlus)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelSueldo)
                                .addComponent(jLabelConducta)))
                        .addGap(237, 237, 237)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextConducta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNumero))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFecha)
                            .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSueldo))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConducta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextConducta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPlus))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAceptar)
                    .addComponent(ButtonCancelar))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean comprobarFecha(){
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String strDate = jTextFecha.getText();
       
        if (strDate.trim().equals(""))
	{
	    return false;
	}
	/* Date is not 'null' */
	else
	{
	    /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
	    sdfrmt.setLenient(false);
	    /* Create Date object
	     * parse the string into date 
             */
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	    }
	    /* Date format is invalid */
	    catch (ParseException e)
	    {
	        return false;
	    }
	    /* Return true if date format is valid */
	    return true;
	}

        
    }
    
    private boolean comprobarSueldo(){
        
        
        try{
            float n = Float.parseFloat(jTextSueldo.getText());
            float m = Float.parseFloat(jTextPlus.getText());
            
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    
    private boolean comprobarNumero(){
        try{
            int n = Integer.parseInt(jTextNumero.getText());
            
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    
    private void ButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceptarActionPerformed
        // TODO add your handling code here:
        Analista ana;
        int bandera = 0;

        /*if(jTextNombre.getText() != "" && jTextFecha.getText() != "" && jTextMinutos.getText() != "" && jTextSueldo.getText() != "")
        {*/
            
                //do{
                    //bandera = 0;
                    try{
                        
                        if(!comprobarSueldo())
                            throw new ControlException("");
                        
                        float sueldo = Float.parseFloat(jTextSueldo.getText());
                        float plus = Float.parseFloat(jTextPlus.getText());

                        try{
                            try{
                                if(Float.parseFloat(jTextSueldo.getText()) > Empleado.getSueldoMax())
                                        throw new Control("");

                                    if(!comprobarFecha())
                                        throw new ControlException("");
                                try{
                                
                                    if(!comprobarNumero())
                                        throw new ControlException(""); 

                                    ana = new Analista(Integer.parseInt(jTextNumero.getText()),jTextNombre.getText(),sueldo,jTextFecha.getText(), plus, jTextConducta.getText());

                                    lista.crearNodo(ana, ana.getNumero());
                                    aux.add(ana);

                                    JFrame frame = new JFrame();
                                    JOptionPane.showMessageDialog(frame, "Alta de jugador realizada correctamente.");

                                    jTextNombre.setText("");
                                    jTextFecha.setText("");
                                    jTextNumero.setText("");
                                    jTextSueldo.setText("");
                                    jTextPlus.setText("");
                                    jTextConducta.setText("");
                                    
                                }catch(ControlException e){
                                    ControlException ex = new ControlException("int");
                                    jTextNumero.setText("");
                                }    
                            }catch(ControlException e){
                                ControlException ex = new ControlException("fecha");
                                jTextFecha.setText("");
                                //bandera = 1;
                            }
                            
                        }catch(Control e){
                           Control ex = new Control("sueldo");
                           jTextSueldo.setText("");
                           //bandera = 1; 
                        }
                        
                        //ana.sueldo = Float.parseFloat(jTextSueldo.getText());
                    }catch(ControlException e)
                    {
                        ControlException ex = new ControlException("float");
                        jTextSueldo.setText("");
                       // bandera = 1;
                    }

                //}while(bandera == 1);
          
                
                
                

                

            

            

            //}else
        //{
            //    JFrame frame = new JFrame();
            //    JOptionPane.showMessageDialog(frame, "Debe rellenar todos los campos.\nIntentalo de nuevo.");
            //}
    }//GEN-LAST:event_ButtonAceptarActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        // TODO add your handling code here:
        jTextNombre.setText("");
        jTextFecha.setText("");
        jTextNumero.setText("");
        jTextSueldo.setText("");
        jTextPlus.setText("");
        jTextConducta.setText("");
        jTextNumero.requestFocus();
    }//GEN-LAST:event_ButtonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAceptar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JLabel jLabelConducta;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPlus;
    private javax.swing.JLabel jLabelSueldo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextConducta;
    private javax.swing.JTextField jTextFecha;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextPlus;
    private javax.swing.JTextField jTextSueldo;
    // End of variables declaration//GEN-END:variables
}
