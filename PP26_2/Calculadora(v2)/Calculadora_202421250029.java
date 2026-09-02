public class Calculadora_202421250029 {
    
    public double somar(double a, double b) {
        return a + b;
    }
    
    public double subtrair(double a, double b) {
        return a - b;
    }
    
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisao por zero!");
        }
        return a / b;
    }
}
