import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite um número: ");
        num1 = leitor.nextInt();

        System.out.println("Digite outro número: ");
        num2 = leitor.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " é igual a " + num2);
        } else {
            if (num1 > num2) {
                System.out.println(num1 + " é maior que " + num2);
            } else {
                System.out.println(num2 + " é maior que " + num1);
            }
        }
    }
}
