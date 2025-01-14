import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun getIntersectionNode() {
        val list = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {}
            }
        }

        val otherList = ListNode(2).apply {
            next = ListNode(3)
        }

        val result = solution.getIntersectionNode(list, otherList)

        assertEquals(
            ListNode(2).apply {
                next = ListNode(3)
            }, result
        )
    }
}
