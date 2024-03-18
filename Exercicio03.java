package Classe;
import java.util.Scanner;
public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
System.out.println("Digite o numero pro coeficiente 'a': ");
float a = entrada.nextFloat();

System.out.println("Digite o numero pro coeficiente 'b': ");
float b = entrada.nextFloat();

System.out.println("Digite o numero pro coeficiente 'c': ");
float c = entrada.nextFloat();

if (a == 0 && b == 0 && c !=0) {
    System.out.println("coeficiente esta incorreto");  
}

else if (a== 0 && b !=0) {

    float raizReal = -c / b;

    System.out.println("Essa é a equação de primeiro grau");
    System.out.println(" a raiz da equação é" + raizReal);
}
 else {

  
    float delta = b * b -4 * a * c;
}
 
if (delta < 0 ) {
     System.out.println("essa equação não tem raiz");

    }

else if (delta == 0) {

float raizReal = -b / (2 * a);
System.out.println("esta equação tem duas raiz");
System.out.println(" as raizes são:" + raizReal + "e" + raizReal);
}

else {
    float raizReal01 = ( -b + Math.sqrt(delta)) / (2 * a);
    float raizReal02 = ( -b + Math.sqrt(delta)) / (2 * a);
     System.out.println(" esta equação tem raizes diferentes:");
     System.out.println(" as raizes são:" + raizReal01 + "e" + raizReal02);
}

entrada.close();
    }
    

}
