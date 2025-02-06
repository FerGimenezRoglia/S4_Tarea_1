package practicing_fer.module;

import java.util.*;

public class Practice_Collections {

    public static void practicingCollections(){

        // Paso 1: Crear un ArrayList para almacenar los nombres
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Pedir al usuario que ingrese nombres
        System.out.println("Enter names (type 'exit' to stop):");
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
            names.add(input);
        }

        // Paso 3: Mostrar los nombres en la lista
        System.out.println("Names in the list:");
        names.forEach(System.out::println);

        // Paso 4: Eliminar duplicados convirtiendo a HashSet
        Set<String> uniqueNames = new HashSet<>(names);

        // Paso 5: Ordenar los nombres únicos
        List<String> sortedNames = new ArrayList<>(uniqueNames);
        Collections.sort(sortedNames);

        // Paso 6: Mostrar los nombres únicos y ordenados
        System.out.println("Unique names sorted alphabetically:");
        sortedNames.forEach(System.out::println);

    }

    public static void practicingCollections2() {
        // Paso 1: Crear un Map para agrupar nombres por longitud
        Map<Integer, Set<String>> namesByLength = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Paso 2: Pedir al usuario que ingrese nombres
        System.out.println("Enter names (type 'exit' to stop):");
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
            int length = input.length(); // Calcular la longitud del nombre
            namesByLength.putIfAbsent(length, new HashSet<>()); // Crear el conjunto si no existe
            namesByLength.get(length).add(input); // Agregar el nombre al conjunto correspondiente
        }

        // Paso 3: Mostrar nombres agrupados por longitud
        System.out.println("Names grouped by length:");
        namesByLength.forEach((length, names) -> {
            System.out.println("Length " + length + ": " + names);
        });

        // Paso 4: Permitir consultas por longitud
        System.out.println("\nEnter a length to see names (or type 'exit' to stop):");
        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
            try {
                int length = Integer.parseInt(input);
                Set<String> names = namesByLength.get(length);
                if (names != null) {
                    System.out.println("Names with length " + length + ": " + names);
                } else {
                    System.out.println("No names found with length " + length);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }

        System.out.println("Program finished. Goodbye!");
    }
}
