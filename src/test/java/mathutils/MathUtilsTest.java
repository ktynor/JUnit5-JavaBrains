package mathutils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTest {
    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @Test
    void shouldAddTwoNumbers() {
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldComputeCircleArea() {
        assertEquals(Math.PI * 100, mathUtils.computeCircleArea(10), "Should return circle area");
    }

    @Test
    @Disabled
    void subtract() {
    }

    @Test
    @Disabled
    void multiply() {
    }

    @Test
    @Disabled
    void divide() {
    }

    @Test
    void shouldThrowArithmeticException() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "divide by zero should throw ex.");

    }
}