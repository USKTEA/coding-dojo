import java.util.LinkedList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun deleteDuplicates() {
        val linkedList = ListNode(1).apply { next = ListNode(1).apply { next = ListNode(2) } }
        val result = solution.deleteDuplicates(linkedList)

        assertEquals(ListNode(1).apply { next = ListNode(2) }, result)
    }

    @Test
    fun deleteDuplicates_2() {
        val linkedList = ListNode(1).apply {
            next = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(3)
                    }
                }
            }
        }

        val result = solution.deleteDuplicates(linkedList)

        assertEquals(ListNode(1).apply { next = ListNode(2).apply { next = ListNode(3) }}, result)
    }

    @Test
    fun deleteDuplicates_3() {
        val linkedList = ListNode(1)

        val result = solution.deleteDuplicates(linkedList)

        assertEquals(ListNode(1), result)
    }
}
