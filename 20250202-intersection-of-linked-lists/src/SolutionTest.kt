import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun getIntersectionNode() {
        val result = solution.getIntersectionNode(
            ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3)
                }
            },
            ListNode(4).apply {
                next = ListNode(5)
            }
        )

        assertEquals(null, result)
    }
}
