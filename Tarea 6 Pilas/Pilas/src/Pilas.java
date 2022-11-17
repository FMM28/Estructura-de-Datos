//Codigo realizado por Francisco Marquez Maya
//Grupo 1310

public class Pilas {

    public static void main(String[] args) {
        Stack pila = new Stack();
        pila.push("Juan");
        System.out.println("Tamaño actual "+pila.tamanio);
        pila.pop();
        System.out.println("Tamaño actual "+pila.tamanio);
        pila.push("Juan");
        pila.push("Maria");
        pila.push("Alejandro");
        System.out.println("Dato removido "+pila.pop());
        System.out.println("Tamaño actual "+pila.tamanio);
        System.out.println("Ultimo dato "+pila.peek());
        System.out.println("Tamaño actual "+pila.tamanio);
        System.out.println(pila);
    }
    
}
