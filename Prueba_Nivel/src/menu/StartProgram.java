package menu;

import model.Ilustracion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StartProgram {
    Scanner scanner = new Scanner(System.in);
    private static List<Ilustracion> ilustraciones = new ArrayList<>();

    public static void start() {
        mostrarIlustraciones();
    }

    private static void filtrarIlustracionesPorTecnica(Scanner scanner) {
        System.out.print("Introduzca técnica pra filtrar ilustración: ");
        String tecnicaFiltro = scanner.nextLine();
        ilustraciones.stream()
                .findAny()
                .ifPresentOrElse(
                        i -> ilustraciones.stream()
                                .filter(il -> il.getTecnica().equalsIgnoreCase(tecnicaFiltro))
                                .forEach(System.out::println),
                        () -> System.out.println("No se encontraron ilustraciones con la técnica especificada."));
    }

    private static void mostrarIlustraciones() {

        if (ilustraciones.isEmpty()) {
            System.out.println("No ilustraciones registradas");

        } else {
            ilustraciones.forEach(System.out::println);
        }
    }
}
