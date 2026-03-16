import java.util.Scanner;
public class FatorialDeUmNúmero {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("|------------- Fatorial de um Número -------------|");
        System.out.println("Digite um numero:");
        int num = entrada.nextInt();
        int fatorial = 1;
        for (int i=num; i >= 1; i--){
            fatorial = fatorial *i;
        }
        System.out.println("O fatorial de: "+num+"\né: "+fatorial);
    }
}
