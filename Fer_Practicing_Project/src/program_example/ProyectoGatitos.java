package program_example;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Excepción personalizada
class VacunaException extends Exception {
    public VacunaException(String mensaje) {
        super(mensaje);
    }
}

// Clase abstracta Animal
abstract class Animal {
    private String nombre;
    private double peso;
    private LocalDate fechaNacimiento;

    public Animal(String nombre, double peso, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract void mostrarInfo();

    // Getters y setters
    public String getNombre() { return nombre; }
    public double getPeso() { return peso; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
}

// Clase Gato que hereda de Animal
class Gato extends Animal {
    private boolean estadoVacunacion;
    private Persona personaResponsable;

    public Gato(String nombre, double peso, LocalDate fechaNacimiento, Persona personaResponsable) {
        super(nombre, peso, fechaNacimiento);
        this.estadoVacunacion = false;
        this.personaResponsable = personaResponsable;
    }

    public void vacunar() throws VacunaException {
        if (LocalDate.now().isBefore(getFechaNacimiento().plusMonths(3))) {
            throw new VacunaException("El gato es menor de 3 meses y no puede ser vacunado.");
        }
        this.estadoVacunacion = true;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Gato: " + getNombre() + ", Peso: " + getPeso() + ", Vacunado: " + estadoVacunacion);
    }

    // Getters y setters
    public boolean isEstadoVacunacion() { return estadoVacunacion; }
    public Persona getPersonaResponsable() { return personaResponsable; }
}

// Clase Persona
class Persona {
    private String nombre;
    private String dni;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String dni, String direccion, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
}

// Clase principal con el menú interactivo
public class ProyectoGatitos {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar gato");
            System.out.println("2. Vacunar gato");
            System.out.println("3. Mostrar gatos no vacunados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del gato: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Peso del gato: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
                    System.out.print("Nombre del responsable: ");
                    String nombreResponsable = scanner.nextLine();
                    System.out.print("DNI del responsable: ");
                    String dni = scanner.nextLine();
                    System.out.print("Dirección del responsable: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Teléfono del responsable: ");
                    String telefono = scanner.nextLine();

                    Persona responsable = new Persona(nombreResponsable, dni, direccion, telefono);
                    Gato gato = new Gato(nombre, peso, fechaNacimiento, responsable);
                    gatos.add(gato);
                    System.out.println("Gato registrado con éxito.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del gato a vacunar: ");
                    String nombreVacunar = scanner.nextLine();
                    Gato gatoAVacunar = gatos.stream()
                            .filter(g -> g.getNombre().equals(nombreVacunar))
                            .findFirst()
                            .orElse(null);

                    if (gatoAVacunar != null) {
                        try {
                            gatoAVacunar.vacunar();
                            System.out.println("Gato vacunado con éxito.");
                        } catch (VacunaException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Gato no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Gatos no vacunados:");
                    gatos.stream()
                            .filter(g -> !g.isEstadoVacunacion())
                            .forEach(Gato::mostrarInfo);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}