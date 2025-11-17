import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun mergeKLists() {
        val result = solution.mergeKLists(
            arrayListOf(
                Solution.ListNode(1).apply {
                    next = Solution.ListNode(10).apply {
                        next = Solution.ListNode(20)
                    }
                },
                Solution.ListNode(4).apply {
                    next = Solution.ListNode(11).apply {
                        next = Solution.ListNode(13)
                    }
                },
                Solution.ListNode(3).apply {
                    next = Solution.ListNode(8).apply {
                        next = Solution.ListNode(9)
                    }
                },
            )
        )


        assertEquals(
            Solution.ListNode(1).apply {
                next = Solution.ListNode(3).apply {
                    next = Solution.ListNode(4).apply {
                        next = Solution.ListNode(8).apply {
                            next = Solution.ListNode(9).apply {
                                next = Solution.ListNode(10).apply {
                                    next = Solution.ListNode(11).apply {
                                        next = Solution.ListNode(13).apply {
                                            next = Solution.ListNode(20)
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
