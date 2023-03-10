import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float distanciaPercorrida, combustivelGasto, consumoMedio;

        System.out.println("Digite a distância percorrida em Km: ");
        distanciaPercorrida = leitor.nextFloat();

        System.out.println("Digite a quantidade de combustível gasto em litros: ");
        combustivelGasto = leitor.nextFloat();

        consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.println("O consumo médio de combustível do seu automóvel foi de: " + consumoMedio + " litros.");
    }
}
