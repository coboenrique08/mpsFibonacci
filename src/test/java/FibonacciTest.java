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

    @Test
    public void shouldComputeOf1Return1() {
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(1);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeOf2Return1() {
        int expectedValue = 1;
        int obtainedValue = fibonacci.compute(2);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeOf3Return2() {
        int expectedValue = 2;
        int obtainedValue = fibonacci.compute(3);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeOf4Return3() {
        int expectedValue = 3;
        int obtainedValue = fibonacci.compute(4);
        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeOf5Return5() {
        int expectedValue = 5;
        int obtainedValue = fibonacci.compute(5);
        assertEquals(expectedValue, obtainedValue);
    }
    
    @Test
    public void shouldComputeOfNegativeNumberThrowAnException() {
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1));
    }
}