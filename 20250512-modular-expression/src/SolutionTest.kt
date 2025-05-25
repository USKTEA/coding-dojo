import java.lang.Math.pow
import kotlin.math.pow
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun mod() {
        val result = solution.mod(2132, 0, 12)

        assertEquals(1, result)
    }

    @Test
    fun mod_2() {
        val result = solution.mod(-1, 1, 20)

        assertEquals(19, result)
    }
}
