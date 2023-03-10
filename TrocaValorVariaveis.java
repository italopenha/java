import java.util.Scanner;

public class TrocaValorVariaveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro número: ");
        a = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        b = leitor.nextInt();

        a = a^b;
        b = b^a;
        a = a^b;

        System.out.println("Ao inverter os valores");
        System.out.println("O primeiro agora é " + a);
        System.out.println("O segundo agora é " + b);
    }
}
