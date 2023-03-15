package poo.bombaCombustivel;

import java.util.Scanner;

public class BombaCombustivel {
    private double precoLitro;
    private double qtdCombustivel;

    public BombaCombustivel(double precoLitro, double qtdCombustivel) {
        this.precoLitro = precoLitro;
        this.qtdCombustivel = qtdCombustivel;
    }

    public double abastecerPorValor() {
        Scanner leitor = new Scanner(System.in);
        double valorAbastecimento;

        System.out.println("Digite o valor em R$ que pretende abastecer (Preço: R$ " + precoLitro + "0 por litro)");
        valorAbastecimento = leitor.nextDouble();

        double combustivelNoVeiculo = valorAbastecimento / precoLitro;
        System.out.println("Você abasteceu " + combustivelNoVeiculo + " litros.");
        qtdCombustivel -= combustivelNoVeiculo;
        return qtdCombustivel;
    }

    public double abastecerPorLitro() {
        Scanner leitor = new Scanner(System.in);
        double litroAbastecimento;

        System.out.println("Digite a quantidade de combustível em litros em que deseja abastecer (Preço: R$ " + precoLitro + "0 por litro)");
        litroAbastecimento = leitor.nextDouble();

        double preco = litroAbastecimento * precoLitro;
        System.out.println("Você deve pagar R$ " + preco);
        qtdCombustivel -= litroAbastecimento;
        return qtdCombustivel;
    }

    public void setPrecoLitro(double precoLitro) {
        this.precoLitro = precoLitro;
    }

    public double getPrecoLitro() {
        return precoLitro;
    }

    public void setQtdCombustivel(double qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public double getQtdCombustivel() {
        return qtdCombustivel;
    }
}