import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SequentialDigitTest {
    @Test
    fun ofSize() {
        val sequentialDigit = SequentialDigit.ofSize(2)

        assertEquals(
            SequentialDigit(
                digits = mutableListOf(1, 2)
            ), sequentialDigit
        )
    }

    @Test
    fun next() {
        var sequentialDigit = SequentialDigit.ofSize(2)

        assertEquals(
            SequentialDigit(
                digits = mutableListOf(1, 2)
            ), sequentialDigit
        )

        assertEquals(
            SequentialDigit(
                digits = mutableListOf(2, 3)
            ), sequentialDigit.next()
        )

        assertEquals(
            SequentialDigit(
                digits = mutableListOf(3, 4)
            ), sequentialDigit.next().next()
        )

        assertEquals(
            SequentialDigit(
                digits = mutableListOf(1, 2, 3)
            ), sequentialDigit.next().next().next().next().next().next().next().next()
        )
    }
}
