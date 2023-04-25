package elementos;

public class barcoPasaje extends barcos implements ibarcos{
    private int cantCamas;

    public barcoPasaje ()
    {
        super();
        cantCamas=0;
    }

    public barcoPasaje(int id, boolean enUso, int cantPersonasArriba, int cantCamas)
    {
        super(id, enUso, cantPersonasArriba);
        this.cantCamas=cantCamas;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }
    public void msgeSocorro()
    {
        System.out.println ("nos estamos muriendo help!!");
    }
    public void alarma()
    {
        System.out.println ("biu biu biu");
    }
}
