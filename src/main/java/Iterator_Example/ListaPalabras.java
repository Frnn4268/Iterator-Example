package Iterator_Example;

public class ListaPalabras {
    private String palabra1, palabra2, palabra3, palabra4, palabra5; //Variables
    private int posicion;
    
    //Constructor de la clase
    public ListaPalabras(){ 
        posicion = 0;
    }
    
    //Método para agregar palabras
    public void agregar(String p){
        switch(posicion){
            case 0:
                palabra1 = p;
                break;
                
            case 1:
                palabra2 = p;
                break;
                
            case 2:
                palabra3 = p;
                break;
                
            case 3:
                palabra4 = p;
                break;
            
            case 4:
                palabra5 = p;
                break;
                
        }
        posicion++;
    }
    
    //Método que devolverá un objeto, y una instancia que envía las palabras que contiene 
    //la estructura "agregar"
    public ListaPalabrasIterator iterator(){
        return new ListaPalabrasIterator(palabra1, palabra2,
                                         palabra3, palabra4,
                                         palabra5);
    }
    
}
