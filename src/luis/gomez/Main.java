package luis.gomez;

import java.util.Scanner;

public class Main {


    /* Crea una clase denominada Triangulo, que tenga como constructor un método con tres parámetros,
    //que son la longitud de los lados del mismo. Crea una excepción denominada IlegalTrianguloExcepcion
     que se lance cuando crear un triangulo no válido. Los tres lados a, b y c de un triángulo deben
     satisfacer la desigualdad triangular: cada uno de los lados no puede ser más largo que la suma de los otros dos.*/


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        // Creamos un objeto d ela clase triangulo
        Triangulo triangulo1=new Triangulo(1,1,1);

        System.out.println("Introduce el valor del lado A");
        triangulo1.setLadoA(sc.nextDouble());
        System.out.println("Introduce el valor del lado B");
        triangulo1.setLadoB(sc.nextDouble());
        System.out.println("Introduce el valor del lado C");
        triangulo1.setLadoC(sc.nextDouble());

        //Aqui llamamos al metodo calcularLados que esta dentro de la clase Triangulo

        Triangulo.calcularLados(triangulo1.ladoA,triangulo1.ladoB,triangulo1.ladoC);

    }
}
