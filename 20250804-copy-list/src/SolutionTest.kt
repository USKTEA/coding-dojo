import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun copyRandomList() {
        val node1 = Solution.RandomListNode(label = 1)
        val node2 = Solution.RandomListNode(label = 2)
        val node3 = Solution.RandomListNode(label = 3)

        node1.apply {
            next = node2
            random = node3
        }

        node2.apply {
            next = node3
            random = node1
        }

        node3.apply {
            random = node1
        }

        val result = solution.copyRandomList(node1)

        assertEquals(result, node1)
        assertFalse(result === node1)
    }
}
