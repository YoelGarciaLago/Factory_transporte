import java.util.Scanner;
public class Bicicleta implements InterComun{
    Scanner sc = new Scanner(System.in);
    public Bicicleta(){
    
    }
    @Override
    public float costeTotal(Integer cod_Postal) {
        
        float costeTotal = 0;
        if (cod_Postal<36201 || (36216<cod_Postal && cod_Postal<36312) || cod_Postal>36331) {
            int Postal;
            do {
                System.out.println("Los paquetes solo se reparten en Vigo ");
                System.out.println("Pon bien el Código postal");
                Postal = sc.nextInt();
            } while (Postal<36201 || (36216<Postal && Postal<36312) || Postal>36331);
           cod_Postal = Postal;
        }
        else if ((cod_Postal>=36201 && cod_Postal<=36216)){
            costeTotal = cod_Postal/1200;
        }
        else if ((cod_Postal<=36331 && cod_Postal>=36216)){
            costeTotal = cod_Postal/1100;
        }
        return costeTotal;
    }
    
    @Override
    public Integer tipoEmbalaje(float x, float y, float z, float peso) {
        int xa,ya,za,pesoa, var = 0;
        if ( (x < 0 && x > 5 ) ||  (y < 0 && y > 5 )  || (z < 0 && z > 5 )|| (peso < 0 && peso >10)){
           do{
               System.out.println("Pon x");
               xa = sc.nextInt();
               System.out.println("Pon y");
               ya = sc.nextInt();
               System.out.println("Pon z");
               za = sc.nextInt();
               System.out.println("Pon el peso");
               pesoa = sc.nextInt();
           }while ((xa < 0 && xa > 5 ) ||  (ya < 0 && ya > 5 )  || (za < 0 && za > 5 )|| (pesoa < 0 && pesoa >10));
           x = xa;y = ya; z = za; peso = pesoa;
        }
        else if (peso > 10000)
             var = PALET;
        else if (peso >1000)
            var = MADERA;
        else
            var = CARTON;
        return var;
    }
}
