import java.util.Scanner;
public class techjava {
    public static void main(String[] args){
        String nome = "";
        double valor = 0;
        int opcao = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("|------------------Bem vindo a TechJava------------------|");
        System.out.println("Informe o seu nome:");
        nome = entrada.nextLine();
        System.out.println("Informe o valor total da compra R$:");
        valor = entrada.nextDouble();
        do {
            System.out.println("Digite a opção desejada \n 1. Pagamento avista(15% de desconto) \n 2. Parcelamento no Cartão(Até 5x sem juros \n 3. Crediario da loja (10 parcelas com juros de 2% ao mes sobre o valor bruto \n 0. Cancelar venda");
            opcao = entrada.nextInt();
            switch (opcao){
                case 1:
                    double avista = valor * 0.85;
                    System.out.println("Valor a pagar é R$:"+avista);
                    break;
                case 2:
                    double cartao = valor / 5;
                    System.out.println("O valor a pagar é 5X de R$: " + cartao + " Sem juros");
                    break;
                case 3:
                    double crediario1 = valor * 1.20;
                    double crediario = crediario1/10;
                    System.out.println("O valor da compra fica R$: "+crediario1+"\n E parcelas de R$: "+crediario+" Com juros de 2% ao mes");
                    break;
                case 0:
                    System.out.println("VENDA CANCELADA!");
                    break;
                default:
                    System.out.println("Opção invalida!");
                }

            }
        while (opcao!=0);
        }

    }


