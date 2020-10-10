import java.util.Scanner;

public class Try{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Digite seu nome, sobrenome, idade e salario: ");

        // Strings entrando

        String nome = myObj.nextLine();
        String sobrenome = myObj.nextLine();

        // Numeros entrando

        int idade = myObj.nextInt();
        float salario = myObj.nextFloat();

        // Chutando dados para o usuario

        System.out.println("Ola, %s"+" " + sobrenome, nome);
        System.out.println("Voce tem "+idade+" anos e recebe "+salario+" por mes, certo?");

        
    }
}