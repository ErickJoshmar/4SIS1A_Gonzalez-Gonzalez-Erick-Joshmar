
public class Hamster extends Animal{
    //aqui deberia de venir String
    String color_hams,nombre;
    int edad;


    public Hamster(){

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad, String color_hams){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.color_hams = color_hams;

    }

    //recibir   
    public String getNum_vidas(){
        return color_hams;
    }

    //enviar
    public void setcolor_hamString(String color_hams){
        this.color_hams = color_hams;
    }
    

    public void mostrarHamster(){
     

    }




    
}
