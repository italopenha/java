import java.util.Scanner;

public class RendimentoPoupanca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float deposito, saldoAposRendimento, rendimento;

        System.out.println("Digite o valor a ser depositado: ");
        deposito = leitor.nextFloat();

        rendimento = deposito * 0.07f;

        saldoAposRendimento = deposito + rendimento;

        System.out.println("----------------------");
        System.out.println("Após o rendimento, seu saldo será de: R$ " + saldoAposRendimento);
    }
}
