// Classe Arma
public class Arma {
    private String nome;
    private int danoFisico;
    private int danoMagico;
    private String tipo;

    public Arma(String nome, int danoFisico, int danoMagico, String tipo) {
        this.nome = nome;
        this.danoFisico = danoFisico;
        this.danoMagico = danoMagico;
        this.tipo = tipo;
    }

    public int causarDano(String tipo) {
        if(tipo.equalsIgnoreCase("fisico")) {
            return danoFisico;
        } else if(tipo.equalsIgnoreCase("magico")) {
            return danoMagico;
        } else {
            return 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
