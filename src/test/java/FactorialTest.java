import entities.Factorial;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class FactorialTest {

    Factorial factorial;

    @BeforeMethod
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void testFactorialOfZero() {
        long result = (int) factorial.factorial(0);
        assertEquals(result, 1);
    }

    @Test
    public void testFactorialOfFive() {
        long result = (int) factorial.factorial(5);
        assertEquals(result, 120);
    }

    @Test
    public void testFactorialOfTen() {
        long result = (int) factorial.factorial(10);
        assertEquals(result, 3628800);
    }

    @Test
    public void testFactorialException() {
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial(-10));
    }
}