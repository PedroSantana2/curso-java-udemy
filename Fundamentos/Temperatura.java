package Fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa de conversão de temperatura");
        
        System.out.print("Digite o valor em °C: ");
        double celsius = entrada.nextDouble();

        double fahrenheit = celsius * 1.8 + 32;
        System.out.printf("%.2f°C em Fahrenheit é: %.2f°F\n", celsius, fahrenheit);
        entrada.close();
    }
}
