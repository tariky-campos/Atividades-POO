
public class Texto{

    // Metodos
    public int contarVogais(String vogais){
        int cont =0;
        for(int i=0; i< vogais.length(); i++){
            char c = vogais.charAt(i);
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
             || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                cont++;
             }
        }
        return cont; 
    }
    public String conjugarVerbo(String verbo){
        if(!verbo.endsWith("ar")){
            return "Erro! palavra nao terminada em (ar)\n";
        }
        String raiz = verbo.substring(0, verbo.length()-2);

        StringBuilder sb = new StringBuilder();
        sb.append("Eu ").append(raiz).append("o\n");
        sb.append("Tu ").append(raiz).append("as\n");
        sb.append("Ele ").append(raiz).append("a\n");
        sb.append("Nós ").append(raiz).append("amos\n");
        sb.append("Vós ").append(raiz).append("ais\n");
        sb.append("Eles ").append(raiz).append("am\n");
        
        
        return sb.toString();
    }
    // Retornar o inverso da palavra
    public String obterInverso(String inverso){
        String invertida = "";
        for(int i = inverso.length()-1; i>=0; i--){
            invertida += inverso.charAt(i);
        }
        System.out.println(invertida);
        return invertida;
    }
    //Um palíndromo é uma palavra que tem a propriedade de poder ser lida tanto da direita para a esquerda como da esquerda
    //para a direita. Exemplos: ovo, arara, rever, asa, osso)

    public boolean isPalindromo(String palindromo){
        String invertida = "";
        for(int i = palindromo.length()-1; i>=0; i--){
            invertida += palindromo.charAt(i);
        }
        if(palindromo.equals(invertida)){
            return true;
            
        }else{
            return false;
        }
    }
}