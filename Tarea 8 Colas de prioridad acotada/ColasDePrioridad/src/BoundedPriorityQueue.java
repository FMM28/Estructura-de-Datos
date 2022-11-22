//Codigo realizado por Francisco Marquez Maya
//Grupo 1310

import java.util.ArrayList;


public class BoundedPriorityQueue <T>{

    private int tamanio=0;
    private final ArrayList<T>[] nivel;
    
    BoundedPriorityQueue(int niveles){
        nivel=new ArrayList[niveles];
        for(int i=0;i<niveles;i++){
            ArrayList<T> cola = new ArrayList();
            nivel[i]=cola;
        }
    }
    
    public boolean isEmpty(){
        return(tamanio==0);
    }
    
    public int length(){
        return tamanio;
    }
    
    public void enqueue(int prioridad,T dato){
        nivel[prioridad].add(dato);
        tamanio++;
    }
    
    public T dequeue(){
        T aux = null;
        for (int i=0;i<nivel.length;i++){
            if(!nivel[i].isEmpty()){
                aux=nivel[i].get(0);
                nivel[i].remove(0);
                tamanio--;
                break;
            }
        }
        return aux;
    }
    
    @Override
    public String toString(){
        String aux="\n";
        for(int i=nivel.length-1;i>=0;i--){
            aux+="Prioridad "+i+"\t";
            if(!nivel[i].isEmpty()){
                for(int j=0;j<nivel[i].size();j++){
                    aux+=nivel[i].get(j)+"\t";
                }
            }
            aux+="\n";
        }
        return aux;
    }
}
