import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();
        imprimirNumerosPrimos(n);
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true; // 2 es el único número primo par
        }
        if (num % 2 == 0) {
            return false; // Eliminar múltiplos de 2
        }
        // Solo verificar hasta la raíz cuadrada del número
        int limite = (int) Math.sqrt(num);
        for (int i = 3; i <= limite; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirNumerosPrimos(int n) {
        for (int num = 2; num <= n; num++) {
            if (esPrimo(num)) {
                System.out.println(num + " es primo.");
            }
        }
    }
}
