public interface InterComun {
    /**
     * embalaje
     */
    final static int PALET=0;
    /**
     * embalaje
     */
    final static int CARTON=1;
    /**
     * embalaje
     */
    final static int MADERA=2;
    /**
     *
     * @param cod_Postal
     * @return coste del pedido
     */
    public float costeTotal (Integer cod_Postal);
    /**
     *
     * @param x ancho
     * @param y alto
     * @param z profundo
     * @param peso xd
     * @return tipo de embalaje
     */
    public Integer tipoEmbalaje (float x, float y, float z, float peso);
}
