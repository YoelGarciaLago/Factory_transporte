public class Factory {
    public final static int BICI = 0;
    public final static int CAMION = 1;
    
    public static InterComun getTransporte (int type){
        switch (type){
            case BICI:
                return new Bicicleta();
            case CAMION:
                return new Camion();
            default:
                return null;
        }
    }
}
