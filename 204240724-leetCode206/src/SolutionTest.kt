import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reverseList() {
        val result = solution.reverseList(
            head = ListNode(1).also { it.next = ListNode(2) }
        )

        assertEquals(
            ListNode(2).also { it.next = ListNode(1) },
            result
        )
    }

    @Test
    fun reverseList_2() {
        val result = solution.reverseList(
            head = ListNode(1).also { it.next = ListNode(2).also { it.next = ListNode(3) } }
        )

        assertEquals(
            ListNode(3).also { it.next = ListNode(2).also { it.next = ListNode(1) } },
            result
        )
    }
}
