// Classe Pessoa
class Pessoa {
    private String nome;
    private String genero;
    private int idade;
    private double altura;
    private double peso;
    
    // Getters
    public String getNome() { return nome; }
    public String getGenero() { return genero; }
    public int getIdade() { return idade; }
    public double getAltura() { return altura; }
    public double getPeso() { return peso; }
    
    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setAltura(double altura) { this.altura = altura; }
    public void setPeso(double peso) { this.peso = peso; }
}

// Classe Cliente (herda de Pessoa)
class Cliente extends Pessoa {
    private String id;
    private String cadastro;
    private boolean estaCadastrado;
    
    // Método cadastrar
    public void cadastrar(String cadastro) {
        this.cadastro = cadastro;
        this.estaCadastrado = true;
    }
    
    // Getters e Setters específicos
    public String getId() { return id; }
    public String getCadastro() { return cadastro; }
    public boolean isEstaCadastrado() { return estaCadastrado; }
    
    public void setId(String id) { this.id = id; }
}

// Classe Paciente (herda de Cliente)
class Paciente extends Cliente {
    
    // Sobrescrevendo método cadastrar
    @Override
    public void cadastrar(String cadastro) {
        super.cadastrar(cadastro);
        System.out.println("Paciente sendo cadastrado: " + getNome());
    }
    
    // Método para calcular IMC
    public double calculaIMC() {
        double altura = getAltura();
        double peso = getPeso();
        if (altura > 0) {
            return peso / (altura * altura);
        }
        return 0;
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        
        // Criando e usando objeto Cliente
        Cliente cliente = new Cliente();
        cliente.setNome("Maria Silva");
        cliente.setGenero("Feminino");
        cliente.setIdade(30);
        cliente.setId("CLI001");
        cliente.cadastrar("Cadastro Comum");
        
        System.out.println("=== CLIENTE ===");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("ID: " + cliente.getId());
        System.out.println("Cadastrado: " + cliente.isEstaCadastrado());
        
        // Criando e usando objeto Paciente
        Paciente paciente = new Paciente();
        paciente.setNome("João Santos");
        paciente.setGenero("Masculino");
        paciente.setIdade(45);
        paciente.setAltura(1.75);
        paciente.setPeso(80.5);
        paciente.setId("PAC001");
        
        System.out.println("\n=== PACIENTE ===");
        paciente.cadastrar("Cadastro Médico");
        
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Idade: " + paciente.getIdade());
        System.out.println("Altura: " + paciente.getAltura() + "m");
        System.out.println("Peso: " + paciente.getPeso() + "kg");
        System.out.println("IMC: " + paciente.calculaIMC());
        System.out.println("Está cadastrado: " + paciente.isEstaCadastrado());
        
        // Modificando atributos do Paciente
        paciente.setPeso(78.0);
        System.out.println("\nPeso atualizado: " + paciente.getPeso() + "kg");
        System.out.println("Novo IMC: " + paciente.calculaIMC());
    }
}