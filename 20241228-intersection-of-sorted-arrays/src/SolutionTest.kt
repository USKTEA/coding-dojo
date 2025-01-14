import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun intersect() {
        val result = solution.intersect(
            listOf(1, 2, 3, 3, 4, 5, 6),
            listOf(3, 3, 5)
        )

        assertEquals(arrayListOf(3, 3, 5), result)
    }
}
