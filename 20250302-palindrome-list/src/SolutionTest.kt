import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val linkedList = ListNode(1).apply { next = ListNode(2).apply { next = ListNode(2).apply { next = ListNode(1) } }}

        val result = solution.solve(linkedList)

        assertEquals(1, result)
    }

    @Test
    fun solve_2() {
        val linkedList = ListNode(1).apply { next = ListNode(3).apply { next = ListNode(2)}}

        val result = solution.solve(linkedList)

        assertEquals(0, result)
    }

    @Test
    fun reverse() {
        val linkedList = ListNode(1).apply { next = ListNode(2) }

        val (origin, reversed) = solution.reverse(linkedList)

        assertEquals(ListNode(2).apply { next = ListNode(1) }, reversed)
        assertEquals(ListNode(1).apply { next = ListNode(2) }, origin)
    }
}
