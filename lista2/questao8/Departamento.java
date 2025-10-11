// Classe Departamento
class Departamento {
    private String nome;
    private int codigo;
    
    public Departamento(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
}

// Classe Professor
class Professor {
    private String nome;
    private String email;
    private String endereco;
    private Departamento departamento; // Relação: Professor pertence a um Departamento
    
    public Professor(String nome, String email, String endereco, Departamento departamento) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.departamento = departamento;
    }
}

// Classe Disciplina
class Disciplina {
    private String titulo;
    private int codigo;
    private int cargaHoraria;
    private Professor professor; // Relação: Disciplina é ministrada por um Professor
    
    public Disciplina(String titulo, int codigo, int cargaHoraria, Professor professor) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }
}

// Classe Turma
class Turma {
    private int id;
    private String ano;
    private String sala;
    private String horario;
    private Disciplina disciplina; // Relação: Turma é de uma Disciplina
    
    public Turma(int id, String ano, String sala, String horario, Disciplina disciplina) {
        this.id = id;
        this.ano = ano;
        this.sala = sala;
        this.horario = horario;
        this.disciplina = disciplina;
    }
}

// Classe Aluno
class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private String email;
    private String endereco;
    private Professor orientador; // Relação: Aluno é orientado por um Professor
    private Turma turma; // Relação: Aluno pertence a uma Turma
    
    public Aluno(String nome, int matricula, String curso, String email, String endereco, Professor orientador, Turma turma) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.email = email;
        this.endereco = endereco;
        this.orientador = orientador;
        this.turma = turma;
    }
}