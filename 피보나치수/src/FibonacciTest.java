import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void getFibonacci() {
        Fibonacci fibonacci = new Fibonacci(2);

        assertEquals(1, fibonacci.number());
    }

    @Test
    void divide() {
        Fibonacci fibonacci = new Fibonacci(4);

        int result = fibonacci.divideBy(3);

        assertEquals(0, result);
    }
}
