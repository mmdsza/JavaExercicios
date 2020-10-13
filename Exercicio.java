import java.util.Scanner;
public class Exercicio{
    public static class Pessoa{

        // estrutura da classe pessoa
        String nome;
        int idade;
        //float salario;

        // Construtor da classe pessoa

        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
            //this.salario = salario;
        }


    }
    public static class Funcionario extends Pessoa{
        String cargo;
        int salario;
        //String nome;
        //int idade;


        public Funcionario(String cargo, int salario){
            this.cargo = cargo;
            this.salario = salario;
            //this.nome = nome;
            //this.idade = idade;
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite seu nome, idade e salario, por favor.");
        Pessoa pessoa1 = new Pessoa(myObj.nextLine(), myObj.nextInt());
        Funcionario funcionario1 = new Funcionario(myObj.nextLine(), myObj.int());
        System.out.println("Ola, "+pessoa1.nome);
        System.out.println("Sua idade e: "+pessoa1.idade);
        System.out.println("Seu salario: "+ funcionario.salario);

        //System.out.println("Informe seu nome, idade e salario");
    }
}