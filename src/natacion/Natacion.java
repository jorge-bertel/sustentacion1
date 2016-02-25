
package natacion;

import java.util.Scanner;
import java.util.ArrayList;

public class Natacion {

    
    public static void main(String[] args) {
        String nombre;
        int ano,sexo, opcion=0, opcion1=0, opcion3=0, opcion4=0,opcion5=0;
        String iden;
        boolean estado= false;
        Scanner lector = new Scanner(System.in);
        gestion gest= new gestion();
        Incripcion[] lista_categorias = new Incripcion[4]; 
        lista_categorias[0]=new Incripcion("libre");
        lista_categorias[1]=new Incripcion("mariposa");
        lista_categorias[2]=new Incripcion("pecho");
        lista_categorias[3]=new Incripcion("espalda");
        ArrayList<gestion> lista = new ArrayList<gestion>();
            
        while(opcion!=3){
        
             System.out.println("ingrese 1-Gestion de deportistas   2-inscripcion en competencia");   
             opcion1=lector.nextInt();
             
             switch (opcion1){
                 case 1:
             while (opcion!=5){
             System.out.println("seleccione la opcion deseada ");
             System.out.println("1.Ingresar deportista");
             System.out.println("2.Actualizar deportista");
             System.out.println("3.Eliminar deportista");
             System.out.println("4.Buscar deportista");
             System.out.println("5. salir");
             opcion=lector.nextInt();
             lector.nextLine();
             
             switch (opcion){
                 case 1:
                    gest=new gestion ();
                    gest.ingresardeportista();
                    if(lista.size()==0)
                    {
                    lista.add(gest);
                    
                    }
                    else {
                    for (int i=0; i<lista.size(); i++){
                    if (gest.get_documentos().equals(lista.get(i).get_documentos())){
                        System.out.println("este documento ya esta registrado");
                       estado=true;
                        break;
                        
                    }
                    }
                    if(estado==false)
                    {
                        lista.add(gest);
                    } 
                    }
                    
                    break;
                    
                 case 2:
                     System.out.println("ingrese su cedula");
                     iden=lector.nextLine();                     
                     for (int k=0; k<lista.size(); k++){
                    if (iden.equals(lista.get(k).get_documentos())){
                       lista.get(k).modificar();
                       lista.get(k).mostrar();
                       estado=true;
                        break;
                        
                    }
                     
                    }
                     if(estado==false)
                     {
                     {System.out.println("la cedula no existe");}
                     }
                     break;
                 case 3:
                     System.out.println("ingrese su cedula");
                     iden=lector.nextLine();                     
                     for (int k=0; k<lista.size(); k++){
                    if (iden.equals(lista.get(k).get_documentos())){
                       lista.remove(k);
                       estado=true;
                        break;
                        
                    }
                    
                    }
                     if(estado==false)
                     {
                     {System.out.println("la cedula no existe");}
                     }
                     break;
                     
                 case 4:
                     System.out.println("ingrese su cedula");
                     iden=lector.nextLine();
                     for (int k=0; k<lista.size(); k++){
                       if (iden.equals(lista.get(k).get_documentos())){
                       lista.get(k).mostrar();
                       estado=true;
                        break;
                    
             } 
             }
                     if(estado==false)
                     {
                     {System.out.println("la cedula no existe");}
                     }
                     break;
    }
    
             }
             break;
                 case 2:
             while (opcion!=4){
             System.out.println("seleccione la opcion deseada ");
             System.out.println("1.Inscribir nadador a una prueba");
             System.out.println("2.Eliminar nadador de una prueba");
             System.out.println("3.Mostrar prueba");
             System.out.println("4. salir");
             opcion3=lector.nextInt();
             lector.nextLine();
             switch (opcion3){
             case 1:
                   System.out.println("ingrese la cedula del usuario que desea inscribir");
                     iden=lector.nextLine();    
                     System.out.println(""+iden);
                     System.out.println(""+lista.size());
                     for (int k=0; k<lista.size(); k++){
                    if (iden.equals(lista.get(k).get_documentos())){
                       System.out.println("usuario ya inscrito");
                       estado=true;
                       System.out.println("a que competencia desea inscribirse");
                       System.out.println("1.libre");
                        System.out.println("2.mariposa");
                        System.out.println("3.pecho");
                        System.out.println("4. espalda");
                        System.out.println("5. salir");
                       lector.nextLine();
                        switch (opcion4){
                            
                            case 1:
                                lista_categorias[0].agregar_deportista(lista.get(k));
                                
                               break;
                            case 2:
                                lista_categorias[1].agregar_deportista(lista.get(k));
                                break;
                            case 3:
                                lista_categorias[2].agregar_deportista(lista.get(k));
                                break;
                            case 4:
                                lista_categorias[3].agregar_deportista(lista.get(k));
                                break;
                            case 5:
                                break;
   
                        }
                        break;
                        
                    }
                    
                    }
                     if(estado==false)
                     {
                     {System.out.println("la cedula no existe");}
                     }
                     break;
                     
            
             case 2:
                  System.out.println("ingrese la cedula del usuario que desea eliminar");
                     iden=lector.nextLine();                     
                     for (int k=0; k<lista.size(); k++){
                    if (iden.equals(lista.get(k).get_documentos())){
                       System.out.println("usuario ya inscrito");
                       estado=true;
                       System.out.println("a que competencia desea inscribirse");
                       System.out.println("1.libre");
                        System.out.println("2.mariposa");
                        System.out.println("3.pecho");
                        System.out.println("4. espalda");
                        System.out.println("5. salir");
                       
                        switch (opcion4){
                            
                            case 1:
                                lista_categorias[0].eliminar_deportista(iden);
                                
                               break;
                            case 2:
                                 lista_categorias[1].eliminar_deportista(iden);

                                break;
                            case 3:
                                lista_categorias[2].eliminar_deportista(iden);
                                break;
                            case 4:
                                lista_categorias[3].eliminar_deportista(iden);
                                break;
                            case 5:
                                break;
   
                        }
                        break;
                        
                    }
                    
                    }
                     if(estado==false)
                     {
                     {System.out.println("la cedula no existe");}
                     }
             break;
             case 3:
                 System.out.println("Seleccion categoria");
                  System.out.println("1.libre");
                        System.out.println("2.mariposa");
                        System.out.println("3.pecho");
                        System.out.println("4. espalda");
                        System.out.println("5. salir");
                        
                        switch (opcion5){
                           case 1:
                                lista_categorias[0].mostra_deportista();
                                
                               break;
                            case 2:
                                 lista_categorias[1].mostra_deportista();

                                break;
                            case 3:
                                lista_categorias[2].mostra_deportista();
                                break;
                            case 4:
                                lista_categorias[3].mostra_deportista();
                                break;
                            case 5:
                                break; 
                               }
                          break;
             case 4:
             break;
    
             }
             break;
    }
}
    }
    }
    }
