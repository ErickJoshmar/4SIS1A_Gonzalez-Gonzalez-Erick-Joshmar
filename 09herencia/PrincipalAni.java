import java.util.Scanner;

public class PrincipalAni {

    public static void main(String[] args) {
        char letra;
        int op;
        Scanner entrada = new Scanner(System.in);

        Perro dog = new Perro();
        Gato cat = new Gato();
        Hamster ham = new Hamster();
        Conejo con = new Conejo();
        Cuyo cuy = new Cuyo();
        Huron hur = new Huron();
        Tigre tiger = new Tigre();
        do {
            System.out.println("Tienda de Animales");
            System.out.println("Elija la opcion que desea:");
            System.out.println("1. Perro");
            System.out.println("2. Gato");
            System.out.println("3. Hamster");
            System.out.println("4. Conejo");
            System.out.println("5. Cuyo");
            System.out.println("6. Huron");
            System.out.println("7. Tigre");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    do {
                        System.out.println("Perro");
                        dog.mostrarPerro();
                        System.out.println("¿Desea registrar de nuevo?, escriba S para repetir ");
                        letra = entrada.next().charAt(0);
                    } while (letra == 's' || letra == 'S');
                    break;

                case 2:
                    do {
                        System.out.println("Gato");
                        cat.mostrarGato();
                        System.out.println("¿Desea registrar de nuevo, escriba S para repetir ");
                        letra = entrada.next().charAt(0);
                    } while (letra == 's' || letra == 'S');
                    break;

                case 3:
                    do {
                        System.out.println("Hamster");
                        ham.mostrarHamster();
                        System.out.println("¿Desea registrar de nuevo?, escriba S para repetir ");
                        letra = entrada.next().charAt(0);
                    } while (letra == 's' || letra == 'S');
                    break;

                case 4:
                    do {
                        System.out.println("Conejo");
                        con.mostrarConejo();
                        System.out.println("¿Desea registrar de nuevo, escriba S para repetir ");
                        letra = entrada.next().charAt(0);
                    } while (letra == 's' || letra == 'S');
                    break;

                case 5:
                    do {
                        System.out.println("Cuyo");
                        cuy.mostrarCuyo();
                        System.out.println("¿Desea registrar de nuevo,escriba S para repetir ");
                        letra = entrada.next().charAt(0);
                    } while (letra == 's' || letra == 'S');
                    break;

                case 6:
                    do {
                        System.out.println("Huron");
                        hur.mostrarHuron();
                        System.out.println("¿Desea registrar de nuevo, escriba S para repetir ");
                        letra = entrada.next().charAt(0);
                    } while (letra == 's' || letra == 'S');
                    break;

                case 7:
                    do {
                        System.out.println("Tigre");
                        tiger.mostrarTigre();
                        System.out.println("¿Desea registrar de nuevo, escriba S para repetir ");
                        letra = entrada.next().charAt(0);
                    } while (letra == 's' || letra == 'S');
                    break;
                default:
                    System.out.println("\nDigite correctamente");
                    break;
            }
            System.out.println("\n¿Desea repetir el programa?, escriba S para repetir ");
            letra = entrada.next().charAt(0);

        } while (letra == 's' || letra == 'S');
    }
}
