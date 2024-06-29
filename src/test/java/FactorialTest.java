import entities.Factorial;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertThrows;

public class FactorialTest {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testFactorialOfZero() {
        long result = Factorial.factorial(0);
        softAssert.assertEquals(result, 1);
    }

    @Test
    public void testFactorialOfFive() {
        long result = Factorial.factorial(5);
        softAssert.assertEquals(result, 120);
    }

    @Test
    public void testFactorialOfTen() {
        long result = Factorial.factorial(10);
        softAssert.assertEquals(result, 3628800);
    }

    @Test
    public void testFactorialException() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-10));
    }

    @AfterMethod
    public void tearDown() {
        softAssert.assertAll();
    }
}