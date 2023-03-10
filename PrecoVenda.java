import java.util.Scanner;

public class PrecoVenda {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float precoCusto, precoVenda, percentualAcrescimo;

        System.out.println("Qual o preço de custo do produto? ");
        precoCusto = leitor.nextFloat();

        System.out.println("Qual será o percentual de acréscimo sobre o preço de custo em %? ");
        percentualAcrescimo = leitor.nextFloat();

        precoVenda = (percentualAcrescimo / 100) * 100 + precoCusto;

        System.out.println("O preço de venda será de R$ " + precoVenda);
    }
}