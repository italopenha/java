import java.util.Scanner;

public class ValorPrestacoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float valorProduto, valorPrestacoes;

        System.out.println("Digite o valor do produto: ");
        valorProduto = leitor.nextFloat();

        valorPrestacoes = valorProduto / 5;

        System.out.println("-------------");
        System.out.println("O valor das prestações será de: R$ " + valorPrestacoes);
    }
}
