
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private Alquiler[] alquileres;
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * Añade un alquiler al array
     * @return -1 si no hay amarres libres
     * @return posicion libre y añade un alquiler al puerto
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco)
    {
        int amarre = -1;
        boolean x = false;
        for(int i = 0; i < NUMERO_AMARRES && !x; i++){
            if(alquileres[i] == null){
                alquileres[i] = new Alquiler(numeroDias, cliente, barco);
                amarre = i;
                x = true;
            }
        }
        return amarre+1;
    }

    /**
     * Comprueba el precio de los alquileres
     */
    public void verEstado(){
        for(int i = 0; i < NUMERO_AMARRES; i++){
            if(alquileres[i] != null){
                System.out.println("Alquiler del amarre " + (i+1) + " " + alquileres[i].getCosteAlquiler());
            }
        }
    }

    /**
     * @return costeAlquiler
     * elimina el alquiler
     */
    public float liquidarAlquiler(int posicion){
        float precio = 0;
        if(alquileres[posicion] != null){
            precio = alquileres[posicion].getCosteAlquiler();
            alquileres[posicion] = null;
        }
        return precio;
    }
}
