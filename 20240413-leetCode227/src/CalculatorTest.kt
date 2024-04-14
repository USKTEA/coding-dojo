import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

class CalculatorTest {
    @Test
    fun readDigits() {
        val calculator = Calculator()

        calculator.read('1')

        assertEquals(1, calculator.currentNumber)

        calculator.read('1')

        assertEquals(11, calculator.currentNumber)

        calculator.read(' ')

        assertEquals(11, calculator.currentNumber)
    }

    @Test
    fun plus() {
        val calculator = Calculator()

        calculator.read('+')

        assertEquals(0, calculator.currentNumber)

        calculator.read('1')

        assertEquals(1, calculator.currentNumber)
    }

    @Test
    fun minus() {
        val calculator = Calculator()

        calculator.read('-')

        assertEquals(0, calculator.currentNumber)

        calculator.read('1')

        assertEquals(-1, calculator.currentNumber)

        calculator.read('2')

        assertEquals(-12, calculator.currentNumber)
    }

    @Test
    fun readDigitsAndOperator1() {
        val calculator = Calculator()
        calculator.read('1')
        calculator.read('+')
        calculator.read('1')

        assertEquals(2, calculator.calculate())
    }

    @Test
    fun readDigitsAndOperator2() {
        val calculator = Calculator()
        calculator.read('2')
        calculator.read('*')
        calculator.read('2')

        assertEquals(4, calculator.calculate())
    }

    @Test
    fun readDigitsAndOperator3() {
        val calculator = Calculator()
        calculator.read('4')
        calculator.read('/')
        calculator.read('2')

        assertEquals(2, calculator.calculate())
    }

    @Test
    fun readDigitsAndOperator4() {
        val calculator = Calculator()
        calculator.read('-')
        calculator.read('4')
        calculator.read('-')
        calculator.read('2')

        assertEquals(-6, calculator.calculate())
    }
}
