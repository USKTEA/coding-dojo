class Solution {
    fun insertionSortList(linkedList: ListNode): ListNode {
        val head = ListNode(0)
        var previous: ListNode?  = head

        var current: ListNode? = linkedList

        while (current != null) {
            val next = current.next

            while (previous?.next != null && previous.next!!.`val` < current.`val`) {
                previous = previous.next
            }

            current.next = previous?.next
            previous?.next = current
            previous = head
            current = next
        }

        return head.next!!
    }
}

data class ListNode(var `val`: Int = 0, var next: ListNode? = null)
