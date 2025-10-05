import java.util.Scanner;
import java.util.Arrays;
public class Dna{
    private char[] sequencia = new char[9];

    public Dna(){
        lerDna();
    }
    public void lerDna(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<9; i++){
            sequencia[i] = scanner.next().toUpperCase().charAt(0);
        }
    }

    public char[] getSequencia(){
        return sequencia;
    }
    public void setSequencia(char[] sequencia){
        this.sequencia = sequencia;
    }

    // toString: retorna a sequência completa como String
    public String toString() {
        String s = "";
        for (char base : sequencia) {
            s += base + " ";
        }
        return s.trim();
    }
    public int obterFrequencia(char caracter){
        int cont = 0;
        for(char b : sequencia){ // coloca a primeira letra em b
            if(b == caracter){ // se b == caracter, conta +1
                cont++;
            }
        }
        return cont;
    }
    public void verificarSimilaridade(Dna outro){
        int[] similaridade = new int[9];
        char[] outraSequencia = outro.getSequencia();

        for(int i=0;i<sequencia.length;i++){
            if(sequencia[i] == outraSequencia[i]){
                similaridade[i] = 1;
            }else{
                similaridade[i] = 0;
            }
        }
        System.out.println(Arrays.toString(similaridade));

    }
}