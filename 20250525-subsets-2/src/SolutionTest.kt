import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun subsetsWithDup() {
        val result = solution.subsetsWithDup(arrayListOf(1, 2, 2))

        assertEquals(
            arrayListOf(
                arrayListOf(),
                arrayListOf(1),
                arrayListOf(1, 2),
                arrayListOf(1, 2, 2),
                arrayListOf(2),
                arrayListOf(2, 2),
            ),
            result
        )
    }

    @Test
    fun subsetsWithDup_2() {
        val result = solution.subsetsWithDup(arrayListOf(5, 4))

        assertEquals(
            arrayListOf(
                arrayListOf(),
                arrayListOf(4),
                arrayListOf(4, 5),
                arrayListOf(5),
            ),
            result
        )
    }
}
