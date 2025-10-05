import java.util.Scanner;

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
}