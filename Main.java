import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        /**
         * @param coste para visualizar el método
         */
        float coste ;
        /**
         * @param var para visualizar el método
         */
        int var;
        /**
         * para poder sacar métodos y tal
         */
        InterComun interfaz;
        
        
        interfaz = Factory.getTransporte(Factory.BICI);
        /**
         * demostración de el funcionamiento del código
         */
        System.out.println("BICI");
        coste = interfaz.costeTotal(36201);
        var = interfaz.tipoEmbalaje(3,4,7,1050);
        System.out.println("1: "+ coste + "\n2: " + var);
        
        
        
        
    }
    
}