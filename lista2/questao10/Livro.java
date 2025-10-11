// Classe Livro com encapsulamento
public class Livro {
    private String titulo;
    private String autor;
    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    
    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor;
    }
}

// Classe Biblioteca com baixo acoplamento
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }
    
    // Adiciona livro recebendo objeto já criado
    public void adicionarLivro(Livro livro) {
        if (livro != null) {
            livros.add(livro);
        }
    }
    
    // Remove dependência de índices e arrays
    public void listarLivros() {
        System.out.println("Livros na biblioteca:");
        for (Livro livro : livros) {
            System.out.println(livro.toString());
        }
    }
    
    public int getTotalLivros() {
        return livros.size();
    }
    
    // Método para buscar livros (flexível)
    public List<Livro> buscarPorAutor(String autor) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        // Cria os livros primeiro
        Livro livro1 = new Livro("Java Programming", "John Smith");
        Livro livro2 = new Livro("Introduction to OOP", "Alice Johnson");
        Livro livro3 = new Livro("Data Structures", "Bob Davis");
        
        // Adiciona à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        
        System.out.println("Total de livros: " + biblioteca.getTotalLivros());
        biblioteca.listarLivros();
        
        // Busca flexível
        System.out.println("\nLivros de John Smith:");
        List<Livro> livrosJohn = biblioteca.buscarPorAutor("John Smith");
        for (Livro livro : livrosJohn) {
            System.out.println(livro);
        }
    }
}