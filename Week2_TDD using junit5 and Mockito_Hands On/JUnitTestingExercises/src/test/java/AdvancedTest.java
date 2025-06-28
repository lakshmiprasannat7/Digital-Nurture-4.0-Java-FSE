
import org.junit.*;
import static org.junit.Assert.*;

public class AdvancedTest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup called");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown called");
    }

    @Test
    public void testAddition() {
        int result = calc.add(10, 20);
        assertEquals(30, result);
    }
}
