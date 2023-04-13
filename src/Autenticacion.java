import java.util.Scanner;

public class Autenticacion {

    //Instancias de la clase
    private String nombreUsuario;
    private String contrasena;
    private String [][] cuentas = {{"Sergio", "contrasena"}};

    Scanner input = new Scanner(System.in);

    //Metodo constructor
    public Autenticacion() {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        boolean active;
    }//Fin del constructor

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }//Fin del metodo setNombreUsuario


    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }//Fin del metodo setContrasena

    //Inicio del metodo validarContrasena que verifica el usuario y contrasena que se encuentran en el arreglo
    public boolean validarContrasena(){

        if (nombreUsuario.equals(cuentas[0][0]) && contrasena.equals(cuentas[0][1])) {
            return true;
        }else {
            return false;
        }

    }//Fin del metodo validarContrasena

    //Inicio del metodo ingreso con el que se verifica si el usuario o contrasena coinciden con
    public boolean ingreso() {
        Autenticacion login = new Autenticacion();

        System.out.println("Bienvenido al Parqueo");
        System.out.println("Ingrese su usuario con su contrasena");

        login.setNombreUsuario(input.nextLine());

        int intentos = 0;
        boolean acceso = false;

        //Estructura while que permite unicamente 3 intentos para validar el usuario y contraseña
        while (intentos < 3 && !acceso) {
            System.out.println("Ingrese su contraseña");
            login.setContrasena(input.nextLine());

            if (login.validarContrasena()) {
                System.out.println("Ingreso exitoso" + "\n");
                acceso = true;
            } else {

                System.out.println("Usuario o contrasena incorrecta");
                intentos++;
            }//Fin del if

        }//Fin del while de 3 intentos

        if (!acceso) {
            System.out.println("Ha excedido el limite de intentos, intentelo de nuevo" + "\n");

        }//Fin del if del limite de intentos

        return acceso;
    }//Fin del metodo ingreso

}//Fin de la clase Autenticacion
