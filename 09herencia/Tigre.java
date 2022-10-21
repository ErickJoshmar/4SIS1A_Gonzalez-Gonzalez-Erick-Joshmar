import java.util.Scanner;

public class Tigre extends Animal{
    String genero;
    Scanner entrada = new Scanner(System.in);
    public Tigre(){

    }
    public Tigre(String nombre, String raza, String tipo_alimento, int edad, String genero){
        super(nombre, raza, tipo_alimento, edad);
        this.genero = genero;
    }
    public String getgenero(){
      System.out.println("Su genero es:");
      genero = entrada.nextLine();
        return genero;
    }
    public void setgenero(String genero){
        this.genero = genero;
    }
    public void mostrarCuyo(){
        System.out.println("Informacion sobre el Tigre \n Su nombre es: " + getNombre() + "\n" + "   Su raza es: " + getRaza() + "\n" + "   Se alimenta de: " +getTipo_alimento() +  "\n" + "Edad: " + getEdad() + " años \n" + "El genero es : " + getgenero()+"\n");
        
    }
    public void mostrarTigre() {
    }   
}