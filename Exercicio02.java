package Classe;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);

        System.out.println("Salgadinho: R$5,00 \nDigite o valor: ");
        int salgadinho01 = entrada.nextInt();
        double valorSal = ( salgadinho01 * 5);

        System.out.println("Doce: R$2,00 \nDigite o valor:");
        int doce02 = entrada.nextInt();
        double valorDoc =(doce02 * 2);

        System.out.println("Suco: R$10,00 \nDigite o valor: ");
        int suco03 = entrada.nextInt();
        double valorSuc = (suco03 * 10);

        System.out.println("Refrigerante: R$20,00 \nDigite o valor: ");
        int refrigerante04 = entrada.nextInt();
        double valorRefri = (refrigerante04 * 20);

        double soma = valorSal + valorDoc + valorSuc + valorRefri;
         
        System.out.println("O valor total é: "+ soma);
        System.out.println("Valor pago");

        double valorPag= entrada.nextDouble();
        double troco = valorPag - soma;

        if (valorPag < soma) {
            System.out.println(" O valor insuficiente:");
        
        }

        else {
            System.out.println("Troco: " +troco);
            entrada.close();
        }



    }
}
