import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testDivision() {
        int result = 10 / 2;
        assertEquals(6, result);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }
}
