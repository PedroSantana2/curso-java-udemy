import java.util.Locale;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        double soma = 0;

        for(int a = 1; a <= 2; a++) {
            System.out.printf("Digite a %dª nota do aluno: ", a);
            double nota = entrada.nextDouble();
            
            soma += nota;

        }
        
        double media = soma / 2;
        System.out.printf("A média do aluno foi: %.2f\n", media);

        if(media >= 7) {
            System.out.println("Aprovado!");

        } else if(media < 7 && media > 4) {
            System.out.println("Recuperação!");

        } else {
            System.out.println("Reprovado!");

        }

        entrada.close();

    }

}
