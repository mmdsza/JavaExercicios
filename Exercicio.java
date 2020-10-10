import java.util.Scanner;
public class Exercicio{
    public static class Pessoa{

        // estrutura da classe pessoa
        String nome;
        int idade;
        float salario;

        // Construtor da classe pessoa

        Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
            //this.salario = salario;
        }


    }
    public static class Funcionario extends Pessoa{
        String cargo;
        float salario;
        String nome;
        int idade;


        Funcionario(String cargo, float salario, String nome, int idade){
            this.cargo = cargo;
            this.salario = salario;
        }

    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite seu nome, idade e salario, por favor.");
        Pessoa pessoa1 = new Pessoa(myObj.nextLine(), myObj.nextInt());
        Funcionario funcionario1 = new Funcionario(myObj.nextLine(), myObj.nextFloat());
        System.out.println("Ola, "+pessoa1.nome);
        System.out.println("Sua idade e: "+pessoa1.idade);
        System.out.println("Seu salario: "+ funcionario1.salario);

        //System.out.println("Informe seu nome, idade e salario");
    }
}