import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Pessoas p = new Pessoas();

        System.out.println("Qual é o seu nome? ");
        p.setNome(leitor.nextLine());
        System.out.println("Em que ano você nasceu? ");
        p.setAnoNascimento(leitor.nextInt());

        System.out.println(p.getNome() + ", você tem " + p.calcularIdade() + " anos.");
    }
}
