public class Funcionario{
    private String nome;
    private double salario;
    public int idade;
    private int cpf;
    private boolean contratado;

    public Funcionario(String nome, double salario, int idade, 
    int cpf, boolean contratado){
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.cpf = cpf; 
        this.contratado = contratado;

    }
    public void darAumento(double newSalario){
        if(salario < newSalario){
            this.salario = newSalario;
        }else{
            System.out.println("Erro! Salario inferior inserido.");
        }
    }
    public void definePagamento(double salario){
        this.salario = salario;
    }
    public void contratar(double valor){
        this.contratado = true;
        definePagamento(valor);
    }
    public String getNome(){
        return nome;
    }

    @Override
    public String toString(){
        return "Funcionario.........\n"+ "Nome: "+(nome)+ ", Idade: "+(idade)+"\n" +"Salario: "+(salario)+ "\n"+"CPF: "+(cpf)+ ", Contratado = " +(contratado);
    }
}
