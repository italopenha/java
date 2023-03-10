import java.util.Scanner;

public class ComissaoVendas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        float salarioBase, totalVendas, comissaoVendas, salarioTotal;

        System.out.println("Digite o seu nome: ");
        nome = leitor.nextLine();

        System.out.println("Digite o seu salário base: ");
        salarioBase = leitor.nextFloat();

        System.out.println("Digite o seu total de vendas em R$: ");
        totalVendas = leitor.nextFloat();

        comissaoVendas = totalVendas * 0.15f;

        salarioTotal = salarioBase + comissaoVendas;

        System.out.println("-------------------------------");
        System.out.println(nome + ", o seu salário total será de: R$ " + salarioTotal);
    }
}
