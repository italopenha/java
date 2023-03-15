package poo.banco;

import java.util.Scanner;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public double depositar() {
        Scanner leitor = new Scanner(System.in);
        double deposito;

        System.out.println("Digite a quantia que pretende depositar: ");
        deposito = leitor.nextDouble();

        saldo += deposito;
        return deposito;
    }

    public double sacar() {
        Scanner leitor = new Scanner(System.in);
        double saque;

        System.out.println("Digite a quantia que pretende sacar: ");
        saque = leitor.nextDouble();

        saldo -= saque;
        return saque;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
