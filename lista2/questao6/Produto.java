import java.util.ArrayList;
import java.util.List;

// Classe Produto
class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    // Getters
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    
    // Métodos para alterar estoque
    public void aumentarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }
    
    public void diminuirEstoque(int quantidade) {
        if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
        }
    }
    
    // Método para alterar preço
    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }
}

// Classe Main para teste
public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto("Notebook", 2500.00, 5);
        Produto produto2 = new Produto("Mouse", 89.90, 10);
        
        // Criando pedido
        Pedido pedido = new Pedido(1, "João Silva");
        
        // Adicionando produtos ao pedido
        pedido.adicionaProduto(produto1);
        pedido.adicionaProduto(produto2);
        
        // Calculando preço final
        double total = pedido.calculaPrecoFinal();
        System.out.println("Total do pedido: R$ " + total);
        
        // Finalizando pedido
        pedido.finalizarPedido();
    }
}