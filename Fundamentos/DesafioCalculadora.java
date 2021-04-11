import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa de calculadora!");

        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Informe a operação: ");
        String operacao = entrada.next();
        
        Double resultado = "+".equals(operacao) ? (numero1 + numero2) : 0;
        resultado = "-".equals(operacao) ? (numero1 - numero2) : resultado;
        resultado = "*".equals(operacao) ? (numero1 * numero2) : resultado;
        resultado = "/".equals(operacao) ? (numero1 / numero2) : resultado;

        System.out.println(resultado);

        entrada.close();
        
    }

}
