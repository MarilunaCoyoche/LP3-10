import java.util.Scanner;

public class CalculadoraBmi {

    public static void main(String[] args) {
        // Lectura de datos
        Scanner scanner = new Scanner(System.in);
        
        // Selección de unidad de medida
        System.out.print("Seleccione la unidad de medida (1 para libras y pulgadas, 2 para kilogramos y metros): ");
        int opcion = scanner.nextInt();
        
        // Variables para peso y altura
        double peso;
        double altura;
        
        // Leer el peso y la altura según la opción seleccionada
        if (opcion == 1) {
            // LIBRAS Y PULGADAS
            System.out.print("Ingrese su peso en libras: ");
            peso = scanner.nextDouble();
            System.out.print("Ingrese su altura en pulgadas: ");
            altura = scanner.nextDouble();
            // Calcular y mostrar el BMI
            double bmi = calcularBmiLibras(peso, altura);
            mostrarResultados(bmi);

        } else if (opcion == 2) {
            // KILOS Y METROS
            System.out.print("Ingrese su peso en kilogramos: ");
            peso = scanner.nextDouble();
            System.out.print("Ingrese su altura en metros: ");
            altura = scanner.nextDouble();
            // Calcular y mostrar el BMI
            double bmi = calcularBmiKilogramos(peso, altura);
            mostrarResultados(bmi);
        } else {
            System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }

    // Método para calcular el BMI usando libras y pulgadas
    public static double calcularBmiLibras(double peso, double altura) {
        return (peso * 703) / (altura * altura); // Fórmula para libras y pulgadas
    }

    // Método para calcular el BMI usando kilogramos y metros
    public static double calcularBmiKilogramos(double peso, double altura) {
        return peso / (altura * altura); // Fórmula para kilogramos y metros
    }

    // Método para mostrar el BMI y la categoría
    public static void mostrarResultados(double bmi) {
        // Mostrar BMI
        System.out.printf("Su índice de masa corporal (BMI) es: %.2f\n", bmi);
        
        // Determinar la categoría del BMI
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
        
        // Imprimir la categoría del BMI
        System.out.println("Categoría: " + categoria);
        
        // Mostrar información adicional
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
