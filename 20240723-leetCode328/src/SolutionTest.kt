import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun oddEvenList() {
        val nodes = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }

        val result = solution.oddEvenList(nodes)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(3).apply {
                    next = ListNode(2).apply {}
                }
            }, result
        )
    }

    @Test
    fun oddEvnetList_1() {
        val nodes = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val result = solution.oddEvenList(nodes)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(3).apply {
                    next = ListNode(5).apply {
                        next = ListNode(2).apply {
                            next = ListNode(4)
                        }
                    }
                }
            }, result
        )
    }
}
