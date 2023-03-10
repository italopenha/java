import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        float nota1, nota2, nota3, media;

        System.out.println("Qual o seu nome? ");
        nome = leitor.nextLine();

        System.out.println("Digite sua primeira nota: ");
        nota1 = leitor.nextFloat();

        System.out.println("Digite sua segunda nota: ");
        nota2 = leitor.nextFloat();

        System.out.println("Digite sua terceira nota: ");
        nota3 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7 && media <= 10) {
            System.out.println("Parabéns " + nome + ", você está APROVADO(A), com média " + media);
        } else {
            if (media > 5 && media < 7) {
                System.out.println(nome + ", você está de RECUPERAÇÃO, com média " + media);
            } else {
                System.out.println(nome + ", você está de REPROVADO(A), com média " + media);
            }
        }
    }
}
