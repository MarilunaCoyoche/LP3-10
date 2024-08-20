DISMINUYE POR CADA LANZADA 

import java.util.Random;

public class LanzarDadoModif {
    public static void main(String[] args) {
        int[] frecuencia = new int[6]; // Arreglo para almacenar la frecuencia de cada cara
        Random random = new Random();

        // Lanzar el dado 20000 veces
        for (int i = 0; i < 20000; i++) {
            int resultado = random.nextInt(6) + 1; // Genera un número entre 1 y 6
            frecuencia[resultado - 1]--; // Disminuye la frecuencia de la cara correspondiente
        }

        // Imprimir los resultados
        System.out.println("Frecuencia de cada cara del dado tras 20000 lanzamientos:");
        for (int i = 0; i < frecuencia.length; i++) {
            System.out.println("Cara " + (i + 1) + ": " + frecuencia[i]);
        }
    }
}
