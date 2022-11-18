//Codigo realizado por Francisco Marquez Maya
//Grupo 1310

public class Balanceo {

    public static void main(String[] args) {
        balanceador texto1 = new balanceador("src//texto1.txt");
        balanceador texto2 = new balanceador("src//texto2.txt");
        texto1.balancear('(', ')');
        if(texto1.isBalanceado()){
            System.out.println("El texto 1 esta balanceado en parentesis");
        }else{
            System.out.println("El texto 1 no esta balanceado\nDatos no balanceados: "+texto1.datosNoBalanceados());
        }
        texto1.balancear('{', '}');
        if(texto1.isBalanceado()){
            System.out.println("El texto 1 esta balanceado en llaves");
        }else{
            System.out.println("El texto 1 no esta balanceado\nDatos no balanceados: "+texto1.datosNoBalanceados());
        }
        texto2.balancear('(', ')');
        if(texto2.isBalanceado()){
            System.out.println("El texto 2 esta balanceado en parentesis");
        }else{
            System.out.println("El texto 2 no esta balanceado\nDatos no balanceados: "+texto1.datosNoBalanceados());
        }
        texto2.balancear('{', '}');
        if(texto1.isBalanceado()){
            System.out.println("El texto 2 esta balanceado en llaves");
        }else{
            System.out.println("El texto 2 no esta balanceado\nDatos no balanceados: "+texto1.datosNoBalanceados());
        }
    }
    
}
