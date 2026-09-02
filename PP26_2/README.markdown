# Atividade de Calculadora Básica Orientada à Objetos!

## Versões 

| Softwares | Versão |
|-------|-----------|
| Java | 21.0.12.1 |
| Vscode | 1.135.0 |
| Windows | Windows 10 Home version 22H2|

## Classes

- Calculadora_202421250029: Possuí as 4 operações, com a divisão possuíndo uma verificação de divisão por 0, se sim, é lançada uma exceção.

- Cliente_202421250029: É o "App" do programa, no caso o cliente que irá executar a biblioteca, que é a Calculadora.

## Métodos

    public double somar(double a, double b) {
        return a + b;
    } // realiza a soma
    
    public double subtrair(double a, double b) {
        return a - b;
    } // realiza subtração
    
    public double multiplicar(double a, double b) {
        return a * b;
    } // realiza multiplicação
    
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisao por zero!"); // lança uma exceção ao tentar realizar divisão por 0
        }
        return a / b;
    } // realiza divisão
- Para chamar-los, é necessário apenas instanciar a Calculadora no App/Cliente e utilizar: 

  (* == nome do seu app)

  EX: *.soma(2, 2), *.subtrair(2.2), *.multiplicar(2,2), *.dividir(2,2)

## Biblioteca

Como utilizar a biblioteca que está em .JAR?

### Compilar o teste com o JAR

- javac -cp "Calculadora_202421250029.jar" TesteApp.java

### Executar o teste 

- java -cp ".;Calculadora_202421250029.jar" TesteApp   //Windows
- java -cp ".:Calculadora_202421250029.jar" TesteApp   //Linux/Mac

### __OBS: Para que a calculadora possa ser reconhecida pelo seu app é necessário manter "Calculadora_202421250029"__
  
