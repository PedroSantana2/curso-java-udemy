import java.util.Locale;
import java.util.Scanner;

public class SomaPositivos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        double numeroUsuario = 0;
        double somaTotal = 0;

        while(numeroUsuario >= 0) {
            System.out.print("Digite um número: ");
            numeroUsuario = entrada.nextDouble();

            if(numeroUsuario >= 0) {
                somaTotal += numeroUsuario;
                System.out.println(somaTotal);

            }

        }

        entrada.close();

    }
    
}
