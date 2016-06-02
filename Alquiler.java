
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // instance variables - replace the example below with your own
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    private static final int VALOR_FIJO_ALQUILER = 300;
    private static final int MULTIPLICADOR_ESLORA = 10;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int dias, Cliente cliente, Barco barco)
    {
        numeroDias = dias;
        this.cliente = cliente;
        this.barco = barco;
    }

    /**
     * 
     */
    public float getCosteAlquiler(){
        return (numeroDias * (MULTIPLICADOR_ESLORA * barco.getEslora()) + (VALOR_FIJO_ALQUILER * barco.getCoeficienteBernua()));
    }

    /**
     * @override toString
     */
    public String toString()
    {
        String data = "- Cliente: \n";
        data += cliente;
        data += "- Barco: \n";
        data += barco;
        data += "Número de dias: " + numeroDias + "\n";
        // data += "Coste del alquiler: " + getCosteAlquiler() + "\n";
        return data;
    }
}
