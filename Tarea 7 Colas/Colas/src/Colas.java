//Codigo realizado por Francisco Marquez Maya
//Grupo 1310

import java.util.ArrayList;


public class Colas <T>{
    private ArrayList <T> cola;
    private int tamanio=0;
    Colas(){
        cola=new ArrayList();
    }
    
    public boolean isEmpty(){
        return(tamanio==0);
    }
    
    public int length(){
        return tamanio;
    }
    
    public void enqueue(T dato){
        cola.add(dato);
        tamanio++;
    }
    
    public T dequeue(){
        T aux=cola.get(0);
        cola.remove(0);
        tamanio--;
        return aux;
    }
    
    @Override
    public String toString(){
        String aux="\n";
        for(int i=tamanio-1;i>=0;i--){
            aux+=cola.get(i)+"\n";
        }
        return aux;
    }
    
}
