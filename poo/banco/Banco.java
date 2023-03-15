package poo.banco;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ContaCorrente c = new ContaCorrente(0);
        char botao;

        System.out.println("Digite 'D' para depositar, 'S' para sacar ou 'E' para encerrar.");
        botao = leitor.next().charAt(0);

        if (botao == 'e' || botao == 'E') {
            System.out.println("Saldo: " + c.getSaldo());
        } else {
            do {
                c.depositar();
                System.out.println("Saldo: " + c.getSaldo());
                System.out.println("Digite 'D' para depositar, 'S' para sacar ou 'E' para encerrar.");
                botao = leitor.next().charAt(0);
            } while (botao == 'd' || botao == 'D');
    
            do {
                c.sacar();
                System.out.println("Saldo: " + c.getSaldo());
                System.out.println("Digite 'D' para depositar, 'S' para sacar ou 'E' para encerrar.");
                botao = leitor.next().charAt(0);
            } while (botao == 's' || botao == 'S');

            System.out.println("Saldo: " + c.getSaldo());
        }
    }
}