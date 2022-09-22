
import java.util.ArrayList;


public class conjuntoADT<T> {
    private ArrayList <T> datos;
    
    conjuntoADT(){
        datos = new ArrayList();
    }
    
    public int longitud (){
        return datos.size();
    }
    
    public boolean contiene(T elemento){
        for(int i=0;i<datos.size();i++){
            if(datos.get(i)==elemento){
                return true;
            }
        }
        return false;
    }
    
    public void agregar (T elemento){
        boolean a=false;
        for(int i=0;i<datos.size();i++){
            if(datos.get(i)==elemento){
                a=true;
            }
        }
        if (a==false){
            datos.add(elemento);
        }
    }
    
    public void eliminar(T elemento){
        for(int i=0;i<datos.size();i++){
            if(datos.get(i)==elemento){
                datos.remove(i);
            }
        }
    }
    
    public boolean equals(conjuntoADT otroConjunto){
        if(otroConjunto.longitud()!=datos.size()){
            return false;
        }
        for(int i=0;i<datos.size();i++){
            if(otroConjunto.contiene(datos.get(i))==false){
                return false;
            }
        }
        return true;
    }
    
    public boolean esSubConjunto(conjuntoADT otroConjunto){
        for(int i=0;i<datos.size();i++){
            if(otroConjunto.contiene(datos.get(i))==false){
                return false;
            }
        }
        return true;
    }
    
    private ArrayList valores(){        //funcion que añadi para obtener los valores para las siguientes funciones
        return datos;
    }
    
    public conjuntoADT union(conjuntoADT otroConjunto){
        conjuntoADT temp = new conjuntoADT();
        for(T dato:datos){
            temp.agregar(dato);
        }
        for(Object dato : otroConjunto.valores()){
            temp.agregar(dato);
        }
        return temp;
    }
    
    public conjuntoADT interseccion(conjuntoADT otroConjunto){
        conjuntoADT temp = new conjuntoADT();
        for(T dato:datos){
            if(otroConjunto.contiene(dato)){
                temp.agregar(dato);
            }
        }
        return temp;
    }
    
    public conjuntoADT diferencia(conjuntoADT otroConjunto){
        conjuntoADT temp = new conjuntoADT();
        for(T dato:datos){
            if(otroConjunto.contiene(dato)==false){
                temp.agregar(dato);
            }
        }
        return temp;
    }
    
    @Override
    public String toString(){
        String S="\t";
        for(T dato:datos){
            S+=dato.toString()+"\n\t";
        }
        return S;
    }
}
