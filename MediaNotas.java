import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        float prova1, prova2, prova3, media;

        System.out.println("Digite o seu nome: ");
        nome = leitor.nextLine();

        System.out.println("Digite a nota da prova 1: ");
        prova1 = leitor.nextFloat();

        System.out.println("Digite a nota da prova 2: ");
        prova2 = leitor.nextFloat();

        System.out.println("Digite a nota da prova 3: ");
        prova3 = leitor.nextFloat();

        media = (prova1 + prova2 + prova3) / 3;

        System.out.println(nome + ", sua média final é igual a: " + media);
    }
}
