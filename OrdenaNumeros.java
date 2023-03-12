import java.util.Arrays;
import java.util.Scanner;

public class OrdenaNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int [] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = leitor.nextInt();
        }

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
