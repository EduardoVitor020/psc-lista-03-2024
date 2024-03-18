package Classe;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String operacao;
        double valor1,valor2,cal;

        System.out.println("operaçoes mat");
        System.out.println("valor 1");
        valor1=entrada.nextDouble();
        System.out.println("valor 2");
        valor2=entrada.nextDouble();

        System.out.println("Qual a operacao que sera realizada?");
        operacao = entrada.next();
switch(operacao) {
    case "+" -> {
        cal=valor1+valor2;
        System.out.println("resultado é" + cal);
}

case "-" ->{
    cal=valor1-valor2;
    System.out.println("resultado" + cal);
}
case "*" -> {
    cal=valor1*valor2;
    System.out.println("resultado" + cal);
}
case "/" -> {
    cal=valor1/valor2;
System.out.println("resultado" + cal);

}
default -> System.out.println( "erro");

}
entrada.close();

    }
}
