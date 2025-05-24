import java.util.List;

public class UserInterfaceBiblioteca {
    //simula la clase business
    //todo lo que el usuario debe y puede interactuar
    private LibroDAO libroDAO;
    
    public UserInterfaceBiblioteca(LibroDAO libroDAO) {
        this.libroDAO = libroDAO;
    }

    public void mostrarTodosLosLibros() {
        List<Libro> libros = libroDAO.obtenerTodos();
        libros.forEach(System.out::println);
    }

    public void registrarNuevoLibro(int id, String titulo, String autor) {
        Libro nuevo = new Libro(id, titulo, autor);
        libroDAO.guardarLibro(nuevo);
        System.out.println("Libro guardado: " + nuevo);
    }

    public void eliminarLibro(int id) {
        libroDAO.eliminarLibro(id);
        System.out.println("Libro con ID " + id + " eliminado.");
    }
}
