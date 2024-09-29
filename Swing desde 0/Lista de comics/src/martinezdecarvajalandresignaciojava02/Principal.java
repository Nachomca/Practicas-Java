//ULTIMA VERSION FINAL AREGLADA
package martinezdecarvajalandresignaciojava02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



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
    JLabel tituloLabel;
    JLabel refLabel;
    JLabel editorialLabel;
    JLabel fechaLabel;
    JLabel precioLabel;
    
    //DECLARACION TEXTFIELD
    TextField titulotxt;
    TextField reftxt;
    TextField editorialtxt;
    TextField fechatxt;
    TextField preciotxt;
    
    private boolean focusIsSet = false;
    
    public Principal()
    {
        super("Lista de Comics"); //TITULO Y CREACION DE INTERFAZ               
        
        //INICIACION BOTONES
        //Botones principales
        anterior = new JButton("Anterior");
        nuevo = new JButton("Nuevo");
        siguiente = new JButton("Siguiente");
        //Botones secundarios
        atras = new JButton("Atrás");
        añadir = new JButton("Añadir"); 
        
        //INICIACION JLABEL
        tituloLabel = new JLabel("Titulo:");
        refLabel = new JLabel("Nº de referencia:");
        editorialLabel = new JLabel("Editorial:");
        fechaLabel = new JLabel("Fecha:");
        precioLabel = new JLabel("Precio:");
        
        //INICIACION TEXTFIELD
        titulotxt = new TextField();
        reftxt = new TextField();
        editorialtxt = new TextField();
        fechatxt = new TextField();
        preciotxt = new TextField();
        
        
        //ORDENAR LOS ELEMENTOS DE LA INTERFAZ
        //PARTE IZQUIERDA
        JPanel labelPane = new JPanel();
        labelPane.setLayout(new GridLayout(0, 1));
        labelPane.add(tituloLabel);
        labelPane.add(fechaLabel);
        labelPane.add(refLabel);
        labelPane.add(editorialLabel);
        labelPane.add(precioLabel);
        labelPane.add(anterior);

        //PARTE DERECHA
        JPanel fieldPane = new JPanel();
        fieldPane.setLayout(new GridLayout(0, 1));
        fieldPane.add(titulotxt);
        fieldPane.add(fechatxt);
        fieldPane.add(reftxt);
        fieldPane.add(editorialtxt);
        fieldPane.add(preciotxt);
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
                Libro.anterior();
                titulotxt.setText(Libro.getNombre());
                titulotxt.setEditable(false);
                fechatxt.setText(Libro.getFecha());
                fechatxt.setEditable(false);
                reftxt.setText(String.valueOf(Libro.getRef()));
                reftxt.setEditable(false);
                editorialtxt.setText(Libro.getEditorial());
                editorialtxt.setEditable(false);
                preciotxt.setText(String.valueOf(Libro.getPrecio()) + " €");
                preciotxt.setEditable(false);
                
                if(Libro.principio())
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
                
                //TEXTFIELD VACIOS
                titulotxt.setText("");
                titulotxt.setEditable(true);
                fechatxt.setText("");
                fechatxt.setEditable(true);
                reftxt.setText("");
                reftxt.setEditable(true);
                editorialtxt.setText("");
                editorialtxt.setEditable(true);
                preciotxt.setText("");
                preciotxt.setEditable(true);
                                              
            }
        }
        );
        
        siguiente.addActionListener //LO QUE HACE EL BOTON SIGUIENTE
        (new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Libro.proximo();
                titulotxt.setText(Libro.getNombre());
                titulotxt.setEditable(false);
                fechatxt.setText(Libro.getFecha());
                fechatxt.setEditable(false);
                reftxt.setText(String.valueOf(Libro.getRef()));
                reftxt.setEditable(false);
                editorialtxt.setText(Libro.getEditorial());
                editorialtxt.setEditable(false);
                preciotxt.setText(String.valueOf(Libro.getPrecio()) + " €");
                preciotxt.setEditable(false);
                
                if(Libro.ultimo())
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
                titulotxt.setText(Libro.getNombre());
                titulotxt.setEditable(false);
                fechatxt.setText(Libro.getFecha());
                fechatxt.setEditable(false);
                reftxt.setText(String.valueOf(Libro.getRef()));
                reftxt.setEditable(false);
                editorialtxt.setText(Libro.getEditorial());
                editorialtxt.setEditable(false);
                preciotxt.setText(String.valueOf(Libro.getPrecio()) + " €");
                preciotxt.setEditable(false);
            }
        }
        );
        
        añadir.addActionListener
        (new ActionListener()
        {            
            public void actionPerformed(ActionEvent e)
            {
                //NOTA: ANTES SE RECOGIAN POR CONSOLA, USANDO LA CLASE LEER CON LA CUAL SE UTILIZA LAS EXCEPCIONES PEDIDAS EN LA ACTIVIDAD.
                //SE HA MEJORADO PARA QUE SE INTRODUZCAN LOS DATOS DESDE LA PROPIA INTERFAZ, PERO ENTONCES CLASE LEER Y CONTROL(EXCEPTIONS) NO SE USA.
                //SE DEJA COMENTADO PARA PODER USARSE AMBAS OPCIONES
                //INTRODUCIMOS DATOS NUEVOS
                //System.out.println("Introduce el nombre del comic nuevo:");
                //String nombreAux = Leer.dato();
                String nombreAux = titulotxt.getText();
                
                //System.out.println("Introduce la referencia:");
                //int refAux = Leer.datoInt();
                String refAux = reftxt.getText();              
                
                //System.out.println("Introduce la editorial:");
                //String editAux = Leer.dato();
                String editAux = editorialtxt.getText();
                
                //System.out.println("Introduce la fecha:");
                //String fechaAux = Leer.dato();
                String fechaAux = fechatxt.getText();
                
                //System.out.println("Introduce el precio:");
                //float precioAux = Leer.datoFloat();
                String precioAux = preciotxt.getText();
                
                new Libro(nombreAux, Integer.parseInt(refAux), editAux, fechaAux, Float.parseFloat(precioAux));
                
                //SE QUITAN ESTOS BOTONES POR LOS OTROS
                contentPane.remove(ButtonsPaneNuevo);
                contentPane.validate();
                
                contentPane.add(ButtonsPane, BorderLayout.SOUTH);
                contentPane.validate();
                
                //SE VUELVEN A PONER LOS TEXTFIELD RELLENOS
                titulotxt.setText(Libro.getNombre());
                titulotxt.setEditable(false);
                fechatxt.setText(Libro.getFecha());
                fechatxt.setEditable(false);
                reftxt.setText(String.valueOf(Libro.getRef()));
                reftxt.setEditable(false);
                editorialtxt.setText(Libro.getEditorial());
                editorialtxt.setEditable(false);
                preciotxt.setText(String.valueOf(Libro.getPrecio()) + " €");
                preciotxt.setEditable(false);
                
                //SE CONTROLA QUE NO SE VUELVA A ACTIVAR EL BOTON ANTERIOR, YA QUE SE INSERTA EL PRIMERO EN LA LISTA
                anterior.setEnabled(false);
                siguiente.setEnabled(true);
            }
        }
        );
          
    }
   
    public static void main(String[] args) {
        
        final Principal app = new Principal();
        
        new Libro("Spiderman", 10, "Panini", "10/10/2021", (float)5.5);
        new Libro("Superman", 9, "Ecc", "11/09/2021", (float)3.5);
        new Libro("Linterna Verde", 8, "Ecc", "12/08/2021", (float)2.75);
        new Libro("Capitan America", 7, "Panini", "13/07/2021", (float)3.25);
        new Libro("Los vengadores", 6, "Panini", "14/06/2021", (float)5.75);
        new Libro("Escuadron Suicida", 5, "Ecc", "15/05/2021", (float)3.75);
        new Libro("La liga de la justicia", 4, "Ecc", "16/04/2021", (float)4.5);
        new Libro("Batman", 3, "Ecc", "17/03/2021", (float)4.25);
        new Libro("Iron Man", 2, "Panini", "18/02/2021", (float)2.75);
        new Libro("Thor", 1, "Panini", "19/01/2021", (float)3.25);
        
        app.anterior.setEnabled(false);
        app.titulotxt.setText(Libro.getNombre());
        app.titulotxt.setEditable(false);
        app.fechatxt.setText(Libro.getFecha());
        app.fechatxt.setEditable(false);
        app.reftxt.setText(String.valueOf(Libro.getRef()));
        app.reftxt.setEditable(false);
        app.editorialtxt.setText(Libro.getEditorial());
        app.editorialtxt.setEditable(false);
        app.preciotxt.setText(String.valueOf(Libro.getPrecio()) + " €");
        app.preciotxt.setEditable(false);
        
        
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
            titulotxt.requestFocus();
            focusIsSet = true;
        }
    }
    
}
