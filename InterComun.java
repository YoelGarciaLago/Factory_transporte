public interface InterComun {
    final static int PALET=0;
    final static int CARTON=1;
    final static int MADERA=2;
    
    public float costeTotal (Integer cod_Postal);
    
    public Integer tipoEmbalaje (float x, float y, float z, float peso);
}
