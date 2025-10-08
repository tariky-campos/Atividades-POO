// Subclasse Mago
public class Mago extends Personagem {
    private String magia;

    public Mago(String nome, int pontosVida, int poder, String magia) {
        super(nome, pontosVida, poder);
        this.magia = magia;
    }

    @Override
    public int atacar() {
        if(possuiArma()) {
            return armaEquipada.causarDano("magico");
        } else {
            return poder;
        }
    }

    public int usarPocao(String pocao) {
        // Implementação simples, pode aumentar vida ou poder dependendo da poção
        if(pocao.equalsIgnoreCase("vida")) {
            this.pontosVida += 10;
            return 10;
        } else if(pocao.equalsIgnoreCase("poder")) {
            this.poder += 5;
            return 5;
        } else {
            return 0;
        }
    }
}
