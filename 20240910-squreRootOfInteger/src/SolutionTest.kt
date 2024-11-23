import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun sqrt() {
        val result = solution.sqrt(9)

        assertEquals(3, result)
    }

    @Test
    fun sqrt_2() {
        val result = solution.sqrt(11)

        assertEquals(3, result)
    }

    @Test
    fun sqrt_3() {
        val result = solution.sqrt(25)

        assertEquals(5, result)
    }

    @Test
    fun sqrt_4() {
        val result = solution.sqrt(12)

        assertEquals(3, result)
    }

    @Test
    fun sqrt_5() {
        val result = solution.sqrt(13)

        assertEquals(3, result)
    }

    @Test
    fun sqrt_6() {
        val result = solution.sqrt(35)

        assertEquals(5, result)
    }

    @Test
    fun sqrt_7() {
        val result = solution.sqrt(81)

        assertEquals(9, result)
    }
}
