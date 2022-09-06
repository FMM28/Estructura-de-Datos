//Programa hecho por Francisco Marquez Maya
//Grupo 1310

public class Arreglo {
    private final int tamaño;
    Alumno [] A;
    Arreglo(int tamaño){
        this.tamaño=tamaño;
        A=new Alumno[tamaño];
    }
    
    public int getLongitud(){
        return tamaño;
    }
    
    public void setElemento(int indice,Alumno valor){
        A[indice]=valor;
    }
    
    public Alumno getElemento(int indice){
        return A[indice];
    }
    
    public void limpiar(Alumno valor){
        for(int i=0;i<tamaño;i+=1){
            A[i]=valor;
        }
    }
    
    public void limpiar(String valor1,int valor2,int valor3){
        for(int i=0;i<tamaño;i+=1){
            A[i]= new Alumno (valor1,valor2,valor3);
        }
    }
    
    @Override
    public String toString(){
        String S = new String();
        for(int i=0;i<tamaño;i+=1){
            S+=A[i];
            S+="\n";
        }
        return S;
    }
}
