//Codigo realizado por Francisco Marquez Maya
//Grupo 1310

public class keyValue<T> {          //Cree esta estructura basica para poder almacenar la llave y el valor como uno solo
    private final int key;
    private final T value;
    keyValue(int key,T value){
        this.key=key;
        this.value=value;
    }

    public int getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
    
}
