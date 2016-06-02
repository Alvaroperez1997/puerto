
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionDeportiva
     */
    public EmbarcacionDeportiva(int potencia, String matricula, float eslora, int annoFabricacion)
    {
        super(matricula, eslora, annoFabricacion);
        this.potencia = potencia;
    }

    /**
     * @override coeficienteBernua
     */
    public int getCoeficienteBernua()
    {
        return potencia;
    }
    
    /**
     * toString
     */
    public String toString(){
        String text = super.toString();
        text += "Potencia: " + potencia + "\n";
        return text;
    }
}
