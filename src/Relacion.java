import java.util.Scanner;

public class Relacion {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);

        // Solicitar los numeros `a` y `b`
        a = solicitarNumero(scanner, "Ingrese el primer numero:");
        b = solicitarNumero(scanner, "Ingrese el segundo numero:");

        // Comprobar con la relacion
        System.out.println("Relacion: " + relacion(a, b));

        scanner.close();
    }

    static double solicitarNumero(Scanner scanner, String mensaje) {
        String numeroString = "";

        // Solicitar el numero al usuario. El regex comprueba si el valor es entero o decimal
        while (!numeroString.matches("\\d+\\.?\\d+")) {
            System.out.println(mensaje);
            numeroString = scanner.nextLine();
        }

        // Retornar el numero en tipo `Double`
        return Double.parseDouble(numeroString);
    }

    static int relacion(double a, double b) {
        // Retorna `1` si `a` es par y `b` no
        if (a % 2 == 0 && b % 2 == 1) {
            return 1;
        }

        // Retorna `-1` si `a` es impar y `b` es par
        if (b % 2 == 0 && a % 2 == 1) {
            return -1;
        }
        // Que hacer si `a` y `b` son impares?
        // Como no fue puesto en el ejercicio, retornara 2, por ahora.
        if (a % 2 == 1 && b % 2 == 1) {
            return 2;
        }

        // Retorna `0` si ambos numeros son pares
        return 0;
    }
}