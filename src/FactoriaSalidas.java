public class FactoriaSalidas {
    public static final int CAMION = 1;
    public static final int BICICLETA = 2;
    /**
     * Devuelve producto del tipo de la Interface
     * @param type 1: camion, 2:bicicleta
     * @return producto segun el tipo
     */
    public static IComun getProducto(int type) {
        switch (type) {
            // tipo camion
            case CAMION:
                return new Camion();
            // tipo bicicleta
            case BICICLETA:
                return new Bicicleta();
            // otro tipo
            default:
                return null;
        }
    }
}
