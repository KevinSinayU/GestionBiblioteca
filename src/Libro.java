/**
 *
 * @author ksinay
 */
// Archivo: Libro.java
public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Inicialmente disponible
    }

    // Método para prestar el libro
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
        }
    }

    // Método para devolver el libro
    public void devolver() {
        disponible = true;
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }

    // Método para consultar disponibilidad
    public void consultar_disponibilidad() {
        if (disponible) {
            System.out.println("El libro '" + titulo + "' está disponible para préstamo.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible para préstamo.");
        }
    }
}
