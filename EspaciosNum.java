import java.util.Scanner;

public class EspaciosNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir cinco dígitos
        System.out.print("Ingresa un número de CINCO dígitos: ");
        String numero = scanner.nextLine();
        
        // Validar 
        while (!esNumeroValido(numero)) {
            System.out.print("Te faltan digitos, ingresa un número de CINCO dígitos: ");
            numero = scanner.nextLine();
        }
        
        // Separar y mostrar
        imprimirDigitos(numero);
        
        // Cerrar el scanner
        scanner.close();
    }

    // Método  validar 
    public static boolean esNumeroValido(String numero) {
        return numero.matches("\\d{5}"); // Verifica 5 dígitos
    }

    // Método imprimir separados por tres espacios
    public static void imprimirDigitos(String numero) {
        for (int i = 0; i < numero.length(); i++) {
            System.out.print(numero.charAt(i)); // Imprimir el dígito
            if (i < numero.length() - 1) {
                System.out.print("   "); // Imprimir tres espacios entre dígitos
            }
        }
        System.out.println(); // Nueva línea al final
    }
}
