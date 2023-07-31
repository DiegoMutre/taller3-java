import java.util.ArrayList;

public class PrimosImpares {
    public static void main(String[] args) {
        // Procedimiento que genera y muestra los primos menores e impares de un rango de números del 1 a 50
        generarNumerosPrimosEImpares();
    }

    static void generarNumerosPrimosEImpares() {
        ArrayList<Integer> numerosPrimosImpares = new ArrayList<>();

        for (int i = 2; i < 50; i++) {
            int factores = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factores++;
                }
            }

            // Comprueba si el numero solo tiene dos factores y es impar, por lo tanto lo añade al array
            if (factores == 2 && i % 2 == 1) {
                numerosPrimosImpares.add(i);
            }
        }

        numerosPrimosImpares.forEach(numero -> {
            System.out.print(numero + ", ");
        });
    }
}
