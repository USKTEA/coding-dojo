import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reverseList() {
        val list = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }

        val reversed = solution.reverseList(list)

        assertEquals(
            ListNode(3).apply {
                next = ListNode(2).apply {
                    next = ListNode(1)
                }
            }, reversed)
    }


    @Test
    fun simple_reverseList() {
        val list = ListNode(1).apply {
            next = ListNode(2)
        }

        val reversed = solution.reverseList(list)

        assertEquals(
            ListNode(2).apply {
                next = ListNode(1)
            }, reversed)
    }
}
