package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class MediaTurma {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = entrada.nextInt();

        System.out.print("Digite a quantidade de notas por aluno: ");
        int quantidadeNotas = entrada.nextInt();

        double[][] notasTurma = new double[quantidadeAlunos][quantidadeNotas];

        double soma = 0;
        for (int aluno = 0 ; aluno < notasTurma.length ; aluno++) {
            for (int provas = 0 ; provas < quantidadeNotas ; provas++) {
                System.out.printf("Digite a %dª nota do %dº aluno: ", provas + 1, aluno + 1);

                notasTurma[aluno][provas] = entrada.nextDouble(); 
                soma += notasTurma[aluno][provas];

            }

        }

        double media = soma / (quantidadeAlunos * quantidadeNotas);
        System.out.printf("A media da sala é: %.2f\n", media);

        entrada.close();

    }
    
}
