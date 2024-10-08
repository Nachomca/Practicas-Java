/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3.vista;
import practica3.controlador.*;
import practica3.modelo.*;

/**
 *
 * @author alumno
 */
public class Aplicacion extends javax.swing.JFrame {

    Lista lista = new Lista();
    
    /**
     * Creates new form Aplicaion3
     */
    public Aplicacion() {
        //this.pBusFecha = new JPanelBusFecha(pDia, pMes, pAño);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenuAltas = new javax.swing.JMenu();
        SubAltaTitular = new javax.swing.JMenuItem();
        SubAltaSuplente = new javax.swing.JMenuItem();
        jMenuLista = new javax.swing.JMenu();
        SubListaCompleta = new javax.swing.JMenuItem();
        SubListaFecha = new javax.swing.JMenuItem();
        SubListaDato = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        AcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("CLUB DE BALONCESTO");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setText("DEL INSTITUTO ");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel3.setText("IES EL MAJUELO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("PROGRAMA DE CONTROL DE JUGADORES");

        jMenuAltas.setText("Altas");

        SubAltaTitular.setText("Titular");
        SubAltaTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubAltaTitularActionPerformed(evt);
            }
        });
        jMenuAltas.add(SubAltaTitular);

        SubAltaSuplente.setText("Suplente");
        SubAltaSuplente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubAltaSuplenteActionPerformed(evt);
            }
        });
        jMenuAltas.add(SubAltaSuplente);

        jMenuPrincipal.add(jMenuAltas);

        jMenuLista.setText("Listar");
        jMenuLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListaActionPerformed(evt);
            }
        });

        SubListaCompleta.setText("Completa");
        SubListaCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubListaCompletaActionPerformed(evt);
            }
        });
        jMenuLista.add(SubListaCompleta);

        SubListaFecha.setText("Por fecha");
        SubListaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubListaFechaActionPerformed(evt);
            }
        });
        jMenuLista.add(SubListaFecha);

        SubListaDato.setText("Por dato");
        SubListaDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubListaDatoActionPerformed(evt);
            }
        });
        jMenuLista.add(SubListaDato);

        jMenuPrincipal.add(jMenuLista);

        jMenuAyuda.setText("Ayuda");

        AcercaDe.setText("Acerca de");
        AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaDeActionPerformed(evt);
            }
        });
        jMenuAyuda.add(AcercaDe);

        jMenuPrincipal.add(jMenuAyuda);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubAltaTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubAltaTitularActionPerformed
        // TODO add your handling code here:
        this.setContentPane(pAltaT);
        pAltaT.actulizarLista(lista);
        pack();        
    }//GEN-LAST:event_SubAltaTitularActionPerformed

    private void AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaDeActionPerformed
        this.setContentPane(pBienvenida);
        pack();
    }//GEN-LAST:event_AcercaDeActionPerformed

    private void SubAltaSuplenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubAltaSuplenteActionPerformed
        this.setContentPane(pAltaS);
        pAltaS.actulizarLista(lista);
        pack();
    }//GEN-LAST:event_SubAltaSuplenteActionPerformed

    private void jMenuListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListaActionPerformed

    }//GEN-LAST:event_jMenuListaActionPerformed

    private void SubListaCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubListaCompletaActionPerformed
        // TODO add your handling code here:
        this.setContentPane(pLista);
        pLista.actulizarLista(lista); //CADA VEZ QUE SE SELECCIONA EL BOTON PARA ENTRAR EN LA LISTA, SE LE PASA LA LISTA ACTUALIZADA
        
        pLista.iniBotones();
        
        if(!lista.vacia()) //SI LA LISTA NO ESTA VACIA, MUESTRA LOS DATOS DEL PRIMERO
            pLista.setJTextField(lista);
        
        pack();
    }//GEN-LAST:event_SubListaCompletaActionPerformed

    /*private int primeraParte()
    {
        int bandera;
        
        this.setContentPane(pBusFecha);
        pBusFecha.actulizarLista(lista);
        bandera = pBusFecha.pBusFechaOpcion();
        pack();
        
        return bandera;
    }*/
    
    private void SubListaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubListaFechaActionPerformed
        // TODO add your handling code here:
        /*int bandera = primeraParte();
 
        if(bandera == 1)
        {
            System.out.println("entra en opcion 1");
            this.setContentPane(pDia);
            pDia.iniBotones();
            pDia.show(true);
            pack();
        }
        else if(bandera == 2)
        {
            System.out.println("entra en opcion 2");
            this.setContentPane(pMes);
            pMes.iniBotones();
            pMes.show(true);
            pack();
        }
        else if(bandera == 3)
        {
            System.out.println("entra en opcion 3");
            this.setContentPane(pAño);
            pAño.iniBotones();
            pAño.show(false);
            pack();
        }
        System.out.println("sale del if");*/
        
        this.setContentPane(pListaFecha);
        pListaFecha.actulizarLista(lista); //CADA VEZ QUE SE SELECCIONA EL BOTON PARA ENTRAR EN LA LISTA, SE LE PASA LA LISTA ACTUALIZADA
        
        pListaFecha.iniBotones();
        
        pack();
    }//GEN-LAST:event_SubListaFechaActionPerformed

    private void SubListaDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubListaDatoActionPerformed
        // TODO add your handling code here:
        this.setContentPane(pListaDato);
        pListaDato.actulizarLista(lista); //CADA VEZ QUE SE SELECCIONA EL BOTON PARA ENTRAR EN LA LISTA, SE LE PASA LA LISTA ACTUALIZADA
        
        pListaDato.iniBotones();
        
        pack();
    }//GEN-LAST:event_SubListaDatoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }
    
    //METODO CAMBIAR CONTENEDOR

    private practica3.vista.JPanelAltasTitular pAltaT = new JPanelAltasTitular();
    private practica3.vista.JPanelAltasSuplente pAltaS = new JPanelAltasSuplente();
    private practica3.vista.Bienvenida pBienvenida = new Bienvenida();
    private practica3.vista.JPanelLista pLista = new JPanelLista();
    //private practica3.vista.JPanelBusFecha pBusFecha;
    
    /*private practica3.vista.JPanelListaFecha pDia = new JPanelListaFecha();
    private practica3.vista.JPanelListaFecha pMes = new JPanelListaFecha();
    private practica3.vista.JPanelListaFecha pAño = new JPanelListaFecha();*/
    
    private practica3.vista.JPanelListaDato pListaDato = new JPanelListaDato();
    private practica3.vista.JPanelListaFecha pListaFecha = new JPanelListaFecha();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AcercaDe;
    private javax.swing.JMenuItem SubAltaSuplente;
    private javax.swing.JMenuItem SubAltaTitular;
    private javax.swing.JMenuItem SubListaCompleta;
    private javax.swing.JMenuItem SubListaDato;
    private javax.swing.JMenuItem SubListaFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenuAltas;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenu jMenuLista;
    private javax.swing.JMenuBar jMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
