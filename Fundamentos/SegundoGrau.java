import java.util.Locale;
import java.util.Scanner;

public class SegundoGrau {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.ENGLISH);

        System.out.print("Digite o valor de 'a': ");
        double a = entrada.nextDouble();

        System.out.print("Digite o valor de 'b': ");
        double b = entrada.nextDouble();

        System.out.print("Digite o valor de 'c': ");
        double c = entrada.nextDouble();
        
        final double delta = (Math.pow(b, 2)) - (4 * a * c);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("X': %.2f\nX\": %.2f\n", x1, x2);

        entrada.close();
    }
}
