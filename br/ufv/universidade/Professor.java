package br.ufv.universidade;
public class Professor{
    private String nome;
    private int idade;

    // Construtor
    public Professor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Metodos setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    // Metodos getters
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    @Override
    public String toString(){
        return "Nome: " +(nome)+", Idade: " +(idade)+"\n";
    }
}