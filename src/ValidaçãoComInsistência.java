import java.util.Scanner;
public class ValidaçãoComInsistência {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------Validação Com Insistência-------------");
        System.out.println("Digite a nota do aluno:");
        int nt = entrada.nextInt();

        while (nt < 0 || nt > 10 ){
            System.out.println("nota invalida digite uma nota entre 0 e 10");
           nt = entrada.nextInt();
        }
        System.out.println("Nota registrada!");
    }
}
