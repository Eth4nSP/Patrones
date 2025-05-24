package Patrones.Patrones.Actividad11.acceso;

import Patrones.Patrones.Actividad11.negocio.Libro;
import java.util.List;

public interface LibroDAO {
    Libro obtenerLibro(int id);
    List<Libro> obtenerTodos();
    void guardarLibro(Libro libro);
    void eliminarLibro(int id);
}
