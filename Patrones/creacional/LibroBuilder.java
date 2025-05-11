public class LibroBuilder implements Builder {
    private Libro libro;

    public LibroBuilder() {
        this.libro = new Libro();
    }
    //Sobreescritura de los datos del builder
    //usando la clase libro como clase base
    @Override
    public void buildPart1() {
        libro.setTitulo("El Arte de Programar");
    }

    @Override
    public void buildPart2() {
        libro.setAutor("Donald Knuth");
    }

    @Override
    public Libro buildProduct() {
        return libro;
    }
}
