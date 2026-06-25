import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class AAAPatternTest {

    // This is our "fixture" - shared object used across tests
    private Calculator calculator;

    // @Before runs BEFORE every single test method
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("setUp: Calculator created.");
    }

    // @After runs AFTER every single test method
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("tearDown: Calculator cleared.");
    }

    @Test
    public void testAdd_AAAPattern() {
        // ARRANGE - prepare the data
        int a = 10;
        int b = 5;

        // ACT - call the method being tested
        int result = calculator.add(a, b);

        // ASSERT - verify the result
        assertEquals(15, result);
    }

    @Test
    public void testSubtract_AAAPattern() {
        // ARRANGE
        int a = 20;
        int b = 8;

        // ACT
        int result = calculator.subtract(a, b);

        // ASSERT
        assertEquals(12, result);
    }

    @Test
    public void testMultiply_AAAPattern() {
        // ARRANGE
        int a = 4;
        int b = 6;

        // ACT
        int result = calculator.multiply(a, b);

        // ASSERT
        assertEquals(24, result);
    }
}