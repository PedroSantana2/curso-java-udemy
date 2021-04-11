package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class SepararPalavra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        System.out.print("Digite uma palavra: ");    
        String palavra = entrada.next();

        int numeroLetra = 0;
        while(numeroLetra < palavra.length()){
            System.out.println(palavra.charAt(numeroLetra));
            numeroLetra++;

        }
        
        entrada.close();

    }

}
