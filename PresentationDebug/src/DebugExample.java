import java.util.InputMismatchException;
import java.util.Scanner;

public class DebugExample {

    public static void explainDebugging() {
        System.out.println("""
                \nEste programa te ayudará a entender cómo depurar un código que verifica si un número es primo.
                En matemáticas, un número primo es un número natural mayor que 1,
                que tiene únicamente dos divisores positivos distintos: él mismo y el 1.
                El número 1, por convenio, no se considera primo.
                """);
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean isPrime = false;

        do {
            try {
                System.out.println("Escoge un número: ");
                number = scanner.nextInt();

                if (number > 1) {
                    isPrime = checkPrime(number);

                    if (!isPrime) {
                        System.out.println("¡Intenta nuevamente!");
                    }
                } else {
                    System.out.println("El número debe ser mayor que 1.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número válido.");
                scanner.next();
            }

        } while (!isPrime);

        System.out.println("¡Correcto! El número " + number + " es primo.");
    }

    private static boolean checkPrime(int number) {
        boolean isPrime = true;
        int i = 2;

        while (isPrime && i < number) {
            
            if (number % i == 0) {
                System.out.println("El número " + number + " es divisible por " + i + ". Por lo tanto, no es primo.");
                isPrime = false;
            }
            i++;
        }

        if (isPrime) {
            System.out.println("No se encontraron divisores entre 1 y " + number + ", por lo tanto, ¿qué podemos concluir?");
        }

        return isPrime;
    }

}