import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun getIntersectionNode() {
        val list = ListNode(1).apply {
            next = ListNode(2)
        }

        val otherList = ListNode(2)

        val result = solution.getIntersectionNode(list, otherList)

        assertEquals(ListNode(2), result)
    }
}
