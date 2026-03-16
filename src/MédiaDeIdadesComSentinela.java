import java.util.Scanner;
public class MédiaDeIdadesComSentinela {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------Média de Idades com Sentinela-------------");
        System.out.println("Digite a idade do aluno:");
        int idade = entrada.nextInt();
        int soma = 0;
        int contador = 0;

        while (idade >= 0 ){
            soma = soma + idade;
            contador++;
            System.out.println("Digite a idade do aluno:");
            idade = entrada.nextInt();
        }
        if (contador>0){
            double media =(double) soma/contador;
            System.out.println("A media das idade dos alunos é:"+media);
        }
    }
}

