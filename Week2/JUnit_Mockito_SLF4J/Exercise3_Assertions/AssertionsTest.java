import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        // 1. assertEquals - checks two values are equal
        assertEquals(5, 2 + 3);

        // 2. assertTrue - checks condition is true
        assertTrue(5 > 3);

        // 3. assertFalse - checks condition is false
        assertFalse(5 < 3);

        // 4. assertNull - checks value is null
        assertNull(null);

        // 5. assertNotNull - checks value is NOT null
        assertNotNull(new Object());

        // 6. assertEquals with delta (for doubles)
        assertEquals(3.14, Math.PI, 0.01);

        // 7. assertArrayEquals - checks two arrays are equal
        int[] expected = {1, 2, 3};
        int[] actual   = {1, 2, 3};
        assertArrayEquals(expected, actual);

        // 8. assertSame - checks both point to exact same object
        String str = "hello";
        assertSame(str, str);

        // 9. assertNotSame - checks they are different objects
        assertNotSame(new Object(), new Object());
    }
}