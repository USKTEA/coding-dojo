import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun power() {
        val result = solution.power("128")

        assertEquals(1, result)
    }

    @Test
    fun power_2() {
        val result = solution.power("96")

        assertEquals(0, result)
    }

    @Test
    fun power_3() {
        val result = solution.power("20")

        assertEquals(0, result)
    }

    @Test
    fun power_4() {
        val result = solution.power("147573952589676412928")

        assertEquals(1, result)
    }

    @Test
    fun power_5() {
        val result = solution.power("20077000522611464285")

        assertEquals(0, result)
    }
}
