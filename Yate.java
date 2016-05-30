
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    // instance variables - replace the example below with your own
    private int camarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(int camarotes, int potencia, String matricula, float eslora, int annoFabricacion)
    {
        super(potencia, matricula, eslora, annoFabricacion);
        this.camarotes = camarotes;
    }

    /**
     * 
     */
    public int getCoeficienteBernua()
    {
        return super.getCoeficienteBernua() + camarotes;
    }
    
    /**
     * @override toString
     */
    public String toString(){
        String text = super.toString();
        text += ". Camarotes: " + camarotes;
        return text;
    }
}
