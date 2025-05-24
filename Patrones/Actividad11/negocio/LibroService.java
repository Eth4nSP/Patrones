package Patrones.Patrones.Actividad11.negocio;

import Patrones.Patrones.Actividad11.acceso.LibroDAO;
import Patrones.Patrones.Actividad11.negocio.chain.ManejadorLibro;
import java.util.List;

public class LibroService {
    private LibroDAO dao;
    private ManejadorLibro manejador;

    public LibroService(LibroDAO dao) {
        this.dao = dao;
    }

    public void setManejador(ManejadorLibro manejador) {
        this.manejador = manejador;
    }

    public void registrarLibro(Libro libro) {
        if (manejador != null) {
            manejador.manejar(libro);
        }
        dao.guardarLibro(libro);
    }

    public List<Libro> obtenerTodos() {
        return dao.obtenerTodos();
    }

    public void eliminarLibro(int id) {
        dao.eliminarLibro(id);
    }
}
