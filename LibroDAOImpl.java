import java.util.ArrayList;
import java.util.List;

public class LibroDAOImpl implements LibroDAO {
    //iniciar la "base"
    private List<Libro> librosDB = new ArrayList<>();
    //constructor de datos para libros
    public LibroDAOImpl() {
        librosDB.add(new Libro(1, "1984", "George Orwell"));
        librosDB.add(new Libro(2, "Fahrenheit 451", "Ray Bradbury"));
    }
    //sobreescribir la interfaz
    @Override
    public Libro obtenerLibro(int id) {
        return librosDB.stream()
                .filter(libro -> libro.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Libro> obtenerTodos() {
        return new ArrayList<>(librosDB);
    }

    @Override
    public void guardarLibro(Libro libro) {
        librosDB.add(libro);
    }

    @Override
    public void eliminarLibro(int id) {
        librosDB.removeIf(libro -> libro.getId() == id);
    }
}
