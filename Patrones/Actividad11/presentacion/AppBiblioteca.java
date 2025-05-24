package Patrones.Patrones.Actividad11.presentacion;

import Patrones.Patrones.Actividad11.acceso.LibroDAO;
import Patrones.Patrones.Actividad11.acceso.LibroDAOImpl;
import Patrones.Patrones.Actividad11.negocio.Libro;
import Patrones.Patrones.Actividad11.negocio.LibroService;
import Patrones.Patrones.Actividad11.negocio.chain.ManejadorLibro;
import Patrones.Patrones.Actividad11.negocio.chain.RegistroLibro;
import Patrones.Patrones.Actividad11.negocio.chain.ValidadorLibro;

import java.util.Scanner;

public class AppBiblioteca {
    public static void main(String[] args) {
        LibroDAO dao = new LibroDAOImpl();
        LibroService servicio = new LibroService(dao);

        // Cadena de responsabilidad: validar -> registrar
        ManejadorLibro validador = new ValidadorLibro();
        ManejadorLibro registrador = new RegistroLibro();
        validador.setSiguiente(registrador);
        servicio.setManejador(validador);

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMENÚ BIBLIOTECA ");
            System.out.println("1. Registrar nuevo libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Eliminar un libro por ID");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    try {
                        System.out.print("Ingrese ID del libro: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Ingrese título del libro: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Ingrese autor del libro: ");
                        String autor = scanner.nextLine();

                        Libro libro = new Libro.Builder()
                            .setId(id)
                            .setTitulo(titulo)
                            .setAutor(autor)
                            .build();

                        servicio.registrarLibro(libro);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "2":
                    servicio.obtenerTodos().forEach(System.out::println);
                    break;

                case "3":
                    System.out.print("Ingrese ID del libro a eliminar: ");
                    int eliminarId = Integer.parseInt(scanner.nextLine());
                    servicio.eliminarLibro(eliminarId);
                    System.out.println("Libro eliminado.");
                    break;

                case "4":
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}
