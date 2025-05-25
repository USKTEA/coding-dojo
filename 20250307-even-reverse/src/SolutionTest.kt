import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            }
        }

        val result = solution.solve(linkedList)

        assertEquals(ListNode(1).apply {
            next = ListNode(4).apply {
                next = ListNode(3).apply {
                    next = ListNode(2)
                }
            }
        }, result)
    }
}
