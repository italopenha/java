import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float num1, num2, resultado;
        char operador;

        System.out.println("CALCULADORA");
        System.out.println("--------------");
        System.out.println("Digite o primeiro número: ");
        num1 = leitor.nextFloat();
        System.out.println("Digite um operador: ( + | - | * | / )");
        operador = leitor.next().charAt(0);
        System.out.println("Digite o segundo número: ");
        num2 = leitor.nextFloat();

        switch(operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num1 == 0 || num2 == 0) {
                    System.out.println("ERRO! Não é possível dividir por zero!");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("ERRO! Operador inválido!");
                break;
        }
    }
}
