import java.util.Scanner;

public class InvestimentoComJuros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("|----------- Investimento com Juros -----------|");

        System.out.print("Digite o valor do deposito inicial: ");
        double dep = entrada.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double tx = entrada.nextDouble();

        tx = tx / 100;

        double saldo = dep;

        for (int i = 1; i <= 12; i++) {

            saldo = saldo + (saldo * tx);

            System.out.printf("Mes %d saldo R$: %.2f%n", i, saldo);

        }

        System.out.printf("Saldo final após 12 meses R$: %.2f%n", saldo);
    }
}