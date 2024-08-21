import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun prettyPrint() {
        val matrix = solution.prettyPrint(1)

        assertEquals(
            arrayListOf(
                arrayListOf(1)
            ),
            matrix
        )
    }
}
