package br.ufv.universidade;

public class Disciplina{

    private String nome;
    private boolean pratica; 

    // Construtor
    public Disciplina(String nome, boolean pratica){
        this.nome = nome;
        this.pratica = pratica;
    }

    // Metodos getters

    public String getNome(){
        return nome;
    }
    public boolean getPratica(){
        return pratica;
    }

    // Metodos setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPratica(boolean pratica){
        this.pratica = pratica;
    }
    
    @Override
    public String toString(){
        return "Nome da sala: "+(nome)+ ", Prática: " +(pratica)+"\n";
    }
}