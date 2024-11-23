import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class IndianNumberTest {
    @Test
    fun sound() {
        val sounds = IndianNumber(count = 10, unit = IndianUnit.CRORE).sound()

        assertEquals("ten-crore", sounds)
    }
}
