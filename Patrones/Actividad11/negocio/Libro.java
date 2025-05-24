package Patrones.Patrones.Actividad11.negocio;

public class Libro {
    private int id;
    private String titulo;
    private String autor;

    private Libro(Builder builder) {
        this.id = builder.id;
        this.titulo = builder.titulo;
        this.autor = builder.autor;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }

    @Override
    public String toString() {
        return "Libro[id: " + id + ", titulo: " + titulo + ", autor: " + autor + "]";
    }

    public static class Builder {
        private int id;
        private String titulo;
        private String autor;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setTitulo(String titulo) {
            this.titulo = titulo;
            return this;
        }

        public Builder setAutor(String autor) {
            this.autor = autor;
            return this;
        }

        public Libro build() {
            return new Libro(this);
        }
    }
}
