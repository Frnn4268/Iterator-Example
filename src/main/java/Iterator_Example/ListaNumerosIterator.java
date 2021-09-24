package Iterator_Example;

public class ListaNumerosIterator implements Iterator{
    private int numeros[]; //Variables
    private int posicion;
    
    //Constructor
    public ListaNumerosIterator(int num[]){
        this.numeros = num;
        this.posicion = 0;
    }
    
    //Método "siguiente" que devuelve el número de la posición de la lista
    @Override
    public Object siguiente() {
        return numeros[posicion++];
    }
    
    //Método "tieneSiguiente" que nos indica si existen o no más datos
    @Override
    public boolean tieneSiguiente() {
        if (posicion < numeros.length && numeros[posicion] != 0){
            return true;
        } else {
            return false;
        }
    }
}
