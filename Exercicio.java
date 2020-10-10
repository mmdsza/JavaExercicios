import java.util.Scanner;
public class Exercicio{
    public static class Pessoa{

        // estrutura da classe pessoa
        String nome;
        int idade;
        float salario;

        // Construtor da classe pessoa

        Pessoa(String nome, int idade, float salario){
            this.nome = nome;
            this.idade = idade;
            this.salario = salario;
        }

    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite seu nome, idade e salario, por favor.");
        Pessoa pessoa1 = new Pessoa(myObj.nextLine(), myObj.nextInt(), myObj.nextFloat());
        System.out.println("Ola, "+pessoa1.nome);
        System.out.println("Sua idade e: "+pessoa1.idade);
        System.out.println("Seu salario: "+ pessoa1.salario);

        //System.out.println("Informe seu nome, idade e salario");
    }
}