import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun diffPossible() {
        val result = solution.diffPossible(arrayListOf(1, 3, 5), 4)

        assertEquals(1, result)
    }

    @Test
    fun diffPossible_2() {
        val result = solution.diffPossible(arrayListOf(-100, 1, 3, 5, 7, 19, 22, 1000), 1100)

        assertEquals(1, result)
    }

    @Test
    fun diffPossible_3() {
        val result = solution.diffPossible(arrayListOf(0, 1, 9, 10, 13, 17, 17, 17, 23, 25, 29, 30, 37, 38, 39, 39, 40, 41, 42, 60, 64, 70, 70, 70, 72, 75, 85, 85, 90, 91, 91, 93, 95), 83)

        assertEquals(1, result)
    }
}
