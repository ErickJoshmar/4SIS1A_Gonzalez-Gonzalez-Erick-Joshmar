public class EntradaTexto{
    //metodo principal
    public static void main(String[] args){
        String nombre; 
        //mensaje para el usuario 
        System.out.println("Por favor introduce tu nombre");
        // ln es un salto de linea  
        nombre = System.console().readLine();
        //tenemos que concatenar los elementos
        System.out.println("Hola"+ nombre +"Bienvenido a la tronadera");
    }
} 
