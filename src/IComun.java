public interface IComun {
    /**
     *Tipo de Embalaje
     */
     int PALET=0;
    /**
     *Tipo de Embalaje
     */
     int CAJA_DE_CARTON=1;
    /**
     *Tipo de Embalaje
     */
     int CAJA_DE_MADERA=2;

    /**
     *
     * @param cp codigo postal
     * @return coste del pedido
     */
    public float costeTotal(int cp);
    /**
     *
     * @param x dimension eje x
     * @param y dimension eje y
     * @param z dimension eje z
     * @param peso peso del pedido
     * @return totalembalaje
     */
    public int tipoEmbalaje(float x,float y,float z,float peso);
}
