import java.util.Scanner;

public class MenuUsuario {
    public static void main(String[] args) {

        //Creacion de instancias
        Scanner input = new Scanner(System.in);//Instancia de Scanner
        Autenticacion login = new Autenticacion();//Instancia de la clase Autenticacion
        MetodosParqueo metodos = new MetodosParqueo();//Instancia de la clase MetodosParqueo

        //Mientras no se autentifique el usuario y contrasena, el programa no dejara mostrar el menu de opciones
        boolean autenticado = true;
        do {
            autenticado = login.ingreso();

        }while(!autenticado);

        boolean salir = true;
        int opcion = 0;
        //Bucle do while que ejecuta el menu de opciones mientras no se seleccione la opcion salir
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ingresar información del cliente");
            System.out.println("2. Imprimir tiquete");
            System.out.println("3. Salir");

            //La variable opcion guarda un numero entero que es digitado por el teclado
            opcion = input.nextInt();

            //Estructura switch case que permite elegir las opciones del menu
            switch (opcion){
                //Opcion 1: Ingresar informacion del cliente
                case 1:
                    boolean salirSubmenu = false;
                    /* Se crea un do/while para que no se salga del submenu de la opcion 1
                    del menu principal hasta que no se seleccione la opcion de salir */
                    do {
                        System.out.println("Selecciona que desea digitar");
                        System.out.println("1- Número de espacio");
                        System.out.println("2- Tipo de vehículo");
                        System.out.println("3- Tipo de cliente");
                        System.out.println("4- Hora de entrada");
                        System.out.println("5- Hora de salida");
                        System.out.println("6- Regresar al menú principal");

                        int seleccion = input.nextInt();
                        switch (seleccion) {
                            //Caso 1: seleccionar un espacio del parqueo
                            case 1:
                                metodos.seleccionarEspacio();
                                break;
                            //Caso 2: seleccionar un tipo de vehiculo
                            case 2:
                                metodos.ingresoVehiculo();
                                break;
                            case 3:
                                metodos.ingresoCliente();
                                break;
                            case 4:
                                metodos.horaEntrada();
                                break;
                            case 5:
                                metodos.horaSalida();
                                break;
                            case 6:
                                salirSubmenu = true;
                                break;
                            default:
                                System.out.println("Opción inválida");
                        }//Fin del switch

                    }while (!salirSubmenu);

                    break;//Si no se coloca este break el programa devuelve la opcion del tiquete sin seleccionarla

                //Opcion 2: Imprimir el tiquete
                case 2:
                    metodos.imprimirTiquete();
                    break;
                //Opcion 3: Salir del programa
                case 3:
                    salir = false;
                    System.exit(0);
                    break;
                    //Se agrega un default por si se ingresa una opcion fuera de rango
                default:
                    System.out.println("Opción inválida");
            }//Fin del switch

        } while(salir);
        System.out.println("Sesión finalizada");

    }//Fin del metodo main

}//Fin de la clase MenuUsuario
