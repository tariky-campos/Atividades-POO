public class TesteDna {
    public static void main(String[] args) {
        Dna[] dna = new Dna[2];
        
        for(int i =0; i<dna.length;i++){
            System.out.println("Dna "+(i+1)+":");
            dna[i] = new Dna();
        }
        System.out.println("\n------- Resultados ------");
        System.out.println("Dna "+(1)+ "\n"+dna[0].toString());
        System.out.println("Dna "+(2)+ "\n"+dna[1].toString());
        dna[0].verificarSimilaridade(dna[1]);

        


    }
}
