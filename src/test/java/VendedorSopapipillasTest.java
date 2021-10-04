import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorSopapipillasTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test

    void vuelto() {
        int numero = (int)(Math.random()*1000+1);
        int numero2 = (int)(Math.random()*1000+1);
        int cantPago=numero;
        int debepagar=numero2;
        int vuelto=cantPago-debepagar;
        assertEquals();

    }

    @Test
    void cantPagar() {
    }

    @Test
    void cantComprar() {
    }
}