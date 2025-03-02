import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun reverseList() {
        val linkedList = ListNode(
            `val` = 1,
            next = ListNode(
                `val` = 2,
                next = ListNode(
                    `val` = 3,
                    next = ListNode(
                        `val` = 4,
                        next = ListNode(
                            5
                        )
                    )
                )
            )
        )

        val result = solution.reverseList(linkedList)

        assertEquals(
            ListNode(5).apply {
                next = ListNode(4).apply {
                    next = ListNode(3).apply {
                        next = ListNode(2).apply {
                            next = ListNode(1)
                        }
                    }
                }
            }, result)
    }

    @Test
    fun simpleReverseList() {
        val linkedList = ListNode(1).apply { next = ListNode(2) }

        val result = solution.reverseList(linkedList)

        assertEquals(ListNode(2).apply { next = ListNode(1) }, result)
    }
}
