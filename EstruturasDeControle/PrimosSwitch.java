import java.util.Locale;
import java.util.Scanner;

public class PrimosSwitch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        int verificar = numero % 2;
        String resultado = "ímpar";

        switch(verificar) {
            case 0:{
                resultado = "par";

            }

        }

        System.out.printf("O número é: %s\n", resultado);

        entrada.close();

    }
    
}
