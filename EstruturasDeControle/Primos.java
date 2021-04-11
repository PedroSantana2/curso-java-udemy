package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();

        String resposta = "ìmpar";

        if(numero % 2 == 0) {
            resposta = "par";

        }

        System.out.printf("O número digitado é: %s\n", resposta);
        
        entrada.close();

    }

}
