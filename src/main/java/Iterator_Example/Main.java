package Iterator_Example;

public class Main {
    public static void main(String[] args){
        
        ListaNumeros listnum = new ListaNumeros(); //Creamos el objeto lista de números
        ListaPalabras listpal = new ListaPalabras(); //Creamos el objeto lista de palabras
        Iterator iterator; //Creamos el iterator
        
        listnum.agregar(5); //Agregamos números a la ListaNumeros
        listnum.agregar(4);
        listnum.agregar(2);
        listnum.agregar(1);
        listnum.agregar(8);
        
        listpal.agregar("Cuatro"); //Agregamos palabras a la ListaPalabras
        listpal.agregar("Dos");
        listpal.agregar("Ocho");
        listpal.agregar("Uno");
        listpal.agregar("Cinco");
        
        //Al iterator se le asigna la Clase que devuelve el método Iterator de la lista de números
        iterator = listnum.iterator(); //Instanciamos el iterator 
        while(iterator.tieneSiguiente()){
            //Accedemos al elemento
            int numero = (int) iterator.siguiente();
            //Imprimimos al elemento
            System.out.println(numero);
        }
        
        System.out.println();
        
        //Al iterator se le asigna la Clase que devuelve el método Iterator de la lista de palabras
        iterator = listpal.iterator();
        while(iterator.tieneSiguiente()){
            //Accedemos al elemento
            String palabra = (String) iterator.siguiente();
            //Imprimimos al elemento
            System.out.println(palabra);
        }
    }
}
