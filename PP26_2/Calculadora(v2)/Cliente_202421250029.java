public class Cliente_202421250029 {
    public static void main(String[] args) {
        Calculadora_202321250008 calc = new Calculadora_202321250008();
        System.out.println(calc.somar(10, 5));      
        System.out.println(calc.dividir(10, 5));
        System.out.println(calc.subtrair(10, 5));
        System.out.println(calc.multiplicar(10, 5)); 
        System.out.println(calc.somar(-10, 5));       // -5.0
        System.out.println(calc.multiplicar(-2, -3)); // 6.0 
        System.out.println(calc.dividir(0, 0));       // -5.0
    }
}