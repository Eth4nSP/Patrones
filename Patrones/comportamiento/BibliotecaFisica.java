import java.util.List;

public class BibliotecaFisica extends FuenteLibro {
    private List<String> libros = List.of("Don Quijote", "1984", "El Principito");

    @Override
    public void buscar(String titulo) {
        if (libros.contains(titulo)) {
            System.out.println("? El libro '" + titulo + "' está disponible en la biblioteca física.");
        } else {
            System.out.println("? No está en la biblioteca física. Reintentando...");
            if (siguiente != null) siguiente.buscar(titulo);
        }
    }
}
