package OrientacaoObjetos.Desafio;

import java.util.ArrayList;

public class Cliente {

    ArrayList<Compra> listaDeCompras = new ArrayList<>();
    String nome;

    Cliente(String nome) {
        this.nome = nome;

    }

    double getValorTotal() {
        double valorTotal = 0;
        for (Compra compra : listaDeCompras) {
            for (Item item : compra.listaDeItens) {
                valorTotal += (item.quantidade * item.produto.precoDoProduto);
                
            }

       }

       return valorTotal;

    }

    void comprarItem(Item item) {
        listaDeCompras.add(new Compra(item));

    }

}
