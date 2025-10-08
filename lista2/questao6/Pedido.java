
// Classe Pedido
class Pedido {
    private int id;
    private String nomeCliente;
    private double valorPedido;
    private List<Produto> produtos;
    
    public Pedido(int id, String nomeCliente) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.produtos = new ArrayList<>();
        this.valorPedido = 0;
    }
    
    // b. Adicionar produto ao pedido
    public void adicionaProduto(Produto produto) {
        this.produtos.add(produto);
    }
    
    // c. Calcular preço final com 10% de acréscimo
    public double calculaPrecoFinal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        this.valorPedido = total * 1.10; // Acrescenta 10%
        return this.valorPedido;
    }
    
    // d. Finalizar pedido e descontar estoque
    public void finalizarPedido() {
        System.out.println("=== RECIBO ===");
        System.out.println("Pedido ID: " + id);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("\nProdutos:");
        
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + ": R$ " + produto.getPreco());
            if (produto.getQuantidadeEstoque() > 0) {
                produto.diminuirEstoque(1);
                System.out.println("  Estoque atualizado: " + produto.getQuantidadeEstoque());
            } else {
                System.out.println("  SEM ESTOQUE!");
            }
        }
        
        System.out.println("\nTotal: R$ " + calculaPrecoFinal());
        System.out.println("Pedido finalizado!");
    }
}
