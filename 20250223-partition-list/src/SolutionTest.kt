import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun partition() {
        val result = solution.partition(
            linkedList = ListNode(1).apply {
                next = ListNode(4).apply {
                    next = ListNode(3).apply {
                        next = ListNode(2).apply {
                            next = ListNode(5).apply {
                                next = ListNode(2)
                            }
                        }
                    }
                }
            }, number = 3
        )

        assertEquals(
            ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(2).apply {
                        next = ListNode(4).apply {
                            next = ListNode(3).apply {
                                next = ListNode(5)
                            }
                        }
                    }
                }
            }
            ,result
        )
    }

    @Test
    fun partition_2() {
        val result = solution.partition(
            linkedList = ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(1).apply {
                            next = ListNode(3)
                        }
                    }
                }
            }, number = 2
        )

        assertEquals(
            ListNode(1).apply {
                next = ListNode(1).apply {
                    next = ListNode(2).apply {
                        next = ListNode(3).apply {
                            next = ListNode(3)
                        }
                    }
                }
            }
            ,result
        )
    }
}
