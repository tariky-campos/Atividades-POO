// Classe abstrata Personagem
public abstract class Personagem {
    protected String nome;
    protected int pontosVida;
    protected int poder;
    protected Arma armaEquipada;

    public Personagem(String nome, int pontosVida, int poder) {
        this.nome = nome;
        this.pontosVida = pontosVida;
        this.poder = poder;
        this.armaEquipada = null;
    }

    public void equiparArma(Arma arma) {
        this.armaEquipada = arma;
    }

    public boolean possuiArma() {
        return armaEquipada != null;
    }

    public void seMachucar(int dano) {
        this.pontosVida -= dano;
        if(pontosVida < 0) pontosVida = 0;
    }

    public abstract int atacar(); // Método a ser implementado nas subclasses
}
