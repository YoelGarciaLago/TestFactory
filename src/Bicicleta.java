 import javax.swing.*;

public class Bicicleta implements IComun {
    /**
     *
     * @param cp codigo postal
     * @return coste del envio
     */

    @Override
    public float costeTotal(int cp) {
        float coste=0;
        if (cp>0&cp<=10000) {
            coste=(float)(cp*0.00002);
        } else if (cp>10000&cp<=20000) {
            coste=(float)(cp*0.00003);
        } else if (cp>20000&cp<=30000) {
            coste=(float)(cp*0.00004);
        } else if (cp>30000&cp<=40000) {
            coste=(float)(cp*0.00005);
        } else if (cp>40000&cp<=50000) {
            coste=(float)(cp*0.00006);
        }
        return coste;
    }
    /**
     *
     * @param x dimension eje x
     * @param y dimension eje y
     * @param z dimension eje z
     * @param peso peso del pedido
     * @return totalembalaje
     */
    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {
        int totalembalaje=0;
        if(peso>1&peso<=10){
            totalembalaje=PALET;
        }
        else if(peso>10&peso<=100){
            totalembalaje=CAJA_DE_CARTON;
        }
        else if (peso>100){
            totalembalaje=CAJA_DE_MADERA;
        }
        return totalembalaje;
    }
}
