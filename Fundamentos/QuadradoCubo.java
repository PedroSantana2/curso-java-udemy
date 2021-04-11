package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class QuadradoCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        System.out.print("Digite o valor: ");
        double valor = entrada.nextDouble();

        final double quadrado = Math.pow(valor, 2);
        final double cubo = Math.pow(valor, 3);

        System.out.printf("O valor ao quadrado é: %.2f e ao cubo é: %.2f\n", quadrado, cubo);
        entrada.close();
    }
}
