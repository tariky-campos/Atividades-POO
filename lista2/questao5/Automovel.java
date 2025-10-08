public class Automovel {
    private String modelo;
    private int ano;
    private double quilometragem;
    private double combustivel;
    private double quilometrosPorLitro;
    
    // Construtor
    public Automovel(String modelo, int ano, double kmPorLitro) {
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = 0;
        this.combustivel = 0;
        this.quilometrosPorLitro = kmPorLitro;
    }
    
    // Abastecer o veículo
    public void abastecer(double litros) {
        this.combustivel += litros;
        System.out.println("Abastecidos " + litros + " litros. Tanque: " + this.combustivel + "L");
    }
    
    // Simular viagem
    public void trafegar(double distancia) {
        double combustivelNecessario = distancia / quilometrosPorLitro;
        
        if (combustivelNecessario <= combustivel) {
            this.quilometragem += distancia;
            this.combustivel -= combustivelNecessario;
            System.out.println("Viagem de " + distancia + " km realizada!");
        } else {
            System.out.println("Combustível insuficiente para viajar " + distancia + " km");
        }
    }
    
    // Ver combustível no tanque
    public double combustivelNoTanque() {
        return combustivel;
    }
    
    // Ver quilometragem
    public double quilometragemCarro() {
        return quilometragem;
    }
    
    // Main para teste
    public static void main(String[] args) {
        Automovel meuCarro = new Automovel("Fusca", 2020, 12.5);
        
        meuCarro.abastecer(40);
        meuCarro.trafegar(100);
        meuCarro.trafegar(200);
        meuCarro.trafegar(300); // Deve falhar por falta de combustível
        
        System.out.println("\n--- Status Final ---");
        System.out.println("Quilometragem: " + meuCarro.quilometragemCarro() + " km");
        System.out.println("Combustível no tanque: " + meuCarro.combustivelNoTanque() + "L");
    }
}