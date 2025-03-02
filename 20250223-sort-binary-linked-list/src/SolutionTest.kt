import kotlin.time.measureTime
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

        assertEquals(ListNode(0).apply {
            next = ListNode(0).apply {
                next = ListNode(1).apply {
                    next = ListNode(1).apply {}
                }
            }
        }, result)
    }

    @Test
    fun when_all_node_is_0() {
        val result = solution.solve(
            ListNode(0).apply {
                next = ListNode(0).apply {
                    next = ListNode(0).apply {
                        next = ListNode(0)
                    }
                }
            }
        )

        assertEquals(
            ListNode(0).apply {
                next = ListNode(0).apply {
                    next = ListNode(0).apply {
                        next = ListNode(0)
                    }
                }
            }, result
        )
    }

    @Test
    fun simple_case() {
        val result = solution.solve(
            ListNode(0).apply {
                next = ListNode(1)
            }
        )

        assertEquals(
            ListNode(0).apply {
                next = ListNode(1)
            }, result
        )
    }

    @Test
    fun simple_case_2() {
        val result = solution.solve(
            ListNode(0).apply {
                next = ListNode(1).apply {
                    next = ListNode(1)
                }
            }
        )

        assertEquals(
            ListNode(0).apply {
                next = ListNode(1).apply {
                     next = ListNode(1)
                }
            }, result
        )
    }
    @Test
    fun exchange_simple() {
        val result = solution.solve(
            ListNode(1).apply {
                next = ListNode(0)
            }
        )


        assertEquals(
            ListNode(0).apply {
                next = ListNode(1)
            }, result
        )
    }

}
