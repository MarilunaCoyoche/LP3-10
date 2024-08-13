public class LibreriaMathEjemplos {
    public static void main(String[] args) {
        double radio = 5.5;
        double altura = 10.0;
        
        double valorDecimal = 5.7;
        System.out.println("Redondeo hacia arriba de " + valorDecimal + " es: " + Math.ceil(valorDecimal));
        System.out.println("Redondeo hacia abajo de " + valorDecimal + " es: " + Math.floor(valorDecimal));
        System.out.println("----------------------------------------------------------------------------");

        int base = 2;
        int exponente = 3;
        System.out.println(base + " elevado a " + exponente + " es: " + Math.pow(base, exponente));
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("9 elevado a 0.5 (raiz cuadrada de 9): es " + Math.pow(9, 0.5));
        System.out.println("----------------------------------------------------------------------------");
        double numero1 = 7.5;
        double numero2 = 10.0;
        System.out.println("Maximo o mayor entre " + numero1 + " y " + numero2 + " es: " + Math.max(numero1, numero2));
        System.out.println("----------------------------------------------------------------------------");    
        double valor = 16.0;
        System.out.println("Raiz cuadrada de " + valor + " es: " + Math.sqrt(valor));
        System.out.println("----------------------------------------------------------------------------"); 
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("Area del circulo con radio " + radio + " es: " + areaCirculo);
        System.out.println("----------------------------------------------------------------------------");   
        double areaEsfera = 4 * Math.PI * Math.pow(radio, 2);
        System.out.println("Area de la esfera con radio " + radio + " es: " + areaEsfera);
        System.out.println("----------------------------------------------------------------------------");
    }
}
