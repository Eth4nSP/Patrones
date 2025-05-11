import java.util.List;

public class RedUniversitaria extends FuenteLibro {
    private List<String> libros = List.of("El Arte de la Guerra", "Don Quijote");

    @Override
    public void buscar(String titulo) {
        if (libros.contains(titulo)) {
            System.out.println("El libro '" + titulo + "' se puede solicitar a otra universidad.");
        } else {
            System.out.println("Libro no encontrado en ninguna fuente.");
        }
    }
}
