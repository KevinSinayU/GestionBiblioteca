/**
 *
 * @author ksinay
 */
// Archivo: Main.java
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Libro
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");

        // Consultar disponibilidad
        libro1.consultar_disponibilidad();

        // Intentar prestar el libro
        libro1.prestar();

        // Consultar disponibilidad nuevamente
        libro1.consultar_disponibilidad();

        // Intentar prestar el libro nuevamente
        libro1.prestar();

        // Devolver el libro
        libro1.devolver();

        // Consultar disponibilidad nuevamente
        libro1.consultar_disponibilidad();
    }
}
