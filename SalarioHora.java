import java.util.Scanner;

public class SalarioHora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float horasTrabalhadas, salario;
        char nivel;

        System.out.println("Quantas horas você trabalhou? ");
        horasTrabalhadas = leitor.nextFloat();
        System.out.println("Qual o seu nível? ( 1 | 2 | 3 )");
        nivel = leitor.next().charAt(0);

        switch (nivel) {
            case '1':
                salario = horasTrabalhadas * 12f;
                System.out.println("Seu salário é igual a: R$ " + salario);
                break;
            case '2':
                salario = horasTrabalhadas * 17f;
                System.out.println("Seu salário é igual a: R$ " + salario);
                break;
            case '3':
                salario = horasTrabalhadas * 25f;
                System.out.println("Seu salário é igual a: R$ " + salario);
                break;
            default:
                System.out.println("ERRO! Nível inválido!");
                break;
        }
    }
}
