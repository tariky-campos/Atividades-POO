public class Main{
    public static void main(String[] args){
        Funcionario fun1 = new Funcionario("John",5000,22,987654321, true);
        
        fun1.darAumento(4000);
        System.out.println(fun1.toString());
    }
}