import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun convertToTitle() {
        val result = solution.convertToTitle(1)

        assertEquals("A", result)
    }

    @Test
    fun convertToTitle_2() {
        val result = solution.convertToTitle(26)

        assertEquals("Z", result)
    }

    @Test
    fun convertToTitle_3() {
        val result = solution.convertToTitle(27)

        assertEquals("AA", result)
    }

    @Test
    fun convertToTitle_4() {
        val result = solution.convertToTitle(943566)

        assertEquals("BAQTZ", result)
    }


    @Test
    fun convertToTitle_5() {
        val result = solution.convertToTitle(26 * 26)

        assertEquals("XZ", result)
    }
}
