public class Numero {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo.");
        }
        this.valor = valor;
    }
}

public class Main {
    public static void main(String[] args) {
        Numero numero = new Numero();
        
        try {
            numero.setValor(-5); // Intento de establecer un valor negativo
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
        
        try {
            numero.setValor(10); // Estableciendo un valor válido
            System.out.println("Valor establecido: " + numero.getValor());
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
