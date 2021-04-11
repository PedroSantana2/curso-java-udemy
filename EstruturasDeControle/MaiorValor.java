import java.util.Locale;
import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        double valorAnterior = 0;
        double valorMaximo = 0;
        
        for(int contador = 1;contador <= 10;contador++) {
            System.out.printf("Digite o %d° valor: ", contador);
            double valorDigitado = entrada.nextDouble();
            
            if(valorDigitado > valorAnterior) {
                valorMaximo = valorDigitado;

            }

            valorAnterior = valorMaximo;

        }

        System.out.println(valorMaximo);

        entrada.close();

    }
    
}
