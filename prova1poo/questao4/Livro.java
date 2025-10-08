public class Livro{
    private String autor;
    private String titulo;
    private int ano;
    private double preco;
    private int qtdEmEstoque;

    public Livro(String autor, String titulo, int ano, int qtdEmEstoque, double preco){
        this.autor = autor;
        this.titulo = titulo;
        this.ano = ano;
        this.preco = preco;
        this.qtdEmEstoque = qtdEmEstoque;

    }

    public double getPreco(){
        return preco;
    }
    public int getQtdEmEstoque(){
        return qtdEmEstoque;
    }
    public void setQtdEmEstoque(int qtdEmEstoque){
        this.qtdEmEstoque = qtdEmEstoque;
    }
    public String toString(){
        return "Livro..........\n" + "Autor: "+autor+ ", Titulo: "+ titulo+"\n" + "Ano: "+ano+", Preco: "+preco+"\n "+ "Qtd em estoque atual: "+qtdEmEstoque;
    }

}