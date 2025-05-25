import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun deleteDuplicates() {
        val linkedList = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(3).apply {
                    next = ListNode(3).apply {
                        next = ListNode(4).apply {
                            next = ListNode(4).apply {
                                next = ListNode(5)
                            }
                        }
                    }
                }
            }
        }

        val result = solution.deleteDuplicates(linkedList)

        assertEquals(ListNode(1).apply { next = ListNode(2).apply { next = ListNode(5) } }, result)
    }

    @Test
    fun deleteDuplicate_2() {
        val linkedList = ListNode(1)

        val result = solution.deleteDuplicates(linkedList)

        assertEquals(ListNode(1), result)
    }

    @Test
    fun deleteDuplicate_3() {
        val linkedList = ListNode(1).apply { next = ListNode(2) }

        val result = solution.deleteDuplicates(linkedList)

        assertEquals(ListNode(1).apply { next = ListNode(2) }, result)
    }


    @Test
    fun deleteDuplicate_4() {
        val linkedList = ListNode(1).apply { next = ListNode(1) }

        val result = solution.deleteDuplicates(linkedList)

        assertEquals(null, result)
    }
}
