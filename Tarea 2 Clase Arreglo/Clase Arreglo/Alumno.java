//Programa hecho por Francisco Marquez Maya
//Grupo 1310

public class Alumno {
    String Nombre;
    int Edad,Ncuenta;
    Alumno(String Nombre,int Edad,int Ncuenta){
        this.Nombre=Nombre;
        this.Edad=Edad;
        this.Ncuenta=Ncuenta;
    }
    
    @Override
    public String toString(){
        return Nombre+"\t"+Edad+"\t"+Ncuenta;
    }
}
