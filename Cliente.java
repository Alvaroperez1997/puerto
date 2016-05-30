
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * @return  nombre
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * @return dni
     */
    public String getDni(){
        return dni;
    }
    
    /**
     * toString
     */
    public String toString(){
        return nombre + "  " + dni;
    }
}
