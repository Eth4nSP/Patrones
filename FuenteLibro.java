public abstract class FuenteLibro {
    protected FuenteLibro siguiente;

    public void setSiguiente(FuenteLibro siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void buscar(String titulo);
}
