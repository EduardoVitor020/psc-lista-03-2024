package Classe;
import java.util.Scanner;
public class Exercicio04 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o codigo do calculo ( 1 para perimetro, 2 para area, 3 para volume):");
    int codigoCal = entrada.nextInt();

    System.out.println(" Digite o raio: ");
    double raio = entrada.nextDouble();

    if (codigoCal == 1) {
        double perimetro = 2 * Math.PI * raio;
        System.out.println(" perimetro do circulo: "+ perimetro);

    }

    else if (codigoCal ==2 ) {
        double area = Math.PI * Math.pow(raio,2);
        System.out.println(" area do circulo: " + area);

    }

    else if (codigoCal == 3) {
        double volume = (4.0 / 3.0 ) * Math.PI * Math.pow(raio, 3);
        System.out.println("voluma da esfera é" + volume);
    }

    else {
        System.out.println("codigo do calculo invalido,escolha de 1 a 3");
    }
     entrada.close();
     
  }  
}
