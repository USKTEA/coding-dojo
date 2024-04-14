import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `Node(0) + Node(0)`() {
        val l1 = ListNode(0)
        val l2 = ListNode(0)

        val result = solution.addTwoNumbers(l1, l2)

        assertEquals(ListNode(0), result)
    }

    @Test
    fun `Node(1) + Node(0)`() {
        val l1 = ListNode(1)
        val l2 = ListNode(0)

        val result = solution.addTwoNumbers(l1, l2)

        assertEquals(ListNode(1), result)
    }

    @Test
    fun `Node(1) + Node(1)`() {
        val l1 = ListNode(1)
        val l2 = ListNode(1)

        val result = solution.addTwoNumbers(l1, l2)

        assertEquals(ListNode(2), result)
    }

    @Test
    fun complexTestCase1() {
        val l1 = ListNode(1).apply {
            this.next = ListNode(1)
        }

        val l2 = ListNode(1).apply {
            this.next = ListNode(1)
        }

        val expect = ListNode(2).apply {
            this.next = ListNode(2)
        }

        val result = solution.addTwoNumbers(l1, l2)

        assertEquals(expect, result)
    }

    @Test
    fun complexTestCase2() {
        val l1 = ListNode(9).apply {
            this.next = ListNode(1)
        }

        val l2 = ListNode(1).apply {
            this.next = ListNode(1)
        }

        val expect = ListNode(0).apply {
            this.next = ListNode(3)
        }

        val result = solution.addTwoNumbers(l1, l2)

        assertEquals(expect, result)
    }

    @Test
    fun complextTestCase3() {
        val l1 = ListNode(0).apply {
            this.next = ListNode(1)
        }

        val l2 = ListNode(0).apply {
            this.next = ListNode(9)
        }

        val expect = ListNode(0).apply {
            this.next = ListNode(0).apply {
                this.next = ListNode(1)
            }
        }

        val result = solution.addTwoNumbers(l1, l2)

        assertEquals(expect, result)
    }

    @Test
    fun complexTextCase4() {
        val l1 = ListNode(0)

        val l2 = ListNode(0).apply {
            this.next = ListNode(9)
        }

        val expect = ListNode(0).apply {
            this.next = ListNode(9)
        }

        val result = solution.addTwoNumbers(l1, l2)

        assertEquals(expect, result)
    }

    @Test
    fun complexTestCase5() {
        val l1 = ListNode(0).apply {
            this.next = ListNode(1)
        }

        val l2 = ListNode(2)

        val expect = ListNode(2).apply {
            this.next = ListNode(1)
        }

        val result = solution.addTwoNumbers(l1, l2)

        assertEquals(expect, result)
    }
}
