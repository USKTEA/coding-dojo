import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun mergeKLists1() {
        val result = solution.mergeKLists(
            arrayListOf(
                ListNode(1).apply {
                    next = ListNode(10).apply {
                        next = ListNode(20)
                    }
                },
                ListNode(4).apply {
                    next = ListNode(11).apply {
                        next = ListNode(13)
                    }
                },
                ListNode(3).apply {
                    next = ListNode(8).apply {
                        next = ListNode(9)
                    }
                },
            )
        )

        assertEquals(
            ListNode(1).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(8).apply {
                            next = ListNode(9).apply {
                                next = ListNode(10).apply {
                                    next = ListNode(11).apply {
                                        next = ListNode(13).apply {
                                            next = ListNode(20)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }, result
        )
    }
}
