
import java.util.Scanner;



public class RegistroMatriculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Matrículas");
        System.out.println("----------------------");

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese los apellidos del estudiante: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento del estudiante: ");
        String fechaNacimiento = scanner.nextLine();

        System.out.print("Ingrese el género del estudiante: ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese el número de mensualidades: ");
        int mensualidades = scanner.nextInt();

        System.out.print("Ingrese la nota del estudiante: ");
        double nota = scanner.nextDouble();

        Estudiante estudiante = new Estudiante(nombre, apellidos, fechaNacimiento, genero, mensualidades, nota);

        System.out.println("----------------------");
        System.out.println("Datos del estudiante registrados:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Apellidos: " + estudiante.getApellidos());
        System.out.println("Fecha de Nacimiento: " + estudiante.getFechaNacimiento());
        System.out.println("Género: " + estudiante.getGenero());
        System.out.println("Mensualidades: " + estudiante.getMensualidades());
        System.out.println("Nota: " + estudiante.getNota());
        System.out.println("Estado: " + estudiante.getEstado());
    }
}