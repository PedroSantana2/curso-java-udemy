package Desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Pedro");

        Produto p1 = new Produto("Lapis", 10);
        Produto p2 = new Produto("Caneta", 5);
        Produto p3 = new Produto("Carro", 100_000);

        Item i1 = new Item(p1, 10);
        Item i2 = new Item(p2, 1);
        Item i3 = new Item(p3, 1);

        c1.comprarItem(i1);
        c1.comprarItem(i2);
        c1.comprarItem(i3);

        System.out.println(c1.getValorTotal());
        
    }
    
}
