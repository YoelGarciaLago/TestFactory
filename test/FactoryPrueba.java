import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactoryPrueba {
    @Test
    @DisplayName("tipo bici")
    public void biciPrueba(){
        IComun objeto = FactoriaSalidas.getProducto(FactoriaSalidas.BICICLETA);
        assertInstanceOf(objeto.getClass() == Bicicleta.class);
        assertTrue(objeto instanceof Bicicleta);
    }

    private void assertInstanceOf(boolean b) {
    }

    @Test
    @DisplayName("tipo camion")
    public void camiPrueba(){
        IComun objeto = FactoriaSalidas.getProducto(FactoriaSalidas.CAMION);
        assertInstanceOf(objeto.getClass() == Camion.class);
        assertTrue(objeto instanceof Camion);
    }
}
