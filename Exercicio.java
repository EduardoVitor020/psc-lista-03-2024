package Classe;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        
        int valor01,valor02,valor03,media;
        Scanner entrada = new Scanner(System.in);


        System.out.println("Informe o primeiro valor: ");
        valor01 = entrada.nextInt();

        System.out.println("Informe o segundo valor: ");
        valor02 = entrada.nextInt();

        System.out.println("Informe o terceiro valor: ");
        valor03 = entrada.nextInt();

        media = (valor01 + valor02 + valor03) /3;

        if (valor01 > valor02 && valor01> valor03) {
            System.out.println("O maior valor é :" + valor01);
        }

        else if ( valor02 > valor01 && valor02 > valor03) {
            System.out.println("O maior valor é: " + valor02);

        }
        else{
            System.out.println("O maior valor é: " + valor03);
        }

        if (valor01 < valor02 && valor01 < valor03) {
            System.out.println("O menor valor é: " + valor01);

        }
        else if ( valor02 < valor01 && valor02 < valor03) {
            System.out.println("O menor valor é: " + valor02);

        }
        else {
            System.out.println("O menor valor é: " + valor03);

        }
System.out.println("A media dos valores são de: " + media);
entrada.close();


         
        


    }
}
