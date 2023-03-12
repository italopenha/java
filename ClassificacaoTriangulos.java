import java.util.Scanner;

public class ClassificacaoTriangulos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite o primeiro número: ");
        num1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = leitor.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = leitor.nextInt();

        if (num1 + num2 > num3 && num3 + num1 > num2 && num2 + num3 > num1) {
            if (num1 == num2 && num1 == num3 && num2 == num3) {
                System.out.println("Todos os lados são iguais, é um triângulo equilátero.");
            } else if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Apenas dois lados são iguais, é um triângulo isósceles.");
            } else {
                System.out.println("Os lados são diferentes, é um triângulo escaleno.");
            }
        } else {
            System.out.println("Não é possível formar um triângulo com essas medidas!");
        }
    }
}
