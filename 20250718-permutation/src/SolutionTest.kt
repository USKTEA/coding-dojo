import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun permute() {
        val result = solution.permute(arrayListOf( 1, 2, 3, 4, 5, 6, 7, 8, 9))

        assertEquals(
            arrayListOf(
                arrayListOf(1, 2, 3),
                arrayListOf(1, 3, 2),
                arrayListOf(2, 1, 3),
                arrayListOf(2, 3, 1),
                arrayListOf(3, 1, 2),
                arrayListOf(3, 2, 1),
            ), result
        )
    }
}
