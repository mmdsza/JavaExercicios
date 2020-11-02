import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static List<String> nomes = new ArrayList<>();
    public static List<Integer> a1 = new ArrayList<>();
    public static List<Integer> a2 = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);


    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  



    
    public static void registrar(){
        clearScreen();
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        nomes.add(nome);
        System.out.println("Digite a nota da A1 do aluno: ");
        int nota1 = sc.nextInt();
        a1.add(nota1);
        System.out.println("Digite a nota da A2 do aluno: ");
        int nota2 = sc.nextInt();
        a2.add(nota2);
        System.out.println("Aluno registrado!");

    }

    public static void consultarAluno(){
        clearScreen();
        System.out.println("Digite o codigo do aluno: ");
        int pegaIndice = sc.nextInt();
        System.out.println(nomes.get(pegaIndice)+"\n");
        System.out.println(a1.get(pegaIndice)+"\n");
        System.out.println(a2.get(pegaIndice)+"\n");
        System.out.println(((a1.get(pegaIndice)+a2.get(pegaIndice))/2));


    }


    public static void consultarBoletim(){

    }

    public static void menu(){
        clearScreen();
        Scanner seletorScan = new Scanner(System.in);
        int seletor = seletorScan.nextInt();
        System.out.println("[1] Registrar as notas de um novo aluno.\n");
        System.out.println("[2] Consultar boletim de um aluno. \n");
        System.out.println("[3] Consultar notas da turma.\n");
        System.out.println("[4] Sair.");
        switch(seletor){
            case 1:
                registrar();
                break;
            case 2:
                consultarAluno();
                break;
            case 3:
                consultarBoletim();
                break;
            case 4:
                break;
        }
        seletorScan.close();

    }


    public static void main(String[] args) {
        menu();
    }
    
}
