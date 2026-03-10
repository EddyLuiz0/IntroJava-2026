import java.util.Scanner;

public class Exemoplofor {
    public static void main(String[] args){
        //pede ao usuario a quantidade de vezes que o dado sera lançado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe quantas veses o dado sera lançado:");
        int qtde = entrada.nextInt();
        System.out.println("Informe qual devo acertar:");
        int num = entrada.nextInt();
        while (num <1 || num >6){
            System.out.println("Numero deve ser entre 1 e 6:");
            num = entrada.nextInt();
        }
        int conta=0; //conta quantas vezes acertou
        for (int i=1; i <= qtde; i++){
            int aleatorio = (int) (Math.random()*6+1);
            System.out.println("Dado Lançado:"+aleatorio);
            if (aleatorio == num) {
                conta++;
            }
        }
        System.out.println("Quantidade de acertos:"+conta);
        System.out.println("% de acerto:"+ ((float)conta/qtde)*100);
    }
}




