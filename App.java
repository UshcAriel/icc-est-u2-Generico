import models.Caja;
import models.Par;

public class App {

    public static void main(String[] args) {
        System.out.println("--- Uso de Caja<T> ---");

        Caja<String> texto = new Caja<String>("Hola mundo");
        Caja<Integer> numero = new Caja<Integer>(100);
        Caja<Double> decimal = new Caja<Double>(9.75);


        System.out.println("Caja de texto: " + texto.getT());
        System.out.println("Caja de entero: " + numero.getT());
        System.out.println("Caja de decimal: " + decimal.getT());





        System.out.println("--- Uso de Caja<T> ---");
        Par<Integer,String> Clave_uno = new Par<Integer,String>(1,"Juan Pérez");
        Par<String, Integer> Clave_dos = new Par<String,Integer>("Edad", 20);
        Par<String, Double> Clave_tres = new Par<String, Double>("Promedio", 8.75);

        System.out.println("Clave: " + Clave_uno.getK() + " | " + " Valor: " + Clave_uno.getV());
        System.out.println("Clave: " + Clave_dos.getK() + " | " + " Valor: " + Clave_dos.getV());
        System.out.println("Clave: " + Clave_tres.getK() + " | " + " Valor: " + Clave_tres.getV());
    }
    
}
