import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float celsius, fahrenheit;

        System.out.println("Digite a temperatura em °F: ");
        fahrenheit = leitor.nextFloat();

        celsius = (fahrenheit - 32) / 1.8f;

        System.out.println("-----------");
        System.out.println(celsius + "°C");
    }
}
