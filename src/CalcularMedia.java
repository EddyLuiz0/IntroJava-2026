import java.util.Scanner;
public class CalcularMedia {
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("|-----------Explicação de vetor-----------|");
        System.out.println("|-----------Calculando a media-----------|");
        float soma = 0;
        //criar vetor
        float[] notas = new float[5];
        for (int i=0; i<5; i++) {
            System.out.println("Informe a nota:"+(i+1));
            //armazena o valor da posição i do vetor
            notas[i] = entrada.nextFloat();
            //soma a nota
            soma+=notas[i];

        }
        System.out.println("A média é:"+soma/5);

    }
}
