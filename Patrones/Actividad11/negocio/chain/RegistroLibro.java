package Patrones.Patrones.Actividad11.negocio.chain;

import Patrones.Patrones.Actividad11.negocio.Libro;

public class RegistroLibro extends ManejadorLibro {
    @Override
    protected void procesar(Libro libro) {
        System.out.println("📘 Libro registrado correctamente: " + libro);
    }
}
