import java.util.Scanner;

public class Huron extends Animal{
    String personalidad;
    Scanner entrada = new Scanner(System.in);
    public Huron(){

    }
    public Huron(String nombre, String raza, String tipo_alimento, int edad, String personalidad){
        super(nombre, raza, tipo_alimento, edad);
        this.personalidad = personalidad;
    }
    public String getpersonalidad(){
      System.out.println("Su tipo de personalidad es:");
      personalidad = entrada.nextLine();
        return personalidad;
    }
    public void setpersonalidad(String personalidad){
        this.personalidad = personalidad;
    }
    public void mostrarCuyo(){
        System.out.println("Informacion sobre el Huron \n Su nombre es: " + getNombre() + "\n" + "   Su raza es: " + getRaza() + "\n" + "   Se alimenta de: " +getTipo_alimento() +  "\n" + "Edad: " + getEdad() + " años \n" + "Su tipo de personalidad : " + getpersonalidad()+"\n");
        
    }
    public void mostrarHuron() {
    }   
}