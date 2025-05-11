import java.util.List;
//metodos base
public interface LibroDAO {
    Libro obtenerLibro(int id);
    List<Libro> obtenerTodos();
    void guardarLibro(Libro libro);
    void eliminarLibro(int id);
}
