import java.util.Scanner;

public class CadastroDeProdutos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        String prodM = "";
        double preco;
        double Mpreco = 0;

        System.out.println("|------------Cadastro de Produtos------------|");

        while (true) {
            System.out.println("Digite o nome do produto:");
            nome = entrada.nextLine();

            System.out.println("Digite o valor do produto:");
            preco = entrada.nextDouble();

            if (preco > Mpreco) {
                Mpreco = preco;
                prodM = nome;
            }

            System.out.println("Deseja continuar? (S/N): ");
            String resp = entrada.next();
            entrada.nextLine();

            if (resp.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("O produto mais caro é: " + prodM);
        System.out.println("O valor do produto é: " + Mpreco);
    }
}