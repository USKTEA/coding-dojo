import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reverseList() {
        val listNode = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }

        val result = solution.reverseList(listNode)

        assertEquals(
            ListNode(3).apply {
                next = ListNode(2).apply {
                    next = ListNode(1)
                }
            }, result
        )
    }
}
