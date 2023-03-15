package poo.fatura;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Fatura fat = new Fatura(1, "Teclado", 10, 50);

        System.out.println("Valor total = " + fat.totalFatura());
    }
}
