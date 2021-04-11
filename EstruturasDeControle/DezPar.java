package EstruturasDeControle;

import java.util.Scanner;

public class DezPar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();

        if(numero > 0 && numero < 10) {
            System.out.println("Está entre 0 e 10!");

            if(numero % 2 ==0) {
                System.out.println("É par!");

            }

        }

        entrada.close();

    }

}
