//Codigo realizado por Francisco Marquez Maya
//Grupo 1310

import java.util.ArrayList;


public class Stack <T>{
    private int tamanio=0;
    private ArrayList <T> pila;
    Stack(){
        pila=new ArrayList();
    }
    
    public boolean isEmpty(){
        return(tamanio==0);
    }
    
    public int length(){
        return(tamanio);
    }
    
    public void push(T dato){
        pila.add(dato);
        tamanio++;
    }
    
    public T pop(){
        T aux = pila.get(tamanio-1);
        pila.remove(tamanio-1);
        tamanio--;
        return(aux);
    }
    
    public T peek(){
        return(pila.get(tamanio-1));
    }
    
    @Override
    public String toString(){
        String S="\n";
        for(T dato:pila){
            S+=dato+"\n";
        }
        return(S);
    }
}
