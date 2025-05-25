import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun subsetsTest() {
        val result = solution.subsets(arrayListOf(1, 2, 3))

        assertEquals(
            arrayListOf(
                arrayListOf(),
                arrayListOf(1),
                arrayListOf(1, 2),
                arrayListOf(1, 2, 3),
                arrayListOf(1, 3),
                arrayListOf(2),
                arrayListOf(2, 3),
                arrayListOf(3),
            ), result
        )
    }
}
