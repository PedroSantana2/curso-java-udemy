package Fundamentos;

import java.util.Scanner;

import java.util.Locale; 

public class IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);
        
        System.out.print("(em M) Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("(em KG)Digite seu peso: ");
        double peso = entrada.nextDouble();

        final double IMC = peso / (Math.pow(altura, 2));

        System.out.printf("Seu IMC é: %.2f\n", IMC);

        entrada.close();
    }
}
