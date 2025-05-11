import java.util.List;

public class BibliotecaDigital extends FuenteLibro {
    private List<String> libros = List.of("Clean Code", "1984", "The Pragmatic Programmer");

    @Override
    public void buscar(String titulo) {
        if (libros.contains(titulo)) {
            System.out.println("El libro '" + titulo + "' está disponible en la biblioteca digital.");
        } else {
            System.out.println("No está en la biblioteca digital. Reintentando...");
            if (siguiente != null) siguiente.buscar(titulo);
        }
    }
}
