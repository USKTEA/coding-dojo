import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun test_case_1() {
        val matrix = arrayListOf(
            arrayListOf(1, 0, 1),
            arrayListOf(1, 1, 1),
            arrayListOf(1, 1, 1)
        )
        solution.setZeroes(matrix)

        assertEquals(
            arrayListOf(
                arrayListOf(0, 0, 0),
                arrayListOf(1, 0, 1),
                arrayListOf(1, 0, 1)
            ), matrix
        )
    }

    @Test
    fun test_case_2() {
        val matrix = arrayListOf(
            arrayListOf(1, 0, 1),
            arrayListOf(1, 1, 1),
            arrayListOf(1, 0, 1)
        )
        solution.setZeroes(matrix)

        assertEquals(
            arrayListOf(
                arrayListOf(0, 0, 0),
                arrayListOf(1, 0, 1),
                arrayListOf(0, 0, 0)
            ),
            matrix
        )
    }

    @Test
    fun get_zero_indices() {
        val matrix = arrayListOf(
            arrayListOf(1, 0, 1),
            arrayListOf(1, 1, 1),
            arrayListOf(1, 1, 1)
        )

        val zeroIndices = solution.getZeroIndices(matrix)

        assertEquals(
            mutableListOf(
                mutableSetOf(0),
                mutableSetOf(1),
            ),
            zeroIndices
        )
    }
}
