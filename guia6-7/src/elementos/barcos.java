package elementos;

public class barcos {
    private int id;
    private boolean enUso;
    private int cantPersonasArriba;

    public barcos ()
    {
        int id=0;
        enUso=false;
        cantPersonasArriba=0;
    }

    public barcos(int id, boolean enUso, int cantPersonasArriba)
    {
        this.id=id;
        this.enUso=enUso;
        this.cantPersonasArriba=cantPersonasArriba;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }

    public boolean isEnUso() {
        return enUso;
    }

    public void setCantPersonasArriba(int cantPersonasArriba) {
        this.cantPersonasArriba = cantPersonasArriba;
    }

    public int getCantPersonasArriba() {
        return cantPersonasArriba;
    }
}
