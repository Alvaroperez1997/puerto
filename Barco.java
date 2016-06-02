
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
    // instance variables - replace the example below with your own
    private String matricula;
    private float eslora;
    private int annoFabricacion;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula, float eslora, int annoFabricacion)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.annoFabricacion = annoFabricacion;
    }

    /**
     * @return  matricula
     */
    public String getMatricula()
    {
        return matricula;
    }

    /**
     * @return eslora
     */
    public float getEslora(){
        return eslora;
    }

    /**
     * @return annoFabricacion
     */
    public int annoFabricacion(){
        return annoFabricacion();
    }

    /**
     * 
     */
    public abstract int getCoeficienteBernua();

    /**
     * toString
     */
    public String toString(){
        String datos = "Matricula: " + matricula + "\n";
        datos += "Eslora: " + eslora + "\n";
        datos += "Año de fabricación: " + annoFabricacion + "\n";
        return datos;
    }
}
