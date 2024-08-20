import java.util.Scanner;

public class CalculadoraBmi {

    public static void main(String[] args) {
        // Lectura datos
        Scanner scanner = new Scanner(System.in);
        
        // unidad de medida
        System.out.print("Seleccione la unidad de medida (1 para libras y pulgadas, 2 para kilogramos y metros): ");
        int opcion = scanner.nextInt();
        
        // Variables 2
        double peso;
        double altura;
        
        // Leer el peso y la altura según la opción seleccionada
        //MENU
        if (opcion == 1) {
            // LIBRAS Y PULGADAS
            System.out.print("Ingrese su peso en libras: ");
            peso = scanner.nextDouble();
            System.out.print("Ingrese su altura en pulgadas: ");
            altura = scanner.nextDouble();
            // Calcular y mostrar el BMI
            calcularYMostrarBMI(peso, altura, true);
            
            // KILOS Y METROS
        } else if (opcion == 2) {
            // Peso en kilogramos y altura en metros
            System.out.print("Ingrese su peso en kilogramos: ");
            peso = scanner.nextDouble();
            System.out.print("Ingrese su altura en metros: ");
            altura = scanner.nextDouble();
            // Calcular y mostrar el BMI
            calcularYMostrarBMI(peso, altura, false);
        } else {
            System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }

    // METODO CLACULAR Y CATEGORIA
    public static void calcularYMostrarBMI(double peso, double altura, boolean enLibras) {
        double bmi;
        
        // FORMULAS 2
        if (enLibras) {
            bmi = (peso * 703) / (altura * altura); // Fórmula para libras y pulgadas
        } else {
            bmi = peso / (altura * altura); // Fórmula para kilogramos y metros
        }
        
        // Mostrar BMI
        System.out.printf("Su índice de masa corporal BMI es: %.2f\n", bmi);
        
        // Categoría PERSONA
        String categoria;
        if (bmi < 18.5) {
            categoria = "Bajo peso";
        } else if (bmi < 24.9) {
            categoria = "Normal";
        } else if (bmi < 29.9) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obeso";
        }
        
        // IMPRIME BMI
        System.out.println("Categoría: " + categoria);
        
        // Mostrar información TABULADAAAA
        System.out.println("--------------------------------------------------");
        System.out.println("VALORES DE BMI:");
        System.out.println("--------------------------------------------------");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");
        System.out.println("--------------------------------------------------");

    }
}
