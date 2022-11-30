//Codigo realizado por Francisco Marquez Maya
//Grupo 1310

public class HashTableADT<T> {
    private keyValue <T> [] tabla;      //Arreglo de una estructura que cree para almacenar el valor junto con su llave
    
    HashTableADT(int tamaño){
        tabla=new keyValue[tamaño];
    }
    
    public void add(int key,T value){
        int hash=key%tabla.length;
        keyValue dato = new keyValue(key,value);
        if(tabla[hash]==null){
            tabla[hash]=dato;
        }else {
            boolean asignado=false;
            for(int i=hash;i<tabla.length;i++){
                if(tabla[i]==null){
                    tabla[i]=dato;
                    asignado=true;
                    break;
                }
            }
            if(!asignado){
                for(int i=0;i<hash;i++){
                    if(tabla[i]==null){
                        tabla[i]=dato;
                        asignado=true;
                        break;
                    }
                }
            }
            if(!asignado){
                System.out.println("No se pudo almacenar el valor, tabla llena");
            }
        }
    }
    
    public T valueOf (int key){
        int hash=key%tabla.length;
        if(tabla[hash]!=null&&tabla[hash].getKey()==key){
            return tabla[hash].getValue();
        }else{
            for(int i=hash;i<tabla.length;i++){
                if(tabla[i]!=null&&tabla[i].getKey()==key){
                    return tabla[i].getValue();
                }
            }
            for(int i=0;i<hash;i++){
                if(tabla[i]!=null&&tabla[i].getKey()==key){
                    return tabla[i].getValue();
                }
            }
        }
        return null;
    }
    
    public void remove(int key){
        int hash=key%tabla.length;
        if(tabla[hash].getKey()==key){
            tabla[hash]=null;
        }else{
            for(int i=hash;i<tabla.length;i++){
                if(tabla[i]!=null&&tabla[i].getKey()==key){
                    tabla[i]=null;
                }
            }
            for(int i=0;i<hash;i++){
                if(tabla[i]!=null&&tabla[i].getKey()==key){
                    tabla[i]=null;
                }
            }
        }
    }
    
    @Override
    public String toString (){              //Este metodo no se pidio pero lo añadi para poder analizar el comportamiento de la tabla sobre todo cuando hay colision
        String S="Indice\tKey\tValor\n";
        for(int i=0;i<tabla.length;i++){
            if(tabla[i]!=null){
                S+=(i+"\t"+tabla[i].getKey()+"\t"+tabla[i].getValue()+"\n");
            }
        }
        return S;
    }
}
