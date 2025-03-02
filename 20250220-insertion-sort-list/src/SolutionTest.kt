import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun insertionSortedList() {
        val result = solution.insertionSortList(
            ListNode(1).apply {
                next = ListNode(3).apply {
                    next = ListNode(1)
                }
            }
        )

        assertEquals(
            ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3)
                }
            }
            , result)
    }
}
