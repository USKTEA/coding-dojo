import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val result = solution.solve(
            ListNode(1).apply {
                next = ListNode(0).apply {
                    next = ListNode(0).apply {
                        next = ListNode(1)
                    }
                }
            }
        )

        assertEquals(
            ListNode(0).apply {
                next = ListNode(0).apply {
                    next = ListNode(1).apply {
                        next = ListNode(1).apply {}
                    }
                }
            }, result)
    }

    @Test
    fun solve_2() {
        val result = solution.solve(
            ListNode(0).apply {
                next = ListNode(0).apply {
                    next = ListNode(1).apply {
                        next = ListNode(1).apply {
                            next = ListNode(0)
                        }
                    }
                }
            }
        )

        assertEquals(
            ListNode(0).apply {
                next = ListNode(0).apply {
                    next = ListNode(0).apply {
                        next = ListNode(1).apply {
                            next = ListNode(1)
                        }
                    }
                }
            }, result)
    }
}
