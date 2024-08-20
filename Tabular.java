public class Tabular {
    public static void main(String[] args) {
        // Imprimir encabezado 
        System.out.printf("Número  Cuadrado  Cubo\n");
        
        // Inicializar num
        int numero = 0;
        
        // Iterar hasta que el cubo sea mayor que 1000
        while (Math.pow(numero, 3) <= 1000) {
            // Calcular el cuadrado y el cubo del número actual
            int cuadrado = numero * numero;
            int cubo = (int) Math.pow(numero, 3);

            // Imprimir los resultados          
            System.out.printf("%-7d %-9d %-6d\n", numero, cuadrado, cubo);
            
            // Incrementar num para iteración
            numero++;
        }
    }
}
