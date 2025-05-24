package Patrones.Patrones.Actividad11.acceso;


import Patrones.Patrones.Actividad11.negocio.Libro;
import java.util.ArrayList;
import java.util.List;

public class LibroDAOImpl implements LibroDAO {
    private List<Libro> librosDB = new ArrayList<>();

    public LibroDAOImpl() {
        librosDB.add(new Libro.Builder().setId(1).setTitulo("1984").setAutor("George Orwell").build());
        librosDB.add(new Libro.Builder().setId(2).setTitulo("Fahrenheit 451").setAutor("Ray Bradbury").build());
    }

    public Libro obtenerLibro(int id) {
        return librosDB.stream().filter(libro -> libro.getId() == id).findFirst().orElse(null);
    }

    public List<Libro> obtenerTodos() {
        return new ArrayList<>(librosDB);
    }

    public void guardarLibro(Libro libro) {
        librosDB.add(libro);
    }

    public void eliminarLibro(int id) {
        librosDB.removeIf(libro -> libro.getId() == id);
    }
}
