import java.util.Scanner;

public class ComandosSwitch {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 1. Cadastrar2. Colsulta3. sair");
        int opcao = entrada.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Cadastro realizado com sucesso");
                break;
            case 2:
                System.out.println("Consulta realizada com sucesso");
                break;
            case 3:
                System.out.println("Programa encerrado");
                break;
            default:
                System.out.println("Opção Invalida");
        }
    }

}
