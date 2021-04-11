package ClassesJava;

public class Produto {

    String nome;
    double preco;
    static double desconto = 25;

    double valorComDesconto() {
        return preco - (preco * (desconto/100));

    }
    
}
