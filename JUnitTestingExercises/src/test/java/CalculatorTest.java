
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    public void testIsPositive() {
        Calculator calc = new Calculator();
        assertTrue(calc.isPositive(5));
        assertFalse(calc.isPositive(-2));
    }
}
