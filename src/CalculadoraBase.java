import java.util.Scanner;

public class CalculadoraBase {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um Numero");
        float n1 = entrada.nextFloat();
        System.out.println("Informe um Numero");
        float n2 = entrada.nextFloat();
        System.out.println("Informe um operador +,-,* ou /");
        String operador = entrada.next();
        float resultado = 0;
        switch (operador){
            case "+": resultado = n1+n2;break;
            case "-": resultado = n1-n2;break;
            case "*": resultado = n1+n2;break;
            case "/": resultado = n1/n2;break;
            default: System.out.println("operador invalido"); return;

        }
        System.out.println("Resultado:"+resultado);

    }
}
