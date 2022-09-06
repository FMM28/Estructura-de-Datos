//Programa hecho por Francisco Marquez Maya
//Grupo 1310

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NominaADT {
    private final String ruta;
    Arreglo<Empleado> nomina = new Arreglo(15);
    
    public NominaADT(String ruta){
    this.ruta=ruta;
    }
    
    public void leer() {
        FileReader fr = null;
        try {
            fr = new FileReader(ruta);
            BufferedReader bf = new BufferedReader(fr);
            String cadena;
            int i = 0;
            while ((cadena = bf.readLine())!=null) {
                i++;
                String[] split = cadena.split(",");
                if(i>1){
                nomina.setElemento(i-1, new Empleado(Integer.parseInt(split[0]),split[1],split[2],split[3],Integer.parseInt(split[4]),Integer.parseInt(split[5]),Integer.parseInt(split[6])));
                }   
            }   
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NominaADT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NominaADT.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(NominaADT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void sueldos(){
        for(int i=1;i<15;i++){
            System.out.println("ID:"+nomina.getElemento(i).getId()+"\t  Sueldo:"+nomina.getElemento(i).calcularSueldo());
        }
    }
    
    public void antiguedad(){
        //Resolvi el problema con una sola variable que guarda el indice del trabajador
        int trabajador=1;
        for(int i=2;i<15;i++){
            
            if(nomina.getElemento(trabajador).getAnioIngreso()>nomina.getElemento(i).getAnioIngreso()){
                trabajador=i;
            }
        }
        System.out.println("El trabajador mayor antiguedad es: "+nomina.getElemento(trabajador).getNombre()+" "+nomina.getElemento(trabajador).getPaterno()+" "+nomina.getElemento(trabajador).getMaterno());
        
        trabajador=1;
        
        for(int i=2;i<15;i++){
            
            if(nomina.getElemento(trabajador).getAnioIngreso()<nomina.getElemento(i).getAnioIngreso()){
                trabajador=i;
            }
        }
        System.out.println("El trabajador menor antiguedad es: "+nomina.getElemento(trabajador).getNombre()+" "+nomina.getElemento(trabajador).getPaterno()+" "+nomina.getElemento(trabajador).getMaterno());
    }
    
}
