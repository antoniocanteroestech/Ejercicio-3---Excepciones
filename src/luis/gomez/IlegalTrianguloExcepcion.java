package luis.gomez;

public class IlegalTrianguloExcepcion extends Exception {


    // Aqui para mostrar la excepcion desde directamente sin metodos de por medio
    public IlegalTrianguloExcepcion(String msg) {
        super("Las medidas introducidas para los lados no cumplen con la desigualdad triangular.");

    }

    // Aqui para mostrar la excepcion a traves de un metodo llamado errorException y que lo llama catch en caso de producirse
    public String errorException (){

        return "Las medidas introducidas para los lados no cumplen con la desigualdad triangular.";
    }



}
