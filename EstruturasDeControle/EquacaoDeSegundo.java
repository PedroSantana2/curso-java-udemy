import java.util.Locale;

import java.util.Scanner;

public class EquacaoDeSegundo {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);
        entradaDados.useLocale(Locale.ENGLISH);

        System.out.println("=== Calculadora 2° ===");

        System.out.print("Digite o valor de 'a': ");
        double a = entradaDados.nextDouble();
        
        System.out.print("Digite o valor de 'b': ");
        double b = entradaDados.nextDouble();
        
        System.out.print("Digite o valor de 'c': ");
        double c = entradaDados.nextDouble();

        final double delta = (Math.pow(b, 2)) - (4 * a * c);

        double x1 = 0.0;
        double x2 = 0.0;

        if(delta < 0){
            System.out.println("A equação não admite solução real!");
            System.exit(0);

        } else {
                if(delta > 0){
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);

                } else {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = x1;

                }

        }

        System.out.printf("X': %.2f\nX\": %.2f\n", x1, x2);

        entradaDados.close();

    }

}
