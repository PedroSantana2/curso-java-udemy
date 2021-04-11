package Fundamentos;

import java.util.Scanner;

public class TemperaturaInverso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor em °C: ");
        double fahrenheit = entrada.nextDouble();

        double conversao = (fahrenheit- 32) / 1.8;
        
        System.out.printf("O resultado é: %.2f°F\n", conversao);
        entrada.close();
    }
}
