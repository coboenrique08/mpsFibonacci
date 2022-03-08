import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests
 *
 * Fibonacci of 0 -> 0
 * Fibonacci of 1 -> 1
 * Fibonacci of 2 -> 1
 * Fibonacci of 3 -> 2
 * Fibonacci of 4 -> 3
 * Fibonacci of 5 -> 5
 * Fibonacci of negative number -> Throw an exception
 *
 */

class FibonacciTest {

    Fibonacci fibonacci;

    @BeforeEach
    public void startup() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void shouldComputeOf0Return0() {
        int expectedValue = 0;
        int obtainedValue = fibonacci.compute(0);
        assertEquals(expectedValue, obtainedValue);
    }
}