import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        assertEquals(10, 5+3+2);
        assertEquals(20, 11+9);


        assertTrue(5 > 3);
        assertTrue(10 == 5+5);


        assertFalse(5 < 3);
        assertFalse(10 == 20);


        assertNull(null);


        assertNotNull(new Object());
    }
}
