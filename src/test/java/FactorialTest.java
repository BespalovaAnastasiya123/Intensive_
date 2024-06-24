import entities.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void testCalculateFactorial() {
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2, Factorial.factorial(2));
        assertEquals(6, Factorial.factorial(3));
        assertEquals(24, Factorial.factorial(4));
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    void testCalculateFactorialWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}