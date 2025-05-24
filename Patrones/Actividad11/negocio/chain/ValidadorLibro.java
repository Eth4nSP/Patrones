package Patrones.Patrones.Actividad11.negocio.chain;

import Patrones.Patrones.Actividad11.negocio.Libro;

public class ValidadorLibro extends ManejadorLibro {
    @Override
    protected void procesar(Libro libro) {
        if (libro.getTitulo() == null || libro.getTitulo().isEmpty()) {
            throw new IllegalArgumentException("⚠️ El título no puede estar vacío.");
        }
        if (libro.getAutor() == null || libro.getAutor().isEmpty()) {
            throw new IllegalArgumentException("⚠️ El autor no puede estar vacío.");
        }
        System.out.println("✅ Validación completada.");
    }
}

