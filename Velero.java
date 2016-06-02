
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numeroMastiles, String matricula, float eslora, int annoFabricacion)
    {
        super(matricula, eslora, annoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }
    
    /**
     * @override coeficienteBernua
     */
    public int getCoeficienteBernua(){
        return numeroMastiles;
    }
    
    /**
     * @override toString
     */
    public String toString(){
        String text = super.toString();
        text += "Numero de mastiles " + numeroMastiles + "\n";
        return text;
    }
}
