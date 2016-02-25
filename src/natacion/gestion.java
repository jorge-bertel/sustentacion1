
package natacion;

import java.util.Scanner;


public class gestion {
    private String nombre;
    private String documento;
    private int rama;
    private int fechanacimi;
    private String categoria;
    public void Ingresar (String nombre) {
       this.nombre = nombre;
    }

    public void setDocumento(String  documento) {
        this.documento = documento;
    }

    public void setRama(int rama) {
        this.rama = rama;
    }

    public void setFechanacimi(int fechanacimi) {
        this.fechanacimi = fechanacimi;
    }
    
    public void ingresardeportista (){
            
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese nombre completo: ");
        nombre = lector.nextLine();
        System.out.println("Documento de identidad: ");
        documento=lector.nextLine();
        System.out.println("rama 1-masculino 2-femenino");
        rama=lector.nextInt();
        System.out.println("ingrese año de nacimiento");
        fechanacimi=lector.nextInt();
        calcular_categoria();
    }
    
    public void modificar () {
            
            System.out.println("Actualizando datos");
            ingresardeportista();
    }
    
    public void calcular_categoria() {
                int edad=0;
                edad= 2016 - fechanacimi;
                if (edad<=6 && edad >=10 ) {
                categoria= "infantil A";                
                }
        if (edad>10 && edad <=17 ) {
                categoria= "infantil B";                
                }
        if (edad>17 && edad <=25 ) {
                categoria= "juvenil";                
                }
        if (edad>25 ) {
                categoria= "senior";                
                }
    }
    
    public void mostrar () {
    
               System.out.println("nombre: " +nombre);
               System.out.println("cedula: " +documento);
               System.out.println("rama: " +rama);
               System.out.println("fecha de nacimiento: " +fechanacimi);
               System.out.println("categoria: " +categoria);
               }
    
    
    public String  get_documentos (){
    
            return documento;
    
    }
}
