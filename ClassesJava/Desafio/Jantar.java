package Desafio;

public class Jantar {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 100);
        Comida c1 = new Comida("Maça", 10);
        Comida c2 = new Comida("Laranja", 20);
        
        System.out.println(p1.pesoPessoa);
    
        p1.comer(c1);

        System.out.println(p1.pesoPessoa);

        p1.comer(c2);

        System.out.println(p1.pesoPessoa);

    }
    
}
