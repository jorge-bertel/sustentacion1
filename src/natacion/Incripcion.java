
package natacion;
import java.util.ArrayList;

public class Incripcion extends gestion {
    String nombre_competencia;
    ArrayList<gestion> deportista; 

    public Incripcion(String nombre_competencia)
    {
    this.nombre_competencia=nombre_competencia;
    deportista=new ArrayList<gestion>();
            
    }
    public String getNombre_competencia() {
        return nombre_competencia;
    }

    public ArrayList<gestion> getDeportista() {
        return deportista;
    }

    public void setNombre_competencia(String nombre_competencia) {
        this.nombre_competencia = nombre_competencia;
    }

    public void setDeportista(ArrayList<gestion> deportista) {
        this.deportista = deportista;
    }
    
    public void agregar_deportista(gestion nadador)
    {
    deportista.add(nadador);
    }
public void eliminar_deportista(String identi)
    {   int bandera=0;
        for (int k=0; k<deportista.size(); k++){
                    if (identi.equals(deportista.get(k).get_documentos())){
                       deportista.remove(k);
                       bandera=1;
                       
                    break;
    }    
    
                  if (bandera==0){
                      System.out.println("la cedula no esta inscrita");
                  }
    
    
    
    
}
        
    }

        public void mostra_deportista(){
            System.out.println("los deportistas de esta categoria");
            for (int k=0; k<deportista.size(); k++){
                    deportista.get(k).mostrar();
                   
                       
                    break;
    }        

}

}