import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        System.out.print("Digite o valor da base do triângulo: ");
        double base = entrada.nextDouble();

        System.out.print("Digite o valor da altura do triângulo: ");
        double altura = entrada.nextDouble();

        final double area = (base * altura) / 2;

        System.out.printf("A area do triângulo é: %.2f\n", area);
    
        entrada.close();

    }
    
}
