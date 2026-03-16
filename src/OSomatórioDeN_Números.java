import java.util.Scanner;

public class OSomatórioDeN_Números {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------A Somatório de N Números----------------");
        System.out.println("Digite quantos numero deseja somar:");
                int num = entrada.nextInt();
        int soma=0;
        for (int  i = 1; i <= num; i++){
            int qnt = entrada.nextInt();

            soma = soma+qnt;

        }
        System.out.println("A soma total e:"+soma);
    }
}
