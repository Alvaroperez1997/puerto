import java.util.ArrayList;
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private ArrayList<Alquiler> alquileres;
    private static final int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        alquileres = new ArrayList<>();
    }

    /**
     * Añade un alquiler al array
     * @return -1 si no hay amarres libres
     * @return posicion libre y añade un alquiler al puerto
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco)
    {
        int posicionEnLaQueQuedaElBarco = -1;
        int contador = 0;
        while(contador<NUMERO_AMARRES && posicionEnLaQueQuedaElBarco==-1) {
            if(alquileres.get(contador)==null){
                posicionEnLaQueQuedaElBarco = contador;
                alquileres.add(new Alquiler(numeroDias,cliente,barco));
            }
            contador++;
        }
        return posicionEnLaQueQuedaElBarco;

    }

    /**
     * Comprueba el precio de los alquileres
     */
    public void verEstado(){
        for(int i = 0;i <NUMERO_AMARRES;i++) {
            System.out.println("Amarre nº" + i);
            if(alquileres.get(i) == null) {
                System.out.println("Libre");
            }
            else{
                System.out.println("ocupado");
                System.out.println(alquileres.get(i));
            }      
        }
    }

    /**
     * @return costeAlquiler
     * elimina el alquiler
     */
    public float liquidarAlquiler(int posicion){
        float valor = -1;
        if(posicion < NUMERO_AMARRES && posicion >= 0){
            if(alquileres.get(posicion) != null){
                valor = alquileres.get(posicion).getCosteAlquiler();
                alquileres.remove(posicion);
            }
        }
        return valor;
    }
}
