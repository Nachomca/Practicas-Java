package Clases;

import java.util.HashMap;
import java.util.Map;

public class Libro {
    
    private String nombre;
    private String grupo;
    private int numeroPaginas;
    private String imagen;
    private String fechaPublicacion;

    public Libro(String nombre, String grupo, int numeroPaginas, String imagen, String fechaPublicacion) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.numeroPaginas = numeroPaginas;
        this.imagen = imagen;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getImagen() {
        return imagen;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public static Map<Integer, Libro> obtenerLibros() {
        Map<Integer, Libro> libros = new HashMap<>();

        libros.put(1, new Libro("El Señor de los Anillos", "Fantasía", 1200, "./foto/señor_anillos.png", "23/07/1954"));
        libros.put(2, new Libro("El Camino de los Reyes", "Fantasía", 1000, "./foto/camino_reyes.png", "12/02/2010"));
        libros.put(3, new Libro("El Hobbit", "Fantasía", 300, "./foto/hobbit.png", "05/03/1937"));
        libros.put(4, new Libro("La Paciente Silenciosa", "Misterio", 400, "./foto/paciente_silenciosa.png", "08/09/2019"));
        libros.put(5, new Libro("El Visitante", "Misterio", 600, "./foto/el_visitante.png", "18/02/2018"));

        return libros;
    }
    
}