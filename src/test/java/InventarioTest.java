import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {
    @Test
    void calcularSubtotalDeCuatroProductos() {
        int resultado = inventario.calcularSubtotal(64, 18);
        assertEquals(46, resultado);
    }
    
}
