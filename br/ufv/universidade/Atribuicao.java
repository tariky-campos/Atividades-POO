package br.ufv.universidade;

public class Atribuicao{

    private Professor professor;
    private Disciplina disciplina;


    public Atribuicao(Professor professor, Disciplina disciplina){
        this.professor = professor;
        this.disciplina = disciplina;

    }
    
    //Metodos getters
    public Professor getProfessor(){
        return professor;
    }
    public Disciplina getDisciplina(){
        return disciplina;
    }

    //Metodos setters
    public void setProfessor(Professor professor){
        this.professor =  professor;
    }
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
    
    @Override
    public String toString(){
        return "\nProfessor: " +(professor)+"Disciplina: " +(disciplina)+"\n";

    }
}