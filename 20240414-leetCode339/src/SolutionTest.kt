import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testDepth1() {
        val numbers = listOf(
            NestedInteger(1)
        )

        assertEquals(1, solution.depthSum(numbers))
    }

    @Test
    fun testDepth2() {
        val numbers = listOf(
            NestedInteger(
                nestedIntegers = mutableListOf(NestedInteger(1), NestedInteger(1))
            )
        )

        assertEquals(4, solution.depthSum(numbers))
    }
}
