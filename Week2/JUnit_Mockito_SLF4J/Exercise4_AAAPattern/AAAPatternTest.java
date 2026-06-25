import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class AAAPatternTest {

    // Test fixture
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("setUp: Calculator created.");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("tearDown: Calculator cleared.");
    }

    @Test
    public void testAdd_AAAPattern() {
        int a = 10;
        int b = 5;

        int result = calculator.add(a, b);

        assertEquals(15, result);
    }

    @Test
    public void testSubtract_AAAPattern() {
        int a = 20;
        int b = 8;

        int result = calculator.subtract(a, b);

        assertEquals(12, result);
    }

    @Test
    public void testMultiply_AAAPattern() {
        int a = 4;
        int b = 6;

        int result = calculator.multiply(a, b);

        assertEquals(24, result);
    }
}