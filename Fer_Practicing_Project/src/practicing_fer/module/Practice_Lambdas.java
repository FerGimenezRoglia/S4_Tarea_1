package practicing_fer.module;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Practice_Lambdas {

    public static void practicingLambdasBases() {

        Greeting greeting = (name) -> System.out.println("Hello " + name);
        greeting.sayHello("Fer");

        // Creamos un Predicate que verifica si una cadena es mayor a 5 caracteres
        Predicate<String> isLongerThanFive = (text) -> text.length() > 5;
        // Probamos el Predicate
        System.out.println(isLongerThanFive.test("Hello")); // Salida: false
        System.out.println(isLongerThanFive.test("Hello, World!")); // Salida: true
        // Probamos el Predicate -> Fer
        boolean test = isLongerThanFive.test("Aldebaran");
        System.out.println(test);

        // Creamos un Function que convierte una cadena a su longitud
        Function<String, Integer> stringLength = (text) -> text.length();
        // Probamos el Predicate -> Fer
        int textLength = stringLength.apply("Aldebaran");
        System.out.println(textLength);

        List<String> names = Arrays.asList("Fer", "Olga", "Norma");
        // Lambda para imprimir cada elemento
        names.forEach(name -> System.out.println(name));
        // Referencia a un método de instancia de un objeto arbitrario
        names.forEach(System.out::println);


    }

    public static void practicingLambdasStreams() {

        System.out.println("\n* Creamos un streams e imprimimos la lista");

        List<String> names = Arrays.asList("Fer", "Ana", "Luis", "Alejandra");
        // Crear un Stream
        names.stream().forEach(System.out::println);

        System.out.println("\n* Usamos filter para seleccionar nombres que empiezan con \"A\" ");

        names.stream()
                .filter(name -> name.startsWith("A")) // Filtra nombres que empiezan con "A"
                .forEach(System.out::println);       // Imprime los nombres filtrados

        System.out.println("\n* Usamos map para transformar los nombres en mayúsculas");

        names.stream()
                .map(String::toUpperCase) // Convierte cada nombre a mayúsculas
                .forEach(System.out::println); // Imprime cada nombre transformado

        System.out.println("\n* Usamos sorted para ordenar los números");

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        numbers.stream()
                .sorted() // Ordena de menor a mayor
                .forEach(System.out::println); // Imprime cada número

        System.out.println("\n* Usamos reduce para sumar todos los números");
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b); // Combina los números sumándolos

        System.out.println("Suma total: " + sum); // Salida: Suma total: 19

    }

}
