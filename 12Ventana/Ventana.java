//Explicacion ventana
import javax.swing.*;
public class Ventana{
    public static void main (String[] args){

        JFrame ventana = new JFrame("Hola mundo");
        //Tamano de la ventana
        ventana.setSize(400,150);
//Para el boton X de cerrar 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        // tenemos que agregarlo a la ventana 

    ventana.add(panel);
    //vamos a crear un metodo para agregar componentes a ese panel

    agregarComponentes(panel);

    ventana.setVisible(false);

 }
private static void agregarComponentes(JPanel panel){
    //Primero se debe de inicializar el panel 

    panel.setLayout(null);
    //agrego componentes

    JLabel userlabel =  new JLabel("Nombre de usuario");
    /* para inicializar y definir el tamano orientacion y elementos del componente se utiliza el metodo 
     * setBotones que maneja ancho, largo, coor x coor
     */

     userlabel.setBounds(10,10,120,50);
     //lo agreamos al panel 
     panel.add(userlabel);
     
     //campo de texto 
     JTextField usertext = new JTextField(20); 
     usertext.setBounds(160, 20, 160, 25);
        panel.add(usertext);

        //etiqueta password
        JLabel userpassword = new JLabel("Password");
        userpassword.setBounds(10, 40, 80, 50);
        panel.add(userpassword);

        //campo password
        JTextField passtext = new JTextField(20);
        passtext.setBounds(160, 50, 160, 25);
        panel.add(passtext);

        //agregamos los botones
        JButton loginButton = new JButton("Iniciar sesion");
        loginButton.setBounds(10, 80, 120, 25);
        panel.add(loginButton);

        JButton registrobutton = new JButton("Registrate");
        registrobutton.setBounds(180, 80, 120, 25);
        panel.add(registrobutton);





    }


    /*
        Tarea deberan de integrar el metodo para que la ventana
        al momento de mandar a llamar aparezca exactamente al centro de la pantalla
        
        Password debe de no ser visible  ***
        
        
        Se debe de tener un usuario por defecto (ustedes lo definien)
        ingreso usuario y pass y me digire a otra ventana que diga BIENVENIDO
        sino USUARIO INEXISTENTE
        
        Deberan de programar la ventana para el registro con los siguientes campos
        
        Nombre
        Apellido Paterno
        Apellido Materno
        Fecha de nacimiento //agregan un objeto calendario  //3 elementos de lista
        Usuario
        Contraseña
        
        */

}
     
