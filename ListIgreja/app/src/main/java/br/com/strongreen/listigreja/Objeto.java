package br.com.strongreen.listigreja;

/**
 * Created by herik on 12/10/2017.
 */

public class Objeto
{
    private String texto;
    private int iconeRid;

    public Objeto()
    {
    }

    public Objeto(String texto, int iconeRid)
    {
        this.texto = texto;
        this.iconeRid = iconeRid;
    }

    public int getIconeRid()
    {

        return iconeRid;
    }

    public void setIconeRid(int iconeRid)
    {
        this.iconeRid = iconeRid;
    }

    public String getTexto()
    {
        return texto;
    }

    public void setTexto(String texto)
    {

        this.texto = texto;
    }
}

