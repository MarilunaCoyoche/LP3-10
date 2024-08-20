import java.util.Scanner;

public class CuadradoAsteriscos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ingresa un número
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        // Imprimir
        imprimirCuadrado(numero);
        
        // fin scanner
        scanner.close();
    }

    // Método imprimir
    public static void imprimirCuadrado(int lado) {
        for (int i = 0; i < lado; i++) { // Iterar  filas
            for (int j = 0; j < lado; j++) { // Iterar  columnas
                System.out.print("*"); // Imprimir uno
            }
            System.out.println(); // Nueva linea
        }
    }
}
