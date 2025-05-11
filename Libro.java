public class Libro {
    //datos basicos de un libro
    private String titulo;
    private String autor;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    //retorno del libro
    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor;
    }
}
