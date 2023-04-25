package elementos;

public class pesquero extends barcos implements ibarcos{
    private int cantPesqueros;
    private String nombre;
    private float potencia;

    public pesquero()
    {
        super();
        cantPesqueros=0;
        nombre="";
        potencia=0;
    }

    public pesquero(int id, boolean enUso, int cantPersonasArriba, int cantPesqueros, String nombre, float potencia)
    {
        super(id, enUso, cantPersonasArriba);
        this.cantPesqueros=cantPesqueros;
        this.nombre=nombre;
        this.potencia=potencia;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getCantPesqueros() {
        return cantPesqueros;
    }

    public void setCantPesqueros(int cantPesqueros) {
        this.cantPesqueros = cantPesqueros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void msgeSocorro()
    {
        System.out.println ("estamos ahogandonos help!!");
    }
    public void alarma()
    {
        System.out.println ("ao ao ao");
    }
}
