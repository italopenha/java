import java.util.Scanner;

public class MaiorQue10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = leitor.nextInt();

        if (num > 10) {
            System.out.println("Número maior que 10!");
        } else {
            System.out.println("Número menor que 10!");
        }
    }
}
