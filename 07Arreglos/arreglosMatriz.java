import java.util.*;

public class arreglosMatriz{
    
    public static void main(String[] args){
    
    //*Vamos a realizar un arreglo unidimencional y correrlo para ver que hay dentro de cada elemento//
//definir un arreglo 
//tipo de dato nombre tamaño 

int arreglo[] = new int[10];
int valor;

Scanner entrada = new Scanner(System.in);
for (int j = 0; j<arreglo.length; j++){

    System.out.println("Ingresa el valor de la posicion del arreglo");
    valor = entrada.nextInt();

//vamos a recorrerlo
for(int i = 0; i< arreglo.length; i++){
    System.out.println("La magia: " + arreglo[i]);


}
    }

    }
}

