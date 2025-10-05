package br.ufv.teste;

import br.ufv.universidade.Disciplina;
import br.ufv.universidade.Atribuicao;
import br.ufv.universidade.Professor;

public class TesteAtribuicao{

    public static void main(String[] args){
        Professor prof = new Professor("Flavia", 54);
        Disciplina dis = new Disciplina("Quimica", true);
        Atribuicao atributo = new Atribuicao(prof,dis);

        System.out.printf(atributo.toString());
    }
}