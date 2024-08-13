import java.util.Scanner;
import java.util.InputMismatchException;

public class PromediosNotas {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      System.out.print("Ingrese la primera nota: ");
      double nota1 = scanner.nextDouble();

      System.out.print("Ingrese la segunda nota: ");
      double nota2 = scanner.nextDouble();

      System.out.print("Ingrese la tercera nota: ");
      double nota3 = scanner.nextDouble();

      // Calcula el promedio de las 3 notas
      double promedio = (nota1 + nota2 + nota3) / 3;

      // Convierte el promedio a entero
      int promedioEntero = (int) promedio;

      System.out.println("El promedio entero es: " + promedioEntero);

    } catch (InputMismatchException e) {
      System.out.println("Ingrese un número válido.");
    }
  }
}

