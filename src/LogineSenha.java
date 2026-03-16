import java.util.Scanner;
public class LogineSenha {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------Login e Senha-------------");
        System.out.println("Digite o nome de usuario:");
        String login = entrada.nextLine();
        System.out.println("Digite a senha:");
        String senha = entrada.nextLine();
        while (senha.equals(login)){
            System.out.println("ERRO!\nDigite uma senha diferente do login de usuario:");
            senha = entrada.nextLine();
        }

    }

}
