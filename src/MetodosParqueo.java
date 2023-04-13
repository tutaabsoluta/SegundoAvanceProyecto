import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MetodosParqueo {
    Scanner input = new Scanner(System.in);
    Parqueo metodos = new Parqueo();

    //Metodo ingresoVehiculo
    int ingresoVehiculo(){

        int opcion;

        System.out.println("Seleccione el tipo de vehículo: ");
        System.out.println("1- Automóvil");
        System.out.println("2- Motocicleta");
        System.out.println("3- Vehículo de carga");
        opcion = input.nextInt();

        if (opcion == 1){
            metodos.setTipoVehiculo("Automóvil");
            metodos.setTarifaVehiculo(1000);
        }
        if (opcion == 2){
            metodos.setTipoVehiculo ("Motocicleta");
            metodos.setTarifaVehiculo (800);
        }
        if (opcion == 3) {
            metodos.setTipoVehiculo ("Vehículo de carga");
            metodos.setTarifaVehiculo (1500);
        }

        return 0;

    }//Fin del metodo ingresoVehiculo

    //Metodo horaEntrada
    int horaEntrada(){
        System.out.println("Ingrese la hora de entrada al parqueo");
        metodos.setHoraEntrada(input.nextInt());
        return 0;
    }//Fin del metodo horaEntrada

    int horaSalida(){
        System.out.println("Ingrese la hora de salida al parqueo");
        metodos.setHoraSalida(input.nextInt());
        return 0;
    }//Fin del metodo horaSalida

     void ingresoCliente(){
        int opcion;
        System.out.println("Seleccione el tipo de cliente");
        System.out.println("1- Cliente regular");
        System.out.println("2- Cliente del sector público");
        System.out.println("3- Cliente dorado");
        opcion = input.nextInt();
        if (opcion == 1){
            metodos.setTipoCliente("Cliente regular");
            metodos.setTarifaCliente(1500);
        }//Fin del if

        if (opcion == 2){
            metodos.setTipoCliente ("Cliente del sector público");
            metodos.setTarifaCliente (1000);
        }//Fin del if
        if (opcion == 3){
            metodos.setTipoCliente ("Cliente dorado");
            metodos.setTarifaCliente (500);
        }//Fin del if

    }//Fin del metodo ingresoCliente

    //Inicio del metodo reservarEspacio
    //Se crean  dos listas para guardar los espacios disponibles y los reservados
    List<Integer> espaciosDisponibles = new ArrayList<>();
    List <Integer> espaciosReservados = new ArrayList<>();

    //Metodo constructor, sin este, no se puede reservar ningun espacio
    public MetodosParqueo() {
        //Se agregan los espacios disponibles a la lista
        for (int i = 1; i <= 100; i++) {
            espaciosDisponibles.add(i);
        }
    }//Fin del constructor MetodosParqueo


    //Inicio del metodo que permite seleccionar el espacio donde debe estacionar el vehiculo
    void seleccionarEspacio(){
        //Primero se indica con un String que seleccione el espacio y luego se captura un dato como un int
        System.out.println("Seleccione el número de espacio del parqueo");
        int numEspacio = input.nextInt();

        //Luego
        if(espaciosDisponibles.contains(numEspacio)){
            espaciosDisponibles.remove(Integer.valueOf(numEspacio));
            espaciosReservados.add(numEspacio);
        }else{
            System.out.println("El espacio seleccionado esta ocupado, seleccione otro espacio");
        }

    }//Fin del metodo seleccionarEspacio

    //Inicio del metodo que permite imprimir toda la informacion ingresada
      void imprimirTiquete(){
        metodos.setTarifaTotal(metodos.getTarifaVehiculo() + metodos.getTarifaCliente());
        System.out.println("=============================");
        System.out.println("       ====PARQUEO====");
        System.out.println("=============================");
        System.out.println("====Información del cliente====\n");
        //Se pone .get(0) para que no imprima los parentesis cuadrados
        System.out.println("Número de espacio: " + espaciosReservados.get(0));
        System.out.println("El tipo de vehículo es: " + metodos.getTipoVehiculo());
        System.out.println("La hora de entrada es a las: " + metodos.getHoraEntrada() + ":00");
        System.out.println("La hora de salida es a las: " + metodos.getHoraSalida() + ":00");
        System.out.println("El tipo de cliente es: " + metodos.getTipoCliente());
        System.out.println("El monto por pagar es de: " + metodos.getTarifaTotal() * (metodos.getHoraSalida() - metodos.getHoraEntrada()));
        System.out.println();

    }//Fin del metodo imprimirTiquete

}//Fin de la clase MetodosParqueo

