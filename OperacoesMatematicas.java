import java.util.Scanner;

public class OperacoesMatematicas {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float num1, num2, soma, subtracao, multiplicacao, divisao;

        System.out.println("Digite o primeiro número: ");
        num1 = leitor.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = leitor.nextFloat();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;

        System.out.println("----------------------------");
        System.out.println("A soma é igual a " + soma);
        System.out.println("A subtração é igual a " + subtracao);
        System.out.println("A multiplicação é igual a " + multiplicacao);
        System.out.println("A divisão é igual a " + divisao);
    }
}

