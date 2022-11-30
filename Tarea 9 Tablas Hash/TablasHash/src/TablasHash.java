//Codigo realizado por Francisco Marquez Maya
//Grupo 1310

public class TablasHash {
    public static void main(String[] args) {
        HashTableADT lista = new HashTableADT(11);
        lista.add(22, "Manzana");
        lista.add(11, "Naranja");
        System.out.println(lista);
        lista.add(32, "Piña");
        lista.add(7, "Mandarina");
        System.out.println(lista);
        System.out.println(lista.valueOf(22));
        System.out.println(lista.valueOf(11));
        lista.remove(11);
        System.out.println(lista);
        System.out.println(lista.valueOf(11));
    }
}
