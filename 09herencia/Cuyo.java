import java.util.Scanner;

public class Cuyo extends Animal{
    String color;
    Scanner entrada = new Scanner(System.in);
    public Cuyo(){

    }
    public Cuyo(String nombre, String raza, String tipo_alimento, int edad, String color){
        super(nombre, raza, tipo_alimento, edad);
        this.color = color;
    }
    public String getcolor(){
      System.out.println("Ingrese que color es:");
      color = entrada.nextLine();
        return color;
    }
    public void setcolor(String color){
        this.color = color;
    }
    public void mostrarCuyo(){
        System.out.println("Informacion sobre el cuyo \n Su nombre es: " + getNombre() + "\n" + "   Su raza es: " + getRaza() + "\n" + "   Se alimenta de: " +getTipo_alimento() +  "\n" + "Edad: " + getEdad() + " años \n" + "Es de color : " + getcolor()+"\n");
        
    }   
}