import java.util.HashMap;

public class HashMap {
    public static void main(String[] args) {
        
        HashMap mapa = new HashMap();      //Constructor vacio (con capacidad inicial de 16 elemntos

        mapa.put(4, "Manzana");        //Agregamos algunos elementos con el metodo put
        mapa.put(5, "Naranja");
        mapa.put(6, "Mandarina");
        System.out.println(mapa.values());     //Podemos consultar los elementos contenidos con el metodo values

        HashMap mapa2 = new HashMap(5);     //Constructor con una capacidad de 5 elementos
        mapa2.put(1, "Jitomate");
        mapa2.put(2, "Zanahoria");
        mapa2.put(3, "Papa");

        mapa.putAll(mapa2);                //Agregamos todos los elementos del mapa2 con el metodo putAll
        System.out.println("Tamaño actual: "+mapa.size());      //Comprobamos su tamaño
        System.out.println(mapa.values());     //Se han añadido los elemntos en el orden de sus llaves

        mapa2.clear();         //Limpiamos el mapa2 con el metodo clear
        if(mapa2.isEmpty()){       //Comprobamos si realmente esta vacio
            System.out.println("El mapa 2 esta vacio");
        }else{
            System.out.println("El mapa 2 no esta vacio");
        }

        if(mapa.containsKey(3)){               //Comprueba si tiene la llave 3
            System.out.println(mapa.get(3));   //Imprime la llave 3 si la encuentra
        }

        if(mapa.containsValue("Lechuga")){                     //Comprueba si esta el valor Lechuga
            System.out.println("El mapa contiene Lechuga");    
        }else{
            mapa.putIfAbsent(7, "Lechuga");                //Agrega Lechuga si no esta
            System.out.println("Se ha agregado Lechuga");
        }
        System.out.println(mapa.putIfAbsent(7, "Cebolla"));        
         //El metodo putIfAbsent se puede utilizar para añadir si no queremos perder el valor anterior y evita que se añada el nuevo valor

        mapa.remove(7);                //Se ha eliminado la llave 7
        System.out.println(mapa.values());
        System.out.println(mapa.getOrDefault(7, "No se encontro la llave 7"));         
        //El metodo getOrDefault nos permite obtener el valor de la llave indicada pero si no le encuentra podemos asiganr un valor por defecto

        mapa.replace(1, "Apio");        //Nos sive para remplazar un valor
        System.out.println(mapa.get(1));    //comprobamos que se ca remplazado
        if(mapa.replace(1, "Espinaca", "Jitomate")){        //Intentamos remplazar espinaca por jitomate pero como no es espinaca nos se remplaza
            System.out.println("Se ha remplazado espinaca por jitomate");
        }else {
            System.out.println("No se ha encontrado espinaca");
        }
    
        System.out.println(mapa.entrySet());    //Imprime los mapeos contenidos en el mapa
        System.out.println(mapa.keySet());      //Imprime las llaves contenidos en el mapa
        
    }
    
}