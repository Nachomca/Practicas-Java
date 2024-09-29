package p02;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author Nacho
 */

public class Principal extends JFrame {
    
    //DECLARACION JBUTTON
    //Botones para listar
    JButton anterior;
    JButton siguiente;
    JButton nuevo;
    //Botones para añadir
    JButton atras;
    JButton añadir;
    
    //DECLARACION JLABEL
    JLabel nombreLabel;
    JLabel sueldoLabel;
    JLabel fechaLabel;
    JLabel sueldoMaxLabel;
    
    //DECLARACION TEXTFIELD
    TextField nombretxt;
    TextField sueldotxt;
    TextField fechatxt;
    TextField sueldoMaxtxt;
    
    private boolean focusIsSet = false;
    
    public Principal()
    {
        super("Lista de Empleados"); //TITULO Y CREACION DE INTERFAZ               
        
        //INICIACION BOTONES
        //Botones principales
        anterior = new JButton("Anterior");
        nuevo = new JButton("Nuevo");
        siguiente = new JButton("Siguiente");
        //Botones secundarios
        atras = new JButton("Atrás");
        añadir = new JButton("Añadir"); 
        
        //INICIACION JLABEL
        nombreLabel = new JLabel("Nombre:");
        sueldoLabel = new JLabel("Sueldo:");
        fechaLabel = new JLabel("Fecha:");
        sueldoMaxLabel = new JLabel("Sueldo Máximo:");
        
        //INICIACION TEXTFIELD
        nombretxt = new TextField();
        sueldotxt = new TextField();
        fechatxt = new TextField();
        sueldoMaxtxt = new TextField();
        
        
        //ORDENAR LOS ELEMENTOS DE LA INTERFAZ
        //PARTE IZQUIERDA
        JPanel labelPane = new JPanel();
        labelPane.setLayout(new GridLayout(0, 1));
        labelPane.add(nombreLabel);
        labelPane.add(fechaLabel);
        labelPane.add(sueldoLabel);
        labelPane.add(sueldoMaxLabel);
        labelPane.add(anterior);

        //PARTE DERECHA
        JPanel fieldPane = new JPanel();
        fieldPane.setLayout(new GridLayout(0, 1));
        fieldPane.add(nombretxt);
        fieldPane.add(fechatxt);
        fieldPane.add(sueldotxt);
        fieldPane.add(sueldoMaxtxt);
        fieldPane.add(siguiente);
        
        //PARTE ABAJO
        //Botones para listar
        JPanel ButtonsPane = new JPanel();
        ButtonsPane.setLayout(new BorderLayout());
        ButtonsPane.add(anterior, BorderLayout.WEST);
        ButtonsPane.add(nuevo, BorderLayout.CENTER);
        ButtonsPane.add(siguiente, BorderLayout.EAST);    
        //Botones para añadir
        JPanel ButtonsPaneNuevo = new JPanel();
        ButtonsPaneNuevo.setLayout(new BorderLayout());
        ButtonsPaneNuevo.add(atras, BorderLayout.WEST);
        ButtonsPaneNuevo.add(añadir, BorderLayout.EAST);

        //LOS PANELES ANTERIORES A SU VEZ EN UNO SUPERIOR
        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        contentPane.setLayout(new BorderLayout());
        contentPane.add(labelPane, BorderLayout.CENTER);
        contentPane.add(fieldPane, BorderLayout.EAST);
        contentPane.add(ButtonsPane, BorderLayout.SOUTH);

        setContentPane(contentPane);
        
        
        //ACTIONES DE LOS BOTONES
        anterior.addActionListener //LO QUE HACE EL BOTON ANTERIOR
        (new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                Empleado.anterior();
                nombretxt.setText(Empleado.getNombre());
                nombretxt.setEditable(false);
                fechatxt.setText(Empleado.getFecha());
                fechatxt.setEditable(false);
                sueldotxt.setText(String.valueOf(Empleado.getSueldo()) + " €");
                sueldotxt.setEditable(false);
                sueldoMaxtxt.setText(String.valueOf(Empleado.getSueldoMaximo()) + " €");
                sueldoMaxtxt.setEditable(false);
                
                if(Empleado.principio())
                    anterior.setEnabled(false);
                siguiente.setEnabled(true);
            }
        }
        );
        
        nuevo.addActionListener //LO QUE HACE EL BOTON NUEVO
        (new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //SE QUITAN ESTOS BOTONES POR LOS OTROS
                contentPane.remove(ButtonsPane);
                contentPane.validate();
                
                contentPane.add(ButtonsPaneNuevo, BorderLayout.SOUTH);
                contentPane.validate();
                
                //FECHA POR EL SISTEMA
                Calendar fechaSistema2 = Calendar.getInstance();
                String fecha = "";
                
                if(fechaSistema2.get(Calendar.DAY_OF_MONTH) < 10)
                {
                    fecha = "0";
                }
                
                fecha = fecha + fechaSistema2.get(Calendar.DAY_OF_MONTH) + "/" + fechaSistema2.get(Calendar.MONTH) + "/" + fechaSistema2.get(Calendar.YEAR);
                fechatxt.setText(fecha);
                
                //TEXTFIELD VACIOS
                nombretxt.setText("");
                nombretxt.setEditable(true);
                fechatxt.setEditable(false);
                sueldotxt.setText("");
                sueldotxt.setEditable(true);
                sueldoMaxtxt.setText("");
                sueldoMaxtxt.setEditable(true);
                                              
            }
        }
        );
        
        siguiente.addActionListener //LO QUE HACE EL BOTON SIGUIENTE
        (new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Empleado.proximo();
                nombretxt.setText(Empleado.getNombre());
                nombretxt.setEditable(false);
                fechatxt.setText(Empleado.getFecha());
                fechatxt.setEditable(false);
                sueldotxt.setText(String.valueOf(Empleado.getSueldo()) + " €");
                sueldotxt.setEditable(false);
                sueldoMaxtxt.setText(String.valueOf(Empleado.getSueldoMaximo()) + " €");
                sueldoMaxtxt.setEditable(false);
                
                if(Empleado.ultimo())
                    siguiente.setEnabled(false);
                anterior.setEnabled(true);
            }
        }
        );
        
        atras.addActionListener
        (new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //SE QUITAN ESTOS BOTONES POR LOS OTROS
                contentPane.remove(ButtonsPaneNuevo);
                contentPane.validate();
                
                contentPane.add(ButtonsPane, BorderLayout.SOUTH);
                contentPane.validate();
                
                //SE VUELVEN A PONER LOS TEXTFIELD RELLENOS 
                nombretxt.setText(Empleado.getNombre());
                nombretxt.setEditable(false);
                fechatxt.setText(Empleado.getFecha());
                fechatxt.setEditable(false);
                sueldotxt.setText(String.valueOf(Empleado.getSueldo()) + " €");
                sueldotxt.setEditable(false);
                sueldoMaxtxt.setText(String.valueOf(Empleado.getSueldoMaximo()) + " €");
                sueldoMaxtxt.setEditable(false);
                
                //MENSAJE DE VALIDACION
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame, "Alta de empleado no realizada.");
            }
        }
        );
        
        añadir.addActionListener
        (new ActionListener()
        {            
            public void actionPerformed(ActionEvent e)
            {
                String nombreAux = nombretxt.getText();

                String sueldoAux = sueldotxt.getText();              

                String fechaAux = fechatxt.getText();

                String sueldoMaxAux = sueldoMaxtxt.getText();
                    
                //AÑADIR UN IF PARA QUE SI ESTAN VACIOS MUESTRE UN FRAME DANDO ERROR
                if(nombretxt.getText().equals("") || sueldotxt.getText().equals("") || sueldoMaxtxt.getText().equals(""))
                {
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Hay que rellenar todos los campos.");
                    
                }else if(Integer.parseInt(sueldoMaxAux) < Integer.parseInt(sueldoAux))
                {
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "El sueldo no puede superar el sueldo máximo.");
                    
                }else{
                    

                    new Empleado(nombreAux, Float.parseFloat(sueldoAux), Integer.parseInt(sueldoMaxAux), fechaAux);

                    //SE QUITAN ESTOS BOTONES POR LOS OTROS
                    contentPane.remove(ButtonsPaneNuevo);
                    contentPane.validate();

                    contentPane.add(ButtonsPane, BorderLayout.SOUTH);
                    contentPane.validate();

                    //SE VUELVEN A PONER LOS TEXTFIELD RELLENOS
                    nombretxt.setText(Empleado.getNombre());
                    nombretxt.setEditable(false);
                    fechatxt.setText(Empleado.getFecha());
                    fechatxt.setEditable(false);
                    sueldotxt.setText(String.valueOf(Empleado.getSueldo()) + " €");
                    sueldotxt.setEditable(false);
                    sueldoMaxtxt.setText(String.valueOf(Empleado.getSueldoMaximo()) + " €");
                    sueldoMaxtxt.setEditable(false);

                    //SE CONTROLA QUE NO SE VUELVA A ACTIVAR EL BOTON ANTERIOR, YA QUE SE INSERTA EL PRIMERO EN LA LISTA
                    anterior.setEnabled(false);
                    siguiente.setEnabled(true);

                    //MENSAJE DE VALIDACION
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "El empleado ha sido añadido correctamente.");
                }
            }
        }
        );
          
    }
   
    public static void main(String[] args) {
        
        final Principal app = new Principal();
        
        new Empleado("Pepe", 1300, 1500, "11/11/1111");
        new Empleado("Rocio", 1700, 2000, "11/11/1111");
        new Empleado("Juan", 900, 2000, "11/11/1111");
        new Empleado("Lola", 1100, 1500, "11/11/1111");
        
        app.anterior.setEnabled(false);
        app.nombretxt.setText(Empleado.getNombre());
        app.nombretxt.setEditable(false);
        app.fechatxt.setText(Empleado.getFecha());
        app.fechatxt.setEditable(false);
        app.sueldotxt.setText(String.valueOf(Empleado.getSueldo()) + " €");
        app.sueldotxt.setEditable(false);
        app.sueldoMaxtxt.setText(String.valueOf(Empleado.getSueldoMaximo()) + " €");
        app.sueldoMaxtxt.setEditable(false);
        
        
        app.addWindowListener
        (new WindowAdapter() 
        {
            //SI SE CIERRA VENTANA
            public void windowClosing(WindowEvent e) 
            {
                System.exit(0);
            }
            
            //DONDE QUEREMOS SITUAR EL FOCO PARA ESCRIBIR
            public void windowActivated(WindowEvent e) 
            {
                app.setFocus();
            }

        }
        );
        
        app.pack();
        app.setLocationRelativeTo(null); //PARA COLOCAR LA APLICACION EN EL CENTRO DE LA PANTALLA
        app.setVisible(true);
        
    }
    
    //FOCO INICIADO EN EL TITULO
    private void setFocus() {
        if (!focusIsSet) {
            nombretxt.requestFocus();
            focusIsSet = true;
        }
    }
    
}
