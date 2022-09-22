
public class ClaseConjuntoADT {

    public static void main(String[] args) {
        conjuntoADT lista = new conjuntoADT();
        lista.agregar("Luis");
        lista.agregar("Luis");
        System.out.println("Longitud actual es "+lista.longitud());
        if (lista.contiene("Luis")){
            System.out.println("La lista contiene a Luis");
        }
        lista.agregar("Juan");
        lista.agregar("Maria");
        conjuntoADT lista2 = new conjuntoADT();
        lista2.agregar("Luis");
        lista2.agregar("Juan");
        lista2.agregar("Maria");
        if(lista.equals(lista2)){
            System.out.println("Las listas son iguales");
        }else{
            System.out.println("Las listas son diferentes");
        }
        lista2.agregar("Roberto");
        lista2.agregar("Eduardo");
        if(lista.equals(lista2)){
            System.out.println("Las listas son iguales");
        }else{
            System.out.println("Las listas son diferentes");
        }
        if(lista.esSubConjunto(lista2)){
            System.out.println("La lista 1 es subconjunto la lista 2");
        }else{
            System.out.println("La lista 1 no es subconjunto la lista 2");
        }
        if(lista2.esSubConjunto(lista)){
            System.out.println("La lista 2 es subconjunto la lista 1");
        }else{
            System.out.println("La lista 2 no es subconjunto la lista 1");
        }
        lista2.eliminar("Luis");
        System.out.println("Contenido lista 1:\n"+lista);
        System.out.println("Contenido lista 2:\n"+lista2);
        conjuntoADT lista3;
        lista3=lista.union(lista2);
        System.out.println("Contenido lista 3(union):\n"+lista3);
        conjuntoADT lista4;
        lista4=lista.interseccion(lista2);
        System.out.println("Contenido lista 4(interseccion):\n"+lista4);
        conjuntoADT lista5;
        lista5=lista.diferencia(lista2);
        System.out.println("Contenido lista 5(diferencia lista 1 a lista 2):\n"+lista5);
        conjuntoADT lista6;
        lista6=lista2.diferencia(lista);
        System.out.println("Contenido lista 6(diferencia lista 2 a lista 1):\n"+lista6);
    }
}
