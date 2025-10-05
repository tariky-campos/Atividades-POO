public class Usuario{
    public static void main(String[] args){
        CondicionadorDeAr condicionador = new CondicionadorDeAr();
        
        // aumentar para 30 graus
        for(int i = 0; i< 10; i++){
            condicionador.aumentarTemperatura();
            
        }

        condicionador.ligar();
        for(int i = 0; i< 10; i++){
            condicionador.aumentarTemperatura();
        }

        // diminuir para 15 graus
        for(int i =0; i< 15; i++){
            condicionador.reduzirTemperatura();
        }
    }

}