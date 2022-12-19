import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryCalculatorTest {

    @Test
    void calculate() {
        BinaryCalculator binaryCalculator = new BinaryCalculator();
        int[] calculated1 = binaryCalculator.calculate("01110");

        assertArrayEquals(new int[] {3,3}, calculated1);

        binaryCalculator = new BinaryCalculator();

        int[] calculated2 = binaryCalculator.calculate("1111111");

        assertArrayEquals(new int[] {4, 1}, calculated2);
    }

    @Test
    void pickZeros() {
        BinaryCalculator binaryCalculator = new BinaryCalculator();
        String[] pickedResult = binaryCalculator.pickZeros("01110");

        assertArrayEquals(new String[]{"2", "111"}, pickedResult);
    }

    @Test
    void toBinary() {
        BinaryCalculator binaryCalculator = new BinaryCalculator();
        String binary1 = binaryCalculator.toBinary("111");

        assertEquals("11", binary1);

        String binary2 = binaryCalculator.toBinary("11");

        assertEquals("10", binary2);

        String binary = binaryCalculator.toBinary("1111111");

        assertEquals("111", binary);
    }
}
