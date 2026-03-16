import java.util.Scanner;

public class ATabuadaPersonalizada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------------Tabuada Personalizada--------------");
        System.out.println("Digite um numero inteiro:");
        int inteiro = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(inteiro + " x " + i + " = " + (inteiro * i));
        }
    }
}
