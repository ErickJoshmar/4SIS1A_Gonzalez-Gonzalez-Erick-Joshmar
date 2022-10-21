import java.util.Scanner;

public class Conejo extends Animal{
    String peso;
    Scanner entrada = new Scanner(System.in);
    public Conejo(){

    }
    public Conejo(String nombre, String raza, String tipo_alimento, int edad, String peso){
        super(nombre, raza, tipo_alimento, edad);
        this.peso = peso;
    }
    public String getpeso(){
      System.out.println("Su peso es:");
      peso = entrada.nextLine();
        return peso;
    }
    public void setpeso(String peso){
        this.peso = peso;
    }
    public void mostrarConejo(){
        System.out.println("Informacion sobre el Conejo \n Su nombre es: " + getNombre() + "\n" + "   Su raza es: " + getRaza() + "\n" + "   Se alimenta de: " +getTipo_alimento() +  "\n" + "Edad: " + getEdad() + " años \n" + "El peso del conejo es : " + getpeso()+" kg\n");
        
    }   
}