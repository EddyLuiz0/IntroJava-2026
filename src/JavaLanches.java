import java.util.Scanner;


public class JavaLanches {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("======================================================================");
        System.out.println("=================== Bem vindos ao java lanches =======================");
        System.out.println("========================= Faça seu pedido ============================");
        System.out.println("\n101 - Cachorro Quente   (R$ 10,00)");
        System.out.println("102 - X-Burger          (R$ 15,00)");
        System.out.println("103 - X-Salada          (R$ 12,00)");
        System.out.println("Digite o codigo do pedido:");
        int opcao = entrada.nextInt();

        float valor = 0;

        switch (opcao) {
            case 101:
                System.out.println("Digite a sua idade:");
                float idade = entrada.nextFloat();

                if (idade < 12) {
                     valor = 10 * 0.5f;
                } else if (idade <= 60) {
                      valor = 10f;
                } else if (idade > 60) {
                valor = 10 * 0.7f;
            }
                System.out.println("Valor do pedido é:" + valor);
            break;

            case 102:
                System.out.println("Digite a sua idade:");
                idade = entrada.nextFloat();


                if (idade < 12) {
                    valor = 15 * 0.5f;
                } else if (idade <= 60) {
                    valor = 15f;
                } else if (idade > 60) {
                    valor = 15 * 0.7f;
                }
                System.out.println("Valor do pedido é:" + valor);
                break;

            case 103:
                System.out.println("Digite a sua idade:");
                idade = entrada.nextFloat();
                if (idade < 12) {
                    valor = 12 * 0.5f;
                } else if (idade <= 60) {
                    valor = 12f;
                } else if (idade > 60) {
                    valor = 12 * 0.7f;
                }
                System.out.println("Valor do pedido é:" + valor);
                break;

            default:
                System.out.println("Código Inválirdo.\nEscolha entre: 101, 102 ou 103");
        }

    }
}
