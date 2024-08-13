import java.util.Scanner;
import java.util.InputMismatchException;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        scanner.close(); // Cerrar el scanner

        // Manejo de números negativos (opcional)
        if (numero < 0) {
            System.out.println(numero + " no es un palíndromo.");
            return;
        }

        int original = numero;
        int inverso = 0;

        // Algoritmo para invertir el número
        while (numero != 0) {
            inverso = inverso * 10 + (numero % 10);
            numero /= 10;
        }

        // Verificación si el número original es igual al número invertido
        if (original == inverso) {
            System.out.println(original + " es un palíndromo.");
        } else {
            System.out.println(original + " no es un palíndromo.");
        }
    }
}
