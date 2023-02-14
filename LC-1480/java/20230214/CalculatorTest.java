import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CalculatorTest {

    @Test
    void getAnswer() {
        Calculator calculator = new Calculator();
        int[] answer = calculator.getAnswer(new int[]{1, 2, 3, 4});

        assertArrayEquals(new int[]{1, 3, 6, 10}, answer);
    }
}
