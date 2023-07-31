import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        double montoFactura = 0;

        // Solicitar el monto de la factura al usuario
        montoFactura = solicitarMontoFactura();

        // Comprobar si aplica descuento e imprimir en consola el mensaje
        System.out.println(aplicaDescuento(montoFactura));
    }

    static double solicitarMontoFactura() {
        Scanner scanner = new Scanner(System.in);
        String montoFacturaString = "";

        // Solicitar monto de la factura. No se permiten strings ni valores negativos
        while (!montoFacturaString.matches("\\d+\\.?\\d+")) { // El regex comprueba si el valor es entero o decimal
            System.out.println("Ingrese monto de la factura:");
            montoFacturaString = scanner.nextLine();
        }

        // Convertir el `string` a `double` y retornarlo
        return Double.parseDouble(montoFacturaString);
    }

    static String aplicaDescuento(double factura) {

        // Si el monto de la factura es mayor de $100, entonces retonar `Cliente con descuento de 20%: [descuento]`
        if (factura > 100) {
            return "Cliente con descuento de 20%: $" + (factura - (factura * 0.2));
        }

        return "Cliente sin descuento";
    }
}
