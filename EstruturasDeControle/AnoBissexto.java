package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        System.out.print("Digite o ano: ");
        long ano = entrada.nextLong();

        if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println("O ano é bissexto!");
        
        } else {
            System.out.println("O ano não é bissexto!");

        }

        entrada.close();

    }
    
}
