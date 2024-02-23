import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        float coste ;
        int var;
        InterComun interfaz;
        
        interfaz = Factory.getTransporte(Factory.BICI);
        System.out.println("BICI");
        coste = interfaz.costeTotal(36201);
        var = interfaz.tipoEmbalaje(3,4,7,1050);
        System.out.println("1: "+ coste + "\n2: " + var);
        
        
        
        
    }
    
}