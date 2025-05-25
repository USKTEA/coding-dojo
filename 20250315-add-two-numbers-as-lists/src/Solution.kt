class Solution {
    //[2, 4, 3], [5, 6, 4] => [7, 0 ,8]
    //[1], [2] => result: [3], heaving
    fun addTwoNumbers(number: ListNode, otherNumber: ListNode): ListNode {
        val head = ListNode(0)
        head.next = ListNode(0)

        add(current = head.next!!, number = number, otherNumber = otherNumber)

        removeTrailingZeros(head.next!!)

        return head.next!!
    }

    fun removeTrailingZeros(head: ListNode) {
        var zero: ListNode? = null
        var current: ListNode? = head

        while (current != null) {
            if (current.next?.`val` == 0 && zero == null) {
                zero = current
            }

            if (current.next?.`val` != 0 && current.next != null) {
                zero = null
            }

            current = current.next
        }

        zero?.next = null
    }

    fun add(current: ListNode, number: ListNode?, otherNumber: ListNode?) {
        val sum = (number?.`val` ?: 0) + (otherNumber?.`val` ?: 0) + current.`val`
        val remainder = sum % 10
        val heaving = sum / 10 > 0
        current.`val` = remainder

        if (number != null && otherNumber != null) {
            if (heaving) {
                current.next = ListNode(1)

                return add(current.next!!, number.next, otherNumber.next)
            }

            current.next = ListNode(0)

            return add(current.next!!, number.next, otherNumber.next)
        }

        if (number != null) {
            if (heaving) {
                current.next = ListNode(1)

                return add(current.next!!, number.next, null)
            }

            current.next = number.next

            return
        }

        if (otherNumber != null) {
            if (heaving) {
                current.next = ListNode(1)

                return add(current.next!!, null, otherNumber.next)
            }

            current.next = otherNumber.next

            return
        }
    }
}

data class ListNode(var `val`: Int, var next: ListNode? = null)
