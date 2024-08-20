import java.util.Scanner;

public class ImprimeRombo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ingrese un número
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        // Imprimir rombo
        imprimirRombo(numero);
        
        // Cerrar scanner
        scanner.close();
    }

    // Método imprimir
    public static void imprimirRombo(int lado) {
        // Imprimir la mitad superior como un triangulo 1
        for (int i = 0; i < lado; i++) {
            // Imprimir espacios en blanco antes del triangulo 1
            for (int j = 0; j < lado - i - 1; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos todos
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Nueva línea de fin linea
        }
        
        // Imprimir la mitad inferior, triangulo 2 invertido
        for (int i = lado - 2; i >= 0; i--) {
            // Imprimir espacios 
            for (int j = 0; j < lado - i - 1; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos 2
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Nueva línea de fin de fila
        }
    }
}
