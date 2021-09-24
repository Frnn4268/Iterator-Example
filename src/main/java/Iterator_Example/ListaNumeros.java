package Iterator_Example;

public class ListaNumeros {
    private int numeros[];  //Variables
    private int posicion;
    
    //Constructor
    public ListaNumeros(){
        numeros = new int[10];
        posicion = 0;
    }
    
    public void agregar(int i){ //Metodo agregar
        numeros[posicion++] = i;
    }
    
    //Método Iterator, que nos devuelve una instancia de ListaNumerosIterator
    public ListaNumerosIterator iterator(){
        return new ListaNumerosIterator(numeros);
    }
}
