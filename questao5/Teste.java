
public class Teste{
    public static void main(String[] args){
        String frase = "Ola, mundo!";
        Texto texto = new Texto();
        System.out.println(texto.contarVogais(frase));
        texto.obterInverso(frase);
        System.out.println(texto.isPalindromo(frase));
        String verbo = "amar";
        System.out.println("\n===========");
        System.out.println(texto.conjugarVerbo(verbo));
       
    }
}