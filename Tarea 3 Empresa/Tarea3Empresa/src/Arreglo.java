//Programa hecho por Francisco Marquez Maya con ayuda del codigo proporcionado en clase
// Grupo 1310

import java.util.ArrayList;


public class Arreglo<T> {
    private final int tamaño;
    private final ArrayList<T> A;
    Arreglo(int tamaño){
        this.tamaño=tamaño;
        A = new ArrayList();
        for (int i = 0; i < this.tamaño; i++) {
            A.add(null);
        }
    }
    
    public int getLongitud(){
        return tamaño;
    }
    
    public void setElemento(int indice, T dato)throws IndexOutOfBoundsException{
        this.A.set(indice, dato);
    }
    
    public T getElemento(int indice){
        return A.get(indice);
    }
    
    public void limpiar(T dato){
        for (int i = 0; i < A.size(); i++) {
            A.set(i, dato);
        }
    }
    
    @Override
    public String toString(){
        String S = "";
        for (T dato : A) {
            if(dato != null)
            S += dato.toString() +"\n";
        }
        return S;
    }
}
