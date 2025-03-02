import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun mergeTwoLists() {
        val list = ListNode(5).apply {
            next = ListNode(8).apply {
                next = ListNode(20)
            }
        }

        val otherList = ListNode(4).apply {
            next = ListNode(11).apply {
                next = ListNode(15)
            }
        }

        val result = solution.mergeTwoLists(list, otherList)

        assertEquals(
            ListNode(4).apply {
                next = ListNode(5).apply {
                    next = ListNode(8).apply {
                        next = ListNode(11).apply {
                            next = ListNode(15).apply {
                                next = ListNode(20)
                            }
                        }
                    }
                }
            }, result)
    }

    @Test
    fun mergeTwoLists_simple() {
        val list = ListNode(5)
        val otherList = ListNode(1).apply { next = ListNode(15) }

        val result = solution.mergeTwoLists(list, otherList)

        assertEquals(ListNode(1).apply { next = ListNode(5).apply { next = ListNode(15) } }, result)
    }

    @Test
    fun mergeTwoLists_simple_2() {
        val list = ListNode(5)
        val otherList = ListNode(4)

        val result = solution.mergeTwoLists(list, otherList)

        assertEquals(ListNode(4).apply { next = ListNode(5) }, result)
    }

    @Test
    fun mergeTwoLists_simple_3() {
        val list = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3)
            }
        }

        val otherList = ListNode(4).apply {
            next = ListNode(5).apply {
                next = ListNode(6)
            }
        }

        val result = solution.mergeTwoLists(list, otherList)

        assertEquals(
            ListNode(1).apply {
                next = ListNode(2).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(5).apply {
                                next = ListNode(6)
                            }
                        }
                    }
                }
            }, result)
    }
}
