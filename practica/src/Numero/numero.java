package Numero;

import interfaces.irelaciones;

public class numero implements irelacioes {
    private int numero;


    // Devuelve verdadero si a es mayor que b
    public boolean esMayor(int b)
    {
        boolean flag=false;

        if(numero>b)
        {
            flag=true;
        }

        return flag;
    }

    // Devuelve verdadero si a es menor que b
    public boolean esMenor(int b)
    {
        boolean flag=false;

        if(numero<b)
        {
            flag=true;
        }

        return flag;
    }

    // Devuelve verdadero si a es igual que b
    public boolean esIgual(int b)
    {
        boolean flag=false;

        if(numero==b)
        {
            flag=true;
        }

        return flag;
    }
}
