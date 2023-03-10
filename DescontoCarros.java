import java.util.Scanner;

public class DescontoCarros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float precoCarro, precoDesconto, precoDesconto2;
        int anoCarro, contadorAte2000 = 0, contadorMaior2000 = 0, contadorTotal = 0;
        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.println("Digite o valor do carro: ");
            precoCarro = leitor.nextFloat();

            System.out.println("Digite o ano do carro: ");
            anoCarro = leitor.nextInt();
            System.out.println("------------------------------------");

            if (anoCarro <= 2000 && anoCarro >= 1900) {
                precoDesconto = precoCarro - (precoCarro * 0.12f);
                System.out.println("Preço com desconto de 12%: R$ " + precoDesconto);
                contadorAte2000++;
            } else if (anoCarro > 2000) {
                precoDesconto2 =  precoCarro - (precoCarro * 0.07f);
                System.out.println("Preço com desconto de 7%: R$ " + precoDesconto2);
                contadorMaior2000++;
            } else {
                System.out.println("Ano deve ser maior que 1900!");
            }
            contadorTotal++;

            System.out.println("------------------------------------");
            System.out.println("Deseja continuar? S - Sim / N - Não");
            continuar = leitor.next().charAt(0);
        }

        System.out.println("Total de carros informados com ano até 2000: " + contadorAte2000);
        System.out.println("Total de carros informados com ano maior que 2000: " + contadorMaior2000);
        System.out.println("Total de carros informados: " + contadorTotal);
    }
}
