import java.util.Scanner;

public class SequênciaDeFibonacciSimples {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("|----------- Sequência de Fibonacci -----------|");

        System.out.print("Quantos termos deseja ver: ");
        int termos = entrada.nextInt();

        int n1 = 0;
        int n2 = 1;

        System.out.println("Sequência:");

        for (int i = 1; i <= termos; i++) {

            System.out.print(n1 + " ");

            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;

        }

    }
}