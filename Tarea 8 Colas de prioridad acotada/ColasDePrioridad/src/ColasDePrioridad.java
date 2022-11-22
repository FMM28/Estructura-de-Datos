//Codigo realizado por Francisco Marquez Maya
//Grupo 1310

public class ColasDePrioridad {
    public static void main(String[] args) {
        BoundedPriorityQueue cola = new BoundedPriorityQueue(5);
        cola.enqueue(4, "Juan");
        cola.enqueue(4, "Jose");
        cola.enqueue(3, "El profe");
        cola.enqueue(2, "El director");
        System.out.println(cola.length());
        System.out.println(cola);
        cola.dequeue();
        System.out.println(cola.length());
        System.out.println(cola);
        cola.enqueue(4, "Maria");
        cola.enqueue(0, "El presidente");
        System.out.println(cola.length());
        System.out.println(cola);
        System.out.println("Elemento retirado "+cola.dequeue());
        System.out.println(cola.length());
        System.out.println(cola);
        cola.dequeue();
        cola.dequeue();
        System.out.println(cola);
    }
    
}
