import java.util.*;

public class linkedHashMap {
    public static void main(String[] args) {
        /*
        LinkedHashMap hereda los metodos de HashMap, por lo que son los mismos
        La unica diferencia es la forma en la que acceden a los datos, por
        lo que si utilizamos un iterador el resultado puede ser diferente
        A continuacion hare uso de ambas estructuras para mostrar sus diferencias
        Ya que sus metodos son los mismo no empleare todos solo los mas importantes
        */
        
        LinkedHashMap LHMap = new LinkedHashMap();  //Constructores vacios
        HashMap HMap = new HashMap();
        
        for(int i=0;i<8;i++){               //Genero numeros alatorios y los almaceno en ambas estructuras
            Random aleat = new Random();
            int n = aleat.nextInt(100);
            System.out.print(n+"\t");       //Imprimo el numero generado para saber el orden en el que se generaron
            LHMap.put((i+1)*3,"N"+(i+1)*3);     //Coloco algunos valores que no van a variar 
            HMap.put((i+1)*3,"N"+(i+1)*3);
            LHMap.put(n,("N"+n));       //Coloco los valores aleatorios
            HMap.put(n,("N"+n));
        }
        
        System.out.println("\nHashMap"+HMap.values());      //Imprimo para comparar el oreden en el que se guardan
        System.out.println("LinkedHashMap"+LHMap.values());
        
        LHMap.replace(12,"New12");              //Remplazo 
        HMap.replace(12,"New12");
        
        System.out.println("\nHashMap"+HMap.values());          //Imprimo para comprovar que remplazar valores no afecta el orden
        System.out.println("LinkedHashMap"+LHMap.values());
        
        System.out.println(LHMap.get(18));      //Se obtienen los valores con el mismo metodo
        System.out.println(HMap.get(18));
        /*
        Se pueden realizar los metodos clear, getOrDefault, isEmpty, size y todos los metodos
        que HashMap y el resultado seria el mismo
        Los unicos que varian son entrySet, forEach, keySet, putAll, putIfAbsent
        ya que LinkedHashMap los almacena en el orden que fueron introducidos y 
        HashMap los ordena de acuerdo a una funcion
        */
    }
}