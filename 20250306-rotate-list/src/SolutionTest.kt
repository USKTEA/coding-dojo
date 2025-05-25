import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun rotateRight() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val result = solution.rotateRight(linkedList, 2)

        assertEquals(
            ListNode(4).apply {
                next = ListNode(5).apply {
                    next = ListNode(1).apply {
                        next = ListNode(2).apply {
                            next = ListNode(3)
                        }
                    }
                }
            }, result)
    }

    @Test
    fun rotateRight_1() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(4).apply {
                        next = ListNode(5)
                    }
                }
            }
        }

        val result = solution.rotateRight(linkedList, 1)

        assertEquals(
                 ListNode(5).apply {
                    next = ListNode(1).apply {
                        next = ListNode(2).apply {
                            next = ListNode(3).apply {
                                next = ListNode(4)
                            }
                        }
                    }
            }, result)
    }

    @Test
    fun calculateTailIndex() {
        val move = solution.calculateTailIndex(2, 5)

        assertEquals(3, move)
    }
}
