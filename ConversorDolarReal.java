import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float cotacaoDolar, valorDolar, valorReal;

        System.out.println("Qual a cotação atual do dólar? ");
        cotacaoDolar = leitor.nextFloat();

        System.out.println("Qual o valor em dólares a ser covertido? ");
        valorDolar = leitor.nextFloat();

        valorReal = cotacaoDolar * valorDolar;

        System.out.println("Em reais, temos: R$ " + valorReal);
    }
}
