public class ProdutoTeste {

    public static void main(String[] args) {

        Produto.desconto = 50;
        
        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 1000;

        Produto produto2 = new Produto();
        produto2.nome = "Caneta";
        produto2.preco = 3;

        System.out.println(produto1.valorComDesconto()); 

    }
    
}
