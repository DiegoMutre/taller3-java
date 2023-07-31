import java.util.ArrayList;
import java.util.Scanner;

public class DatosProfesor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatosPersonalesProfesor datosPersonalesProfesor;
        ArrayList<DatosPersonalesProfesor> datosProfesores = new ArrayList<>();
        char deseaIngresar = 's';

        while (deseaIngresar == 's') {
            // Crea la instancia en cada while, es decir, cuando desea ingresar un nuevo profesor
            datosPersonalesProfesor = new DatosPersonalesProfesor();

            // Solicitar los datos del profesor
            solicitarDatosProfesor(datosPersonalesProfesor, scanner);
            datosProfesores.add(datosPersonalesProfesor);

            // Preguntar si desea ingresar otro profesor
            System.out.println("Desea ingresar otro profesor? (S/N):");
            deseaIngresar = scanner.nextLine().toLowerCase().charAt(0);
        }

        // Finalmente, imprimir todos los profesores
        imprimirDatosProfesores(datosProfesores);

        // Cerrar el scanner
        scanner.close();
    }

    // Solicitar cedula, edad, nombres, apellidos, materia a dictar, horario
    static void solicitarDatosProfesor(DatosPersonalesProfesor datosPersonalesProfesor, Scanner scanner) {
        String cedula, edad, nombres, apellidos, materia, horario;

        // Solicitar cedula
        System.out.println("Cedula del profesor: ");
        cedula = scanner.nextLine();

        while (!cedula.matches("\\d{10}")) {
            System.out.println("Cedula del profesor (10 numeros):");
            cedula = scanner.nextLine();
        }
        datosPersonalesProfesor.cedula = Long.parseLong(cedula);

        // Solicitar edad
        System.out.println("Edad del profesor: ");
        edad = scanner.nextLine();

        while (!edad.matches("\\d+")) {
            System.out.println("Edad del profesor (solo numeros):");
            edad = scanner.nextLine();
        }
        datosPersonalesProfesor.edad = Integer.parseInt(edad);

        // Solicitar nombres
        System.out.println("Nombres del profesor: ");
        nombres = scanner.nextLine();

        while (!nombres.matches("[a-zA-Z ]+")) {
            System.out.println("Nombres del profesor (solo letras):");
            nombres = scanner.nextLine();
        }
        datosPersonalesProfesor.nombres = nombres;

        // Solicitar apellidos
        System.out.println("Apellidos del profesor: ");
        apellidos = scanner.nextLine();

        while (!apellidos.matches("[a-zA-Z ]+")) {
            System.out.println("Apellidos del profesor (solo letras):");
            apellidos = scanner.nextLine();
        }
        datosPersonalesProfesor.apellidos = apellidos;

        // Solicitar materia a dictar (No se valida nada porque se puede insertar numeros y strings)
        System.out.println("Materia a dictar:");
        materia = scanner.nextLine();
        datosPersonalesProfesor.materia = materia;

        // Solicitar horario (De igual manera, no se valida si es numero o string)
        System.out.println("Horario del profesor:");
        horario = scanner.nextLine();
        datosPersonalesProfesor.horario = horario;
    }

    static void imprimirDatosProfesores(ArrayList<DatosPersonalesProfesor> datosProfesoresArray) {
        System.out.println("==================================================================================================================");
        System.out.printf("%-25s %-25s %-25s %-25s %-30s %-25s\n", "CEDULA", "EDAD", "NOMBRES", "APELLIDOS", "MATERIA", "HORARIO");
        datosProfesoresArray.forEach(datosPersonalesProfesor -> {
            System.out.printf("%-25d %-25d %-25s %-25s %-30s %-25s\n",
                    datosPersonalesProfesor.cedula,
                    datosPersonalesProfesor.edad,
                    datosPersonalesProfesor.nombres,
                    datosPersonalesProfesor.apellidos,
                    datosPersonalesProfesor.materia,
                    datosPersonalesProfesor.horario
            );
        });
        System.out.println("==================================================================================================================");
    }

    static class DatosPersonalesProfesor {
        long cedula;
        int edad;
        String nombres;
        String apellidos;
        String materia;
        String horario;

    }
}
