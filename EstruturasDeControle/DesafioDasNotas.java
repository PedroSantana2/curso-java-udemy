package EstruturasDeControle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDasNotas {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        boolean verificador = true; 
        double notas = 0.0;
        double notasTotal = 0.0;
        double media = 0.0;


        while(verificador) {
            System.out.print("Digite a nota do aluno: ");
            double nota = entrada.nextDouble();
            
            if(nota == -1) {
                if(notas > 1){
                    media = notasTotal / notas;

                }
                
                System.out.printf("Você digitou %.0f notas\nMedia do aluno: %.2f\nSoma Total: %.2f\n", notas, media, notasTotal);
                verificador = false;

            } else if(nota >= 0.0 && nota <= 10.0) {
                notas++;
                notasTotal = notasTotal + nota;

            } else {
                System.out.println("Você digitou uma nota inválida, por favor tente novamente!");

            }

        }

        entrada.close();

    }

}
