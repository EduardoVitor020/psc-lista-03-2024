package Classe;
import java.util.Scanner;
import java.util.Random;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor1,valor2;

        System.out.println("Sorteio");
        System.out.println("valor 1");
        valor1=entrada.nextInt();
        System.out.println("valor 2");
        valor2=entrada.nextInt();
        
        Random gerador = new Random();

        if(valor1>=valor2) {
            System.out.println("Valor " + valor1+" maior que " + valor2);

        }
else {
     System.out.println(" valor  "+valor2+" maior que" + valor2);

}

System.out.println("o valor sorteado é"+ gerador.nextInt(10));

if (gerador.nextInt(10) %2==0){
    System.out.println("valor par");
}
else  {
    System.out.println("valor impar");
}
entrada.close();

    }
}
