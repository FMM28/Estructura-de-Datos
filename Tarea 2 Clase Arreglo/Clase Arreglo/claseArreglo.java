//Programa hecho por Francisco Marquez Maya
//Grupo 1310

public class claseArreglo {

    public static void main(String[] args) {
        Arreglo lista = new Arreglo(5);
        Alumno alumno1 = new Alumno("Juan",20,3165486);
        lista.setElemento(0, alumno1);
        lista.setElemento(1, new Alumno("Jose",21,51464684));
        lista.setElemento(3, new Alumno ("Maria",19,6874354));
        System.out.println("El tamaño de la lista es de "+lista.getLongitud()+"\n");
        System.out.println(lista.toString());
        lista.limpiar(null);
        System.out.println(lista.toString());
        lista.limpiar("Vacio",0,0);
        System.out.println(lista.toString());
    }
    
}
