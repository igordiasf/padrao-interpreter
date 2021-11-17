import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpretadorExpressoesAritmeticasTest {
    @Test
    void deveCalcularExpressaoSoma() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("2 + 2");
        assertEquals(4.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoSubtracao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("2 - 2");
        assertEquals(0.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoMultiplicacao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("2 * 2");
        assertEquals(4.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoDivisao() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("2 / 2");
        assertEquals(1.0, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoCombinada() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas("10 / 2 * 3 + 1 - 4");
        assertEquals(12.0, interpretador.interpretar());
    }
}