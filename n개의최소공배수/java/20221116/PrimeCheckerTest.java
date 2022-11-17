import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    @Test
    void isPrime() {
        PrimeChecker primeChecker = new PrimeChecker();
        boolean answer1 = primeChecker.isPrime(2);

        assertTrue(answer1);

        boolean answer2 = primeChecker.isPrime(4);

        assertFalse(answer2);

        boolean answer3 = primeChecker.isPrime(17);

        assertTrue(answer3);
    }
}
