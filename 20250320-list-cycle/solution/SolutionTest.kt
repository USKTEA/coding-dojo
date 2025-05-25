import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun detectCycle() {
        val node = ListNode(3)

        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = node.apply {
                    next = ListNode(4).apply {
                        next = node
                    }
                }
            }
        }

        val result = solution.detectCycle(linkedList)

        assertEquals(3, result?.`val`)
    }
}
