import java.util.Scanner;
public class ExemploDowhile {
    public static void main (String[] args){
        Scanner entrda = new Scanner(System.in);
        float saldo = 0;
        int opcao = 0;
        float saque=0;
        do {
            System.out.println("Digite uma das opções: \n 1. consultar saldo \n 2. Depositar \n 3.Sacar \n 4.sair");
            opcao = entrda.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Saldo atua da conta é:R$"+saldo); break;
                case 2:
                    System.out.println("Informe valor do deposito:R$");
                    float valor =entrda.nextFloat();
                    saldo += valor;
                    break;
                case 3:
                    System.out.println("Qual valor deseja sacar:R$");
                     valor = entrda.nextFloat();

                    if (valor <= saldo){
                        saldo -= valor;
                        System.out.println("Saque realizado com sucesso!");
                    }else System.out.println("Saldo insuficinete!");
                    break;
                case 4:
                    System.out.println("Programa sera encerrado!");

                    break;
                default:
                    System.out.println("Opão invalida!");
            }//fecha switch
        }//opcao do
        while (opcao!=4);
    }
}
