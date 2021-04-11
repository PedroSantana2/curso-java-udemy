package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class WhileDesafio {

    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        entradaDados.useLocale(Locale.ENGLISH);

        boolean verificador = true;

        while(verificador) {
            System.out.print("Digite uma frase: ");
            String resposta = entradaDados.next();

            if("sair".equalsIgnoreCase(resposta)) {
                verificador = false;

            }
    
        }

        entradaDados.close();
        
    }

}
