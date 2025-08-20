package Testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTesting {
    Calculator calculator = new Calculator();

    @Test
    void testAdd(){
        assertEquals(5, calculator.add(3,2));
    }
    @Test
    void testSubtraction(){
        assertEquals(10,calculator.subtract(15,5));
    }
    @Test
    void testMultiply(){
        assertEquals(15,calculator.multiply(5,3));
    }
    @Test
    void testDivision(){
        assertEquals(2,calculator.divide(6,3));
    }
}
