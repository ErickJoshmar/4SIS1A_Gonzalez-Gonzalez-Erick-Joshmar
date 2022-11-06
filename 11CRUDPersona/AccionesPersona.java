 /* 
 * Esta clase es un controlador de las acciones de la clase Persona para ello vamos a ocupar 
 * Arraylist 
 * Es un tipo de objeto que es dinamico en cuation de crecimiento y memoria para diversos tipos de datos u objetos
 *  * 
*/
import java.util.ArrayList;

public class AccionesPersona {
    /*
     * Vamos  a hacer un crud de la persona 
     * C-> consult
     * R -> register
     * U-> Update
     * D-> Delete
     * 
     * declaracion de mi objetvo persona,pero como un tipo arraylist  
     */
public ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
    // declarar mis metodos 
    public void agregarpPersona(Persona p){
        // voy a ocupar a mi objeto de lista de persona para invocar un metodo para agregarlo a la lista
        listaPersonas.add(p);
    }
    //buscar a una persona por id
public Persona buscarPersona(int id){
    //necesito una instancia de persona para poder buscarla
Persona encontrada = new Persona();
// necesito recorrer todo el arreglo de personas hasta encontrar el id que sea id= parametro
for(Persona p : listaPersonas){
    //condicion id = parametro

    if(id == p.getId()){

    }
}
}


}

