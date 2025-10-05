public class CondicionadorDeAr{
    private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr(){
        this.ligado = false;
        this.termostato = new Termostato();
    }

    // Metodos de acesso (get)
    public boolean isLigado(){
        return ligado;
    }

    public Termostato getTermostato(){
        return termostato;
    }

    // Mudar Ligado p/ true or false
    public void ligar(){
        this.ligado = true;
        System.out.println("Esta ligado!");
    }
    public void desligar(){
        this.ligado = false;
        System.out.println("Esta desligado!");
    }

    // Aumentar temperatura
    private boolean aviso = false;
    public void aumentarTemperatura(){
        if(!ligado){
            if(!aviso){
                System.out.println("O condicionador esta desligado! Não sera possivel a mudança.");
                aviso = true;
            }
            return;
        }
        aviso = true;
        
        double tempAtual = termostato.getTemperatura();
        if(tempAtual <= 28){
            termostato.setTemperatura(tempAtual + 1);
        }else{
            System.out.println("Temperatura máxima atingida!");
        }
        
    }
    
    public void reduzirTemperatura(){
        if(!ligado){
            if(!aviso){
                System.out.println("O condicionador esta desligado! Não sera possivel a mudança.");
                aviso = true;
            }
            return;
        }
        aviso = true;

        double tempAtual = termostato.getTemperatura();
        if(tempAtual > 15){
            termostato.setTemperatura(tempAtual - 1);
        }else{
            System.out.println("Temperatura minima atingida!");
        }
        
    }
    
}