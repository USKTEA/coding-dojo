import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solve() {
        val linkedList = ListNode(1).apply {
            next = ListNode(0).apply {
                next = ListNode(0).apply {
                    next = ListNode(1)
                }
            }
        }

        val result = solution.solve(linkedList)

        assertEquals(
            ListNode(0).apply {
                next = ListNode(0).apply {
                    next = ListNode(1).apply {
                        next = ListNode(1).apply {}
                    }
                }
            },
            result
        )
    }

    @Test
    fun solve_2() {
        val linkedList = ListNode(0).apply {
            next = ListNode(0).apply {
                next = ListNode(1).apply {
                    next = ListNode(1).apply {
                        next = ListNode(0)
                    }
                }
            }
        }

        val result = solution.solve(linkedList)

        assertEquals(
            ListNode(0).apply {
                next = ListNode(0).apply {
                    next = ListNode(0).apply {
                        next = ListNode(1).apply {
                            next = ListNode(1)
                        }
                    }
                }
            },
            result
        )
    }

    @Test
    fun solve_3() {
        val linkedList = ListNode(0).apply {
            next = ListNode(1)
        }

        val result = solution.solve(linkedList)

        assertEquals(
            ListNode(0).apply {
                next = ListNode(1)
            },
            result
        )
    }
}
