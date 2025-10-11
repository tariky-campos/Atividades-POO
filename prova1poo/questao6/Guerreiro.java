// Subclasse Guerreiro
public class Guerreiro extends Personagem {
    private String armadura;

    public Guerreiro(String nome, int pontosVida, int poder, String armadura) {
        super(nome, pontosVida, poder);
        this.armadura = armadura;
    }

    @Override
    public int atacar() {
        if(possuiArma()) {
            return armaEquipada.causarDano("fisico");
        } else {
            return poder;
        }
    }
}
