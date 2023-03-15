package poo.bombaCombustivel;

import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        BombaCombustivel bC = new BombaCombustivel(5.20, 500);

        char botao;

        System.out.println("Digite 'V' para abastecer por valor ou 'L' para abastecer por litros");
        botao = leitor.next().charAt(0);

        if (botao == 'v' || botao == 'V') {
            bC.abastecerPorValor();
            System.out.println("Quantidade de combustível restante na bomba: " + bC.getQtdCombustivel() + " litros.");
        } else if (botao == 'l' || botao == 'L') {
            bC.abastecerPorLitro();
            System.out.println("Quantidade de combustível restante na bomba: " + bC.getQtdCombustivel() + " litros.");
        }
    }
}
