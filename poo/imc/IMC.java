package poo.imc;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Pessoa objetoPessoa = new Pessoa(70.0f, 1.79f);

        System.out.println("Digite seu peso: ");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite sua altura: ");
        objetoPessoa.setAltura(leitor.nextFloat());

        if (objetoPessoa.calcularIMC() < 18.5) {
            System.out.println("Seu IMC é: " + objetoPessoa.calcularIMC() + ". Você está abaixo do peso.");
        } else if (objetoPessoa.calcularIMC() >= 18.5 && objetoPessoa.calcularIMC() < 25) {
            System.out.println("Seu IMC é: " + objetoPessoa.calcularIMC() + ". Você está no peso ideal.");
        } else if (objetoPessoa.calcularIMC() >= 25 && objetoPessoa.calcularIMC() < 30) {
            System.out.println("Seu IMC é: " + objetoPessoa.calcularIMC() + ". Você está com sobrepeso.");
        } else if (objetoPessoa.calcularIMC() >= 30 && objetoPessoa.calcularIMC() < 35) {
            System.out.println("Seu IMC é: " + objetoPessoa.calcularIMC() + ". Você está com obesidade grau 1.");
        } else if (objetoPessoa.calcularIMC() >= 35 && objetoPessoa.calcularIMC() < 40) {
            System.out.println("Seu IMC é: " + objetoPessoa.calcularIMC() + ". Você está com obesidade grau 2.");
        } else {
            System.out.println("Seu IMC é: " + objetoPessoa.calcularIMC() + ". Você está com obesidade grau 3 (mórbida).");
        }
    }
}
