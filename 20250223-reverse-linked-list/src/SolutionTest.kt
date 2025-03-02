import java.util.LinkedList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reverseList() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2)
        }

        val result = solution.reverseList(linkedList)

        assertEquals(
            ListNode(2).apply {
                next = ListNode(1)
            }, result)
    }
}
