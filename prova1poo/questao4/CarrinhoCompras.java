import java.util.List;
import java.util.ArrayList;

public class CarrinhoCompras{
    private int id;
    List<Livro> lista = new ArrayList<>();
    //

    public CarrinhoCompras(int id){
        this.id = id;
        
    }
    public void adicionaItem(Livro livro){
        lista.add(livro);
        int qtd = livro.getQtdEmEstoque();
        livro.setQtdEmEstoque(qtd-1);
        
    }


    public void fecharPedido(){
        int precoTotal = 0;

        //
        for(Livro livro : lista){
            System.out.println(livro.toString());
        }

        for(Livro livro : lista){
            precoTotal += livro.getPreco();
        }
        System.out.println("Preço total: "+precoTotal);

    }
    
}