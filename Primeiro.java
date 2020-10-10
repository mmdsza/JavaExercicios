public class Primeiro{
    public static void main(String[] args){
        String nome = args[0];
        String sobrenome = args[1];
        int idade;
        idade = Integer.valueOf(args[2]);
        float salario;
        salario = Float.valueOf(args[3]);
        Boolean dev;
        dev = Boolean.valueOf(args[4]);
        int nascimento = 2020-idade;
        int mesesTrabalhados = Integer.valueOf(args[5]);
        float totalRecebido = mesesTrabalhados*salario;
        System.out.println("Nome: "+ nome);
        System.out.println("Sobrenome: "+ sobrenome);
        System.out.println("Idade: "+ idade);
        System.out.println("Salario: "+ salario);
        System.out.println("Dev?: "+ dev);
        System.out.println("Ano: "+ nascimento);
        System.out.println("Total Recebido: "+totalRecebido);
    }
}