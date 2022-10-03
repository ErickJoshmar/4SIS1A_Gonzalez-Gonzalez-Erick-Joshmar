import java.util.Scanner; 
public class Conv{
    public static void main(String args[]){
        Scanner entrada = new Scanner (System.in); 
        int vector[] = new int[4]; 
        int vector2[] = new int[4]; 
        int vector3[] = new int[100]; 
        int op;
       do{
        System.out.println("Convolucion Discreta"); 

        System.out.println(" Matriz x(n)");

        for(int i=0; i<vector.length; i++){
            System.out.print("Ingresa los elementos de la Matriz x(n) : "); 
            vector[i] = entrada.nextInt(); 
        }
        System.out.println("El arreglo esta compuesto por : ");
        for (int i:vector){
            System.out.println("  Elemento : "+vector[i]);
        }

        System.out.println("Matriz h(n) ");

        for (int i=0; i<vector2.length; i++ ){
            System.out.print("Ingresa los elementos de la señal h(n) : "); 
            vector2[i] = entrada.nextInt(); 
        }
        System.out.println("El arreglo esta compuesto por : ");

        for(int i:vector2){
            System.out.println("  Elemento : "+vector2[i]);
        }
        int j=0; 
        for(int i=0; i<1 ; i++){

            vector3[0] = (vector[0]*vector2[0]); //3 0
            j++;
            vector3[j] = (vector[1]*vector2[1]);// 3 1
            j++;
            vector3[1] = (vector3[0]+vector3[1]);//  3 2
            j++; // 3 2
            vector3[j] = (vector[0]*vector2[2]);// 3 3
            j++; 
            vector3[j] = (vector[1]*vector2[1]); // 3 4
            j++; 
            vector3[j] = (vector[2]*vector2[0]); //  3 5
            j++; 
            vector3[2] = (vector3[3]+vector3[4]+vector3[5]);
            
            vector3[j] = (vector[0]*vector2[3]); // 3 6
            j++;
            vector3[j] = (vector[1]*vector2[2]); // 3 7
            j++;
            vector3[j] = (vector[2]*vector2[1]); // 3 8
            j++;
            vector3[j] = (vector[3]*vector2[0]); // 3 9
            j++;
            vector3[3] = (vector3[6]+vector3[7]+vector3[8]+vector3[9]);
            
            vector3[j] = (vector[1]*vector2[3]); // 3 10
            j++;
            vector3[j] = (vector[2]*vector2[2]); // 3 11
            j++;
            vector3[j] = (vector[3]+vector3[1]);//  3 12
            
            vector3[4] = (vector3[10]+vector3[11]+vector3[12]);
           
            vector3[j] = (vector[2]*vector2[3]); // 3 13
            j++;
            vector3[j] = (vector[3]*vector2[2]); // 3 14
            j++;

            vector3[5] = (vector3[13]+vector3[14]);
            vector3[6] = (vector[3]*vector3[3]);
         }

        System.out.println("\n\n\t\tEl resultado es : \n"); 
        for (int i=0 ; i<6; i++){
            System.out.print( vector3[i]); 
            System.out.print(" , ");
        }
        System.out.println("¿Deseas volver a repetir la operacion ? ");
        System.out.println("1 .Si");
        System.out.println("\2 . No ");
        op = entrada.nextInt();

       }while(op != 2 );


    }
}