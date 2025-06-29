import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    //Setup
    @Before
    public void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator(); // Arrange
    }

    //TearDown
    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null;
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Act
        int result = calculator.subtract(10, 5);

        // Assert
        assertEquals(5, result);
    }
    
    @Test
    public void testMultiplication() {
        // Act
        int result = calculator.multiply(10, 5);

        // Assert
        assertEquals(50, result);
    }
    
    @Test
    public void testDivision() {
        // Act
        int result = calculator.divide(10, 5);

        // Assert
        assertEquals(2, result);
    }
}
