public class TesteDna {
    public static void main(String[] args) {
        Dna[] dna = new Dna[4];
        
        for(int i =0; i<dna.length;i++){
            System.out.println("Dna "+(i+1)+":");
            dna[i] = new Dna();
        }
        System.out.println("\n------- Resultados ------");
        for(int i=0;i<dna.length;i++){
            System.out.println("Dna "+(i+1)+ "\n"+dna[i].toString());
            int freq = dna[i].obterFrequencia('A');

            if(freq > 2){
                System.out.println("Quantidade > 2 ✅");
            }else{
                System.out.println("Quantidade < 2 ❌");
            }
        }

    }
}
