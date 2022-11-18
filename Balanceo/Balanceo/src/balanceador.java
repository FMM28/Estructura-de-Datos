//Codigo realizado por Francisco Marquez Maya
//Grupo 1310

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class balanceador {
    private Stack balanceo = new Stack();
    private String S="";
    private Scanner doc;
    
    balanceador(String direccion){
        try {
            doc=new Scanner(new FileInputStream(direccion));      //Lee el texto
        } catch (FileNotFoundException ex) {
            Logger.getLogger(balanceador.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(doc.hasNextLine()){
                S+=doc.nextLine();          //Guarda el archivo en un String
            }
            S=S.replaceAll(" ","");         //Elimina espacios para acortar el String
    }
    
    public void balancear(char datoApertura, char datoCierre){
        if(!balanceo.isEmpty()){        //Vacia la pila
            for(int i=0;i<balanceo.length();i++){
                balanceo.pop();
            }
        }
        for(int i=0;i<S.length();i++){          //Analisa la cantidad de ( que hay
                if(S.charAt(i)==datoApertura){
                    balanceo.push(datoApertura);
                }
            }
        for(int i=0;i<S.length();i++){          //Analiza la cantidad de ) que hay
                if(S.charAt(i)==')'&&balanceo.length()!=0){
                    balanceo.pop();
                }else if(balanceo.length()==0){   //En caso de que haya mas ) que ( los guarda
                    for(int j=i;j<S.length();j++){
                        if(S.charAt(j)==datoCierre){
                            balanceo.push(datoCierre);
                        }
                    }
                    break;
                }
            }
    }
    
    public boolean isBalanceado(){
        return(balanceo.isEmpty());
    }
    
    public String datosNoBalanceados(){
        String A="";
        while(!balanceo.isEmpty()){
            A+=balanceo.pop();
        }
        return A;
    }
}
