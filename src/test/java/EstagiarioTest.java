import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstagiarioTest {
    @Test
    void deveCalcularExpressaoComFormula() {
        Estagiario estagiario = new Estagiario();
        estagiario.setSalario(600.00);
        estagiario.setHorasExtras(4.0);

        assertEquals(600.00, estagiario.calcularSalario());
    }
}