import java.util.Random;
import java.util.TreeMap;

public class TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> arbol = new TreeMap();  //Constructor vacio ordena bajo el orden natural
        arbol.put(55,"N55");        //Agregamos algunos valores con el metodo put
        arbol.put(15,"N15");        //Coloque una N a cada numero para difenciar la llave del valor
        arbol.put(70,"N70");
        arbol.put(20,"N20");
        arbol.put(18,"N18");
        arbol.put(81,"N81");
        System.out.println(arbol.values()); //coloque valores desordenados y salen ordenados
        System.out.println("Tamaño actual: "+arbol.size());
        
        TreeMap arbol2 = new TreeMap();     //Genere un segundo arbol con numeros aleatorios
        for(int i=0;i<6;i++){
            Random aleat = new Random();
            int n = aleat.nextInt(100);
            arbol2.put(n,("N"+n));
        }
        System.out.println(arbol2.values());
        
        arbol.putAll(arbol2);
        System.out.println(arbol.values());
        
        arbol2.clear();         //Limpio el arbol 2
        if(arbol2.isEmpty()){   //Compruebo que el arbol 2 este vacio
            System.out.println("El arbol 2 esta vacio");
        }else{
            System.out.println("El arbol 2 no esta vacio");
        }
        
        System.out.println("Remplazando "+arbol.replace(20,"New20")+" con New20");//Remplaza el valor
        if(arbol.replace(20, "N15", "N20")){                            //Remplaza solo si tiene el valor especificado
            System.out.println("Se ha remplazado correctamente");       
        }else{
            System.out.println("No se ha podido remplazar");
        }
        
        if(arbol.containsKey(20)){      //Comprueba si tiene llave 20
            System.out.println("El arbol contiene la llave 20 con el valor "+arbol.get(20));    //Imprime el valor de la llave 20
        }
        
        System.out.println("Eliminando el valor "+arbol.remove(20));
        
        System.out.println(arbol.firstEntry()); //Muestra la entrada mas baja
        System.out.println(arbol.firstKey());   //Muestra el valor mas bajo
        System.out.println(arbol.lastEntry()); //Muestra la entrada mas alta
        System.out.println(arbol.lastKey());   //Muestra el valor mas alta
        //La mayoria de metodos tiene la opcion de mostrar las entradas(llave-valor)
        //O solo las llaves, a continuacion solo usare las entradas, pero tienen la opcion de solo las llaves
        
        System.out.println(arbol.lowerEntry(55));//Muestra la entrada que esta por debajo de 55
        System.out.println(arbol.higherEntry(55));//Muestra la entrada que esta por encima de 55
        
        System.out.println(arbol.ceilingEntry(37));//Muestra la entrada que esta por encima o sea igual a 37
        System.out.println(arbol.floorEntry(37));//Muestra la entrada que esta por debajo o sea igual a 37
        
        System.out.println("Normal: "+arbol);  //Orden normal
        System.out.println("Invertido: "+arbol.descendingMap());  //Orden invertido
        
        System.out.println(arbol.headMap(55));      //Extrae los valores menores a 55
        System.out.println(arbol.tailMap(55));      //Extrae los valores mayores o iguales a 55
        
        System.out.println(arbol.subMap(18,55));        //Extra los valores que se encuentran entre 18 y 55 incluyendo al 18
    }
}