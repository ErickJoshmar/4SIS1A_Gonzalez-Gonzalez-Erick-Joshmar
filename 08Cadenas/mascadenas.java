import java.util.*;

import java.sound.midi.Soundbank;
public class mascadenas {
 Scanner entrada = new Scanner(System.in);
 
 public void masFunciones(){
     String s1 = new String("Hola por que pagar tanto por un gansito T_T");
     String s2 = new String("Harry popote tiene un ajedrez magico");
     String s3 = new String("Feliz no cumpleaños");
     String s4 = new String("Feliz no cumpleaños");
     //vamos a concatenar 

     String salida = "Cadenas: " + s1 + "\n" + s2 + "\n" + s3 + "\n"+ s4 + "\n";
     // probar la igual de una cadena .
     if(s1.equals("Solo es un juguito contigo")) {
         //si es verdad 

         salida += "Si es igual a la cadena";
     }else{
salida+= "No es la misma cadena";
System.out.println(salida);
     }

 }
}
