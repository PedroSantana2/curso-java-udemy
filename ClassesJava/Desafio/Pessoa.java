package Desafio;

public class Pessoa {
    
    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nomePessoa, double pesoPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;

    }

    void comer(Comida comidaComer) {
        this.pesoPessoa += comidaComer.pesoComida;

    }

}
