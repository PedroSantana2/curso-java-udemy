package OrientacaoObjetos.Compras;

import java.util.ArrayList;

public class Compra {
    
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    double getValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += (item.preco * item.quantidade);
            
        }

        return total;

    }

}
