import java.util.Scanner;

public class OContadorDePares {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------O Contador de Pares -------------");
        System.out.println("Digite o primeiro numero inteiro:");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero inteiro");
        int num2 = entrada.nextInt();
            int pares = 0;
        for (int i= num1; i <= num2; i++ ){
            if (i %2==0){
                System.out.println("Numeros pares:"+i);
            }
        }


    }

}
