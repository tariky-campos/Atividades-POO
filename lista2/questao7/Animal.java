// Classe Animal (superclasse)
class Animal {
    public void fazerSom() {
        System.out.println("Animal fazendo som...");
    }
}

// Classe Cachorro (subclasse)
class Cachorro extends Animal {
    // Sobrescrevendo o método fazerSom
    @Override
    public void fazerSom() {
        System.out.println("Au Au!");
    }
    
    // Método especializado da classe Cachorro
    public void ehCachorro() {
        System.out.println("Isto é um cachorro");
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        // Instância de Animal
        Animal animal = new Animal();
        // Instância de Cachorro
        Cachorro cachorro = new Cachorro();
        
        // Chamando fazerSom() em ambos
        System.out.println("Animal:");
        animal.fazerSom();
        
        System.out.println("\nCachorro:");
        cachorro.fazerSom();
        
        // Chamando método específico do Cachorro
        cachorro.ehCachorro();
    }
}