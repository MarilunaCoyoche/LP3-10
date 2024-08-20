import java.util.Scanner;

public class EspacioModulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir cinco dígitos
        System.out.print("Ingresa un número de CINCO dígitos: ");
        int numero = scanner.nextInt();
        
        // Validar 
        while (!esNumeroValido(numero)) {
            System.out.print("Muy mal, ingresa un número de CINCO dígitos: ");
            numero = scanner.nextInt();
        }
        
        // Separar y mostrar
        imprimirDigitos(numero);
        
        // Cerrar el scanner
        scanner.close();
    }

    // Método validar 
    public static boolean esNumeroValido(int numero) {
        return numero >= 10000 && numero <= 99999; // rango de 5 dígitos
    }

    // Método imprimir separados por tres espacios
    public static void imprimirDigitos(int numero) {
        // Array almacenar
        int[] digitos = new int[5];

        // Extraer con modulo
        for (int i = 4; i >= 0; i--) {
            digitos[i] = numero % 10; // Obtener el último dígito
            numero /= 10; // Eliminar el último dígito
        }

        // Imprimir separados
        for (int i = 0; i < digitos.length; i++) {
            System.out.print(digitos[i]); // Imprimir dígito
            if (i < digitos.length - 1) {
                System.out.print("   "); // Imprimir tres espacios entre dígitos
            }
        }
        System.out.println(); // Nueva línea al final
    }
}
