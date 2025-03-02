import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun insertionSortList() {
        val result = solution.insertionSortList(
            ListNode(1).apply {
                next = ListNode(3).apply {
                    next = ListNode(2)
                }
            }
        )

        assertEquals(
            ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3)
                }
            }, result
        )
    }

    @Test
    fun insertionSortList2() {
        val result = solution.insertionSortList(
            ListNode(3).apply {
                next = ListNode(1)
            }
        )

        assertEquals(
            ListNode(1).apply {
                next = ListNode(3)
            }, result
        )
    }

    @Test
    fun insertionSortList3() {
        val result = solution.insertionSortList(
            ListNode(6).apply {
                next = ListNode(5).apply {
                    next = ListNode(3).apply {
                        next = ListNode(1).apply {
                            next = ListNode(8)
                        }
                    }
                }
            }
        )

        assertEquals(
            ListNode(1).apply {
                next = ListNode(3).apply {
                    next = ListNode(5).apply {
                        next = ListNode(6).apply {
                            next = ListNode(8)
                        }
                    }
                }
            }, result
        )
    }

    @Test
    fun insertionSortList4() {
        val result = solution.insertionSortList(
            ListNode(2).apply {
                next = ListNode(1).apply {
                    next = ListNode(1).apply {
                        next = ListNode(4)
                    }
                }
            }
        )

        assertEquals(
            ListNode(1).apply {
                next = ListNode(1).apply {
                    next = ListNode(2).apply {
                        next = ListNode(4)
                    }
                }
            }
            , result)
    }
}
