public class Libro {
    private int id;
    private String titulo;
    private String autor;
    //constructor base
    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    //retorno de datos
    public int getId() { 
        return id; 
    }
    public String getTitulo() { 
        return titulo; 
    }
    public String getAutor() { 
        return autor; 
    }
    //set de datos
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }
    public void setAutor(String autor) { 
        this.autor = autor; 
    }

    @Override
    public String toString() {
        return "📖 Libro[id=" + id + ", titulo=" + titulo + ", autor=" + autor + "]";
    }
}
