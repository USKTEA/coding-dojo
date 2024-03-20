import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun whenListNodeIsEmpty() {
        assertEquals(null, solution.deleteDuplicates(null))
    }

    @Test
    fun whenListNodeSizeIsOne() {
        assertEquals(ListNode(1), solution.deleteDuplicates(ListNode(1)))
    }

    @Test
    fun whenListNodeSizeIsTwo() {
        val input = ListNode(1).also {
            it.next = ListNode(2)
        }

        val assertResult = ListNode(1).also {
            it.next = ListNode(2)
        }

        assertEquals(assertResult, solution.deleteDuplicates(input))
    }

    @Test
    fun whenHaveDuplicates() {
        val input = ListNode(1).also {
            it.next = ListNode(1)
        }

        assertEquals(ListNode(1), solution.deleteDuplicates(input))
    }

    @Test
    fun whenHaveTwoDuplicates() {
        val input = ListNode(1).also {
            it.next = ListNode(1)
            it.next?.next = ListNode(2)
            it.next?.next?.next = ListNode(3)
            it.next?.next?.next?.next = ListNode(3)
        }

        val result = ListNode(1).also {
            it.next = ListNode(2)
            it.next?.next = ListNode(3)
        }

        assertEquals(result, solution.deleteDuplicates(input))
    }
}
