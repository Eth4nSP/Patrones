public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Libro construct() {
        builder.buildPart1(); // Construir el título
        builder.buildPart2(); // Construir el autor
        return builder.buildProduct();
    }
}
