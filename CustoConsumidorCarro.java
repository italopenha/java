import java.util.Scanner;

public class CustoConsumidorCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float custoFabrica, impostos, fabricaImpostos, lucroDistribuidor, custoConsumidor;

        System.out.println("Qual o custo de fábrica do veículo? ");
        custoFabrica = leitor.nextFloat();

        impostos = custoFabrica * 0.45f;

        fabricaImpostos = custoFabrica + impostos;

        lucroDistribuidor = fabricaImpostos * 0.28f;

        custoConsumidor = custoFabrica + impostos + lucroDistribuidor;

        System.out.println("------------------------------------------------");
        System.out.println("O custo ao consumidor será de R$ " + custoConsumidor);
    }
}
