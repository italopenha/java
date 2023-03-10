import java.util.Scanner;

public class Entre100e200 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = leitor.nextInt();

        if (num >= 100 && num <= 200) {
            System.out.println("Entre 100 e 200");
        } else {
            System.out.println("Fora do intervalo");
        }
    }
}
