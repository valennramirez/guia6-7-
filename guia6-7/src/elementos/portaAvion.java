package elementos;

public class portaAvion extends barcos implements ibarcos{
    private int cantAviones;
    private int tripulacion;

    public portaAvion ()
    {
        super();
        cantAviones=0;
        tripulacion=0;
    }

    public portaAvion(int id, boolean enUso, int cantPersonasArriba, int cantAviones, int tripulacion)
    {
        super(id, enUso, cantPersonasArriba);
        this.cantAviones=cantAviones;
        this.tripulacion=tripulacion;
    }

    public int getCantAviones() {
        return cantAviones;
    }

    public void setCantAviones(int cantAviones) {
        this.cantAviones = cantAviones;
    }

    public int getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }

    public void msgeSocorro()
    {
        System.out.println ("estamos perdiendo plata help!!");
    }

    public void alarma()
    {
        System.out.println ("se rompio la alarma");
    }
}
