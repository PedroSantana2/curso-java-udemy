package Compras;

public class CompraTeste {

    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.itens.add(new Item("Caneta", 20, 7));
        c1.itens.add(new Item("Borracha", 1, 5));

        System.out.println(c1.getValorTotal());
        
    }
    
}
