import java.util.Scanner;
import java.util.Locale;

public class TesteProduto{
    public static void main(String[] args){

        Etiqueta etiqueta = new Etiqueta("Gucci", "Grande");
        Produto p1 = new Produto("Camisa", 1000, etiqueta);
        System.out.println(p1.toString());


        System.out.println();
        Produto p2 = new Produto("Bone", 20.5, "Vercacci", "Medio");
        System.out.println(p2.toString());


        // New product

        Scanner input = new Scanner(System.in);
        input.useLocale(java.util.Locale.US);
        
        System.out.println("\nInsira os novos dados do produto 1");

        String nome = input.nextLine();
        double preco = input.nextDouble();
        input.nextLine();
        String marca = input.nextLine();
        String tamanho = input.nextLine();

        p1.setNome(nome);
        p1.setPreco(preco);
        p1.getEtiqueta().setMarca(marca);
        p1.getEtiqueta().setTamanho(tamanho);

        System.out.println();
        System.out.println(p1.toString());

    }
}