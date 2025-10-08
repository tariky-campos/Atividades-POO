public class Main{
    public static void main(String[] args){
        Livro livro1 = new Livro("Tariky", "Dormindo muito", 2003, 45, 150);
        Livro livro2 = new Livro("Duke", "Aquela garota", 2025, 10, 4786);
        CarrinhoCompras carrinho = new CarrinhoCompras(1);
        
        carrinho.adicionaItem(livro1);
        carrinho.fecharPedido();

    }
}