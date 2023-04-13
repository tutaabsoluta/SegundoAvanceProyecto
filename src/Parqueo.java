
/* En esta clase se encuentran declaradas las variables
Tambien estan el metodo constructor, los get y set.
 */
public class Parqueo {

    //Declaracion de variables
    private String tipoVehiculo = null;
    private String tipoCliente = null;
    private int horaEntrada;
    private int horaSalida ;
    private int tarifaCliente = 0;
    private int tarifaVehiculo = 0;
    private int tarifaTotal = 0;
    private int espacioParqueo = 0;



    //Metodo constructor
    public Parqueo() {
        this.tipoVehiculo = tipoVehiculo;
        this.tipoCliente = tipoCliente;
        this.tarifaCliente = tarifaCliente;
        this.tarifaVehiculo = tarifaVehiculo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.tarifaTotal = tarifaTotal;
        this.espacioParqueo = espacioParqueo;
    }//Fin del constructor


    //Inicio de los metodos set y get
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getTarifaCliente() {
        return tarifaCliente;
    }

    public void setTarifaCliente(int tarifaCliente) {
        this.tarifaCliente = tarifaCliente;
    }

    public int getTarifaVehiculo() {
        return tarifaVehiculo;
    }

    public void setTarifaVehiculo(int tarifaVehiculo) {
        this.tarifaVehiculo = tarifaVehiculo;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getTarifaTotal() {
        return tarifaTotal;
    }

    public void setTarifaTotal(int tarifaTotal) {
        this.tarifaTotal = tarifaTotal;
    }

    public int getEspacioParqueo() {
        return espacioParqueo;
    }

    public void setEspacioParqueo(int espacioParqueo) {
        this.espacioParqueo = espacioParqueo;
    }
    //Fin de los metodos set y get

}//Fin de la clase Parqueo