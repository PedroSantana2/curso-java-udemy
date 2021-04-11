package Arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        System.out.print("Digite a quantidade de notas: ");
        
        int tamanhoArray = entrada.nextInt();
        double[] notas = new double[tamanhoArray];
        double soma = 0;

        for(int i = 0 ; !(i == tamanhoArray) ; i++) {
            int indice = i + 1;
            System.out.printf("Digite o valor da %dª nota: ", indice);
            
            notas[i] = entrada.nextDouble(); 

        }

        for(double nota : notas) {
            soma += nota;

        }

        System.out.println(Arrays.toString(notas));
        System.out.println(soma / tamanhoArray);
        entrada.close();

    }
    
}
