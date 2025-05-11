public class UsuarioBiblioteca {
    public static void main(String[] args) {
        FuenteLibro fisica = new BibliotecaFisica();
        FuenteLibro digital = new BibliotecaDigital();
        FuenteLibro red = new RedUniversitaria();

        // Armar la cadena
        fisica.setSiguiente(digital);
        digital.setSiguiente(red);

        // Buscar libros
        fisica.buscar("1984");
        System.out.println();
        fisica.buscar("Clean Code");
        System.out.println();
        fisica.buscar("Harry Potter");
    }
}
