import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun swapPairs() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            }
        }

        val result = solution.swapPairs(linkedList)

        assertEquals(
            ListNode(2).apply {
                next = ListNode(1).apply {
                    next = ListNode(4).apply {
                        next = ListNode(3)
                    }
                }
            }, result)
    }
}
