package Patrones.Patrones.Actividad11.negocio.chain;

import Patrones.Patrones.Actividad11.negocio.Libro;

public abstract class ManejadorLibro {
    protected ManejadorLibro siguiente;

    public void setSiguiente(ManejadorLibro siguiente) {
        this.siguiente = siguiente;
    }

    public void manejar(Libro libro) {
        procesar(libro);
        if (siguiente != null) {
            siguiente.manejar(libro);
        }
    }

    protected abstract void procesar(Libro libro);
}

