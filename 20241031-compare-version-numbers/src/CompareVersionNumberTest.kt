import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CompareVersionNumberTest {
    private val solution = CompareVersionNumber()

    @Test
    fun compareVersion() {
        val result = solution.compareVersion("1.13", "1.13.4")

        assertEquals(-1, result)
    }

    @Test
    fun compareVersion_1() {
        val result = solution.compareVersion("1.136", "1.13.4")

        assertEquals(1, result)
    }

    @Test
    fun compareVersion_2() {
        val result = solution.compareVersion("0.136", "1.13.4")

        assertEquals(-1, result)
    }

    @Test
    fun compareVersion_3() {
        val result = solution.compareVersion("1.10", "1.9")

        assertEquals(1, result)
    }
}
