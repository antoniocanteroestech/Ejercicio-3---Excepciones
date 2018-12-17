package luis.gomez;

public class Triangulo {


    // Aqui creo los atributos del triangulo
    protected double ladoA;
    protected double ladoB;
    protected double ladoC;

    // Aqui creo el constructor con los atributos
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }



    // Aqui he creado este metodo donde he puesto el try catch para si se cumple la desigualdad siga clculando y pase al metodo tipoTriangulo ()
    // pero en caso de que no se cumple llame a la excepcion propia que he creado en la class IlegalTrianguloException

    public static void calcularLados(double ladoA,double ladoB,double ladoC) {

        try {

            if (ladoA + ladoB < ladoC||ladoB + ladoC < ladoA||ladoA+ladoC<ladoB) {
                throw new IlegalTrianguloExcepcion("hoooo");
            } else {

                System.out.println("El triangulo cumple con la desigualdad triangular, por tanto el valor de sus lados son: " + "\n" +
                        "Lado A = " + ladoA + "\n" +
                        "Lado B = " + ladoB + "\n" +
                        "Lado C = " + ladoB + "\n");

                // Y aqui he añadido esto por ir un poco más alla en el tema cálculos

                    tipoTriangulo(ladoA,ladoB,ladoC);

            }

            }catch (IlegalTrianguloExcepcion e) {

            // Resultados excepciones con varios metodos para mostrarla

            System.out.println();
            System.out.println("//// EXCEPCIONES PROPIAS ////");
            System.out.println();
            System.out.println("Metodo 1, lee desde el metodo errorException que esta dentro de la class IllegalTrianguloExcepcio:");
            System.out.println();
            System.out.println(e.errorException());

            System.out.println();
            System.out.println("////////" + "\n");

            System.out.println("Metodo 2, directamente lee la excepcion de super. esto es lo que te decia el otro dia en clase de que no sabia que forma es la más correcta ya que de esta forma queda esteticamente mal viendose ahi mi nombre o el nombre de la excepcion.");
            System.out.println();
            System.out.println(e);

            System.out.println();
            System.out.println("////////" + "\n");
            System.out.println("Sin embargo, lo que no entiendo del Metodo 1, es que ¿no podiamos haber puesto en ella directamente un metodo" +
                    " y dentro de él un if y else y haber hecho lo mismo? Y de esa forma ahorrarnos crear la" +
                    " class Exception, y el tener que poner los try y catch?");
            System.out.println("Igual es por esto por lo que me dijiste que normalmente no se usan excepciones propias?" +
                    " y en caso de querer usar excepciones (no propias), usar try y catch y las excepciones del ide, como hice en el ejercicio 1 de excepciones?");

        }
    }

    // Aqui creo este metodo, para que me diga que tipo de triangulo es segun las medidas si se ha cumplido la desigualdad triangular

    public static void tipoTriangulo(double ladoA, double ladoB, double ladoC) {

        String equilatero ="EQUILATERO";
        String isóceles ="ISÓCELES";
        String escaleno ="ESCALENO";

        if (ladoA==ladoB && ladoA==ladoC && ladoB==ladoC) {

            System.out.println("y por las medidas introducidas es un triángulo " + equilatero);
        }

        else if (ladoA==ladoC && ladoA!=ladoB && ladoC!=ladoB) {

            System.out.println("y por las medidas introducidas es un triángulo " + isóceles);
        }

        else if (ladoA!=ladoB && ladoA!=ladoC && ladoB!=ladoC) {

            System.out.println("y por las medidas introducidas es un triángulo " + escaleno);
        }

    }

    // Aqui los getter, setter y toString
    public double getLadoA(double v) {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB(double v) {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC(double v) {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public String toString() {
        return "ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", ladoC=" + ladoC;
    }

}



