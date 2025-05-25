import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reverseList() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }

        val result = solution.reverseList(linkedList, 3)

        assertEquals(ListNode(3).apply {
            next = ListNode(2).apply {
                next = ListNode(1)
            }
        }, result)
    }

    @Test
    fun reverseList_2() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4)
                }
            }
        }

        val result = solution.reverseList(linkedList, 2)

        assertEquals(ListNode(2).apply {
            next = ListNode(1).apply {
                next = ListNode(4).apply {
                    next = ListNode(3)
                }
            }
        }, result)
    }

    @Test
    fun reverseList_5() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5).apply {
                            next = ListNode(6)
                        }
                    }
                }
            }
        }

        val result = solution.reverseList(linkedList, 3)

        assertEquals(ListNode(3).apply {
            next = ListNode(2).apply {
                next = ListNode(1).apply {
                    next = ListNode(6).apply {
                        next = ListNode(5).apply {
                            next = ListNode(4)
                        }
                    }
                }
            }
        }, result)
    }
}
