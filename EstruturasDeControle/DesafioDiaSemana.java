package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        entradaDados.useLocale(Locale.ENGLISH);

        System.out.print("Digite o dia da semana: ");
        byte dia = entradaDados.nextByte();

        String resultado = "Domingo";

        if(dia == 2) {
            resultado = "Segunda";

        } else if(dia == 3) {
            resultado = "Terça";

        } else if(dia == 4) {
            resultado = "Quarta";

        } else if(dia == 5) {
            resultado = "Quinta";

        } else if(dia == 6) {
            resultado = "Sexta";

        } else if(dia == 7) {
            resultado = "Sabádo";

        } else if (dia > 7) {
            System.out.println("Número inválido");
            System.exit(0);

        }

        System.out.printf("O dia da semana é: %s\n", resultado);

        entradaDados.close();

    }

}
