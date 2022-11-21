//Codigo realizado por Francisco Marquez Maya
//Grupo 1310

public class ColasADT {
    public static void main(String[] args) {
        Colas cola = new Colas();
        cola.enqueue("Juan");
        cola.enqueue("Maria");
        cola.enqueue("Fernando");
        System.out.println(cola.toString());
        System.out.println("Tamaño actual "+cola.length());
        System.out.println("Removemos "+cola.dequeue());
        System.out.println("Tamaño actual "+cola.length());
        System.out.println(cola.toString());
        cola.enqueue("Alejandro");
        System.out.println(cola.toString());
    }
    
}
