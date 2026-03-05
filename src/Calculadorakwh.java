import java.util.Scanner;

public class Calculadorakwh {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n======================================================");
        System.out.print("\nDigite o nome do cliente:");
        String nome = entrada.nextLine();

        System.out.print("Digite a leitura anterior:");
        float leituraan = entrada.nextFloat();//leitura anterior

        System.out.print("Digite a leitura atual:");
        float leituraat = entrada.nextFloat(); //Leitura atual

        //Calculo da leitura base
        float consumo = leituraat - leituraan;
        float valorbase= consumo*0.6f;


        //regra de negocio
        String bandeira = "";
        float adicional = 0;

        if (consumo <= 100){
            bandeira="Verde";
        } else if (consumo <= 200){
            bandeira="Amarela";
            adicional=2f;//taxa extra
        }else if (consumo <= 300){
            bandeira="Vermelha";
            adicional=5f;//taxa extra
        } else {
            bandeira = "Preta";
            adicional = 10f;

        }
        float valorfinal = valorbase+adicional;
        //saida final
        System.out.println("\nCliente:"+nome);
        System.out.printf("\nConsumo total:%.2f%n",consumo);
        System.out.println("\nCor da bandeira:"+ bandeira);
        System.out.printf("\nValor final a pagar: R$ %.2f%n", valorfinal);

    }
}
