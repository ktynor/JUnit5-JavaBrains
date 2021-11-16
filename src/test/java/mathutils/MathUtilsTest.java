package mathutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTest {

    @Test
    void shouldAddTwoNumbers() {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldComputeCircleArea() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(Math.PI * 100, mathUtils.computeCircleArea(10), "Should return circle area");
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void shouldThrowArithmeticException() {
        MathUtils mathUtils = new MathUtils();

        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "divide by zero should throw ex.");

    }
}