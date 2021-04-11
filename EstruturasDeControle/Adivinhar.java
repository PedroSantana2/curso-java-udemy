package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class Adivinhar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        String resultado = "Você errou!";
        byte numeroSecreto = 50;

        for(int contador = 10;contador >= 1;contador--) {
            System.out.printf("Você tem %d tentativas!\n", contador);
            byte numeroUsuario = entrada.nextByte();

            if(numeroSecreto == numeroUsuario) {
                resultado = "Você acertou";
                break;

            }

        }

        System.out.println(resultado);
        entrada.close();

    }

}
