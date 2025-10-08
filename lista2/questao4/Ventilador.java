public class Ventilador {
    private int velocidade;
    private String modelo;
    private int ano;
    private boolean ligado;
    
    // Construtor
    public Ventilador(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
        this.ligado = false;
    }
    
    // Métodos de acesso
    public int getVelocidade() {
        return velocidade;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public boolean isLigado() {
        return ligado;
    }
    
    // Métodos para controle
    public void ligar() {
        this.ligado = true;
        this.velocidade = 1;
    }
    
    public void desligar() {
        this.ligado = false;
        this.velocidade = 0;
    }
    
    public void aumentarVelocidade() {
        if (ligado && velocidade < 3) {
            velocidade++;
        }
    }
    
    public void diminuirVelocidade() {
        if (ligado && velocidade > 1) {
            velocidade--;
        }
    }
    
    // Main
    public static void main(String[] args) {
        Ventilador meuVentilador = new Ventilador("Arno Turbo", 2023);
        meuVentilador.ligar();
        meuVentilador.aumentarVelocidade();
        
        System.out.println("Detalhes do Ventilador:");
        System.out.println("Modelo: " + meuVentilador.getModelo());
        System.out.println("Ano: " + meuVentilador.getAno());
        System.out.println("Ligado: " + meuVentilador.isLigado());
        System.out.println("Velocidade: " + meuVentilador.getVelocidade());
    }
}