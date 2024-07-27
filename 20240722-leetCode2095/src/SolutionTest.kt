import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun deleteMiddle() {
        val nodes = ListNode(1).apply {
            next = ListNode(3).apply {
                next = ListNode(4).apply {
                    next = ListNode(7).apply {
                        next = ListNode(1).apply {
                            next = ListNode(2).apply {
                                next = ListNode(6)
                            }
                        }
                    }
                }
            }
        }

        val result = solution.deleteMiddle(nodes)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(1).apply {
                            next = ListNode(2).apply {
                                next = ListNode(6)
                            }
                        }
                    }
                }
            }, result
        )
    }

    @Test
    fun getNodes() {
        val node2 = ListNode(3)
        val node1 = ListNode(1).apply {
            next = node2
        }

        val result = solution.getNodes(node1)

        assertEquals(
            listOf(node1, node2), result
        )
    }

    @Test
    fun getNodes_2() {
        val node3 = ListNode(4)
        val node2 = ListNode(3).apply {
            next = node3
        }
        val node1 = ListNode(1).apply {
            next = node2
        }

        val result = solution.getNodes(node1)

        assertEquals(
            listOf(node1, node2, node3), result
        )
    }

    @Test
    fun getMiddle() {
        val middle = solution.getMiddle(4)

        assertEquals(2, middle)
    }

    @Test
    fun getMiddle_2() {
        val middle = solution.getMiddle(5)

        assertEquals(2, middle)
    }

    @Test
    fun getMiddle_3() {
        val middle = solution.getMiddle(1)

        assertEquals(0, middle)
    }
}
