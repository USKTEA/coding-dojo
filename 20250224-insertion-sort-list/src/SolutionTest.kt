import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun insertionSortList() {
        val linkedList = ListNode(1).apply {
            next = ListNode(3).apply {
                next = ListNode(2)
            }
        }

        val result = solution.insertionSortList(linkedList)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3)
                }
            }, result)
    }
}
