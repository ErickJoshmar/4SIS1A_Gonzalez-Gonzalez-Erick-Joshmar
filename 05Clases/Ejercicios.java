import java.util.Scanner;

class Ejercicios {

/** Vamos a hacer una calculadora, un conversor de unicsdes creación de cuadros y de movimiento */

//Los métodos son las operaciones de un objeto o de una clase, también llamado comportamiento

//objetos 
Scanner entrada = new Scanner(System.in);

//variables globales 
char op;

//vamos a ser un método para el menu del programa 
public void menu(){
    //menu del programa 
System.out.println("a. Calculadora");
System.out.println("b. Conversion de unidades");
System.out.println("c. Crear cuadros magicos");
System.out.println("d. Desplazamiento de cuadro");
System.out.println("Elija una opción");

op = entrada.next().charAt(0);
switch(op){
case 'a' :
//implementamos metodos 
Ejercicio1();
break;

case 'b' :
//implementamos metodos 
Ejercicio2();
break;

case 'c' : 
//implementamos metodos
Ejercicio3();
break;

case 'd' :
//implementamos metodos
Ejercicio4();
break;

default:
System.out.println("Gracias por jugar :3");
} 
}

public void Ejercicio1() {
    //variable local
double num1 = 0.00, suma = 0.00, multi = 1.00;
char operacion;

System.out.println("Selecciona la operacion que sedees realizar");
System.out.println("a. Suma y Resta");
System.out.println("b. Multiplicacion");
System.out.println("c. Division");

operacion = entrada.next().charAt(0);
switch(operacion){
case 'a': 
do{
    System.out.println("Para detener la suma o resta ingrese el numero 0");
    System.out.println("Escriba los numeros que desee sumar o restar");
    num1 = entrada.nextDouble();
    suma += num1;
    // suma = suma + num1;

}while(num1 != 0);
System.out.println("El resultado es: " + suma);

case 'b':
do{
    System.out.println("Para detener la multiplicacion ingrese el numero 0");
    System.out.println("Escriba los numeros a multiplicar");
    num1 = entrada.nextDouble();
    multi += num1;
    // multi = multi + num1;

}while(num1 != 0);
System.out.println("El resultado es: " + multi);

case 'c':
//division 
break;

case 'd':
default: 
System.out.println("Opcion no valida");
break;
}

}

public void Ejercicio2() {
/*
 * vamos a crear un programa que se encargue de convertir 
 * kg a libras y gramos 
 * m/s a km/s 
 * tarea: m a yardas y millas
 */
double metros = 0.00, kg = 0.00, milla=0.000621371, cm = 100.00, pulgada = 39.37, gramos = 1000.00, libra = 2.20, ms = 0.00,yarda=1.09361;
double a, b;

System.out.println("Seleccione la cantidad que desea convertir de acuerdo a las siguientes unidades : ");
System.out.println("a. Metros a cm y pulgadas");
System.out.println("b. Kilogramos a libras y gramos");
System.out.println("c. m/s a km/h");
System.out.println("d. Metros a Yardas y Millas");

op = entrada.next().charAt(0);
 
switch(op){
    case 'a':
    System.out.println("Ingrese los metros a tranformar: ");
    metros = entrada.nextDouble();
    a = metros * cm;
    b = metros * pulgada;

    System.out.println("La cantidad en metros es : " + metros + "de m a cm son :" + a + "de m a pulgadas son : " + b);
    break;

    case 'b':
    System.out.println("Ingrese los kilogramos a tranformar: ");
    kg = entrada.nextDouble();
    a = kg * gramos;
    b = kg * libra;

    System.out.println("La cantidad en kg es : " + kg + "de kg a gramos son :" + a + "de kg a libras son : " + b);
    break;

    case 'c':
    System.out.println("Ingrese la velocidad en m/s: ");
    ms = entrada.nextDouble();
    ms = kg * gramos;
    a = ms * (3600/1000);

    System.out.println("La conversion de m/s a km/h es de: " + a );
    break;
case 'd':
//tarea 
System.out.println("Ingrese los metros a tranformar: ");
metros = entrada.nextDouble();
a = metros * yarda;
b = metros * milla;

System.out.println("La cantidad en metros es : " + metros + "de metros a yardas son :" + a + "de metros a millas son : " + b);
break;
default:
System.out.println("Opcion no valida");
}

} 
public void Ejercicio3() {
    double n1;
/*
 * Deben de ingresar un numero de * / para que se arme un cadrado por ejemplo de poder aceptar del 1 al 1000 
 *      ***********
        ///////////
        ***********
        ///////////
        **********
        //////////
*/

} 


public void Ejercicio4() {

} 
}