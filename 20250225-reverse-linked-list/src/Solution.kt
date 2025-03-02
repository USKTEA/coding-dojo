class Solution {
    //[1, 2, 3, 4, 5] => [5, 4, 3, 2, 1]
    fun reverseList(linkedList: ListNode): ListNode {
        var current: ListNode? = linkedList
        var previous: ListNode? = null

        while (current != null) {
            val next = current.next

            current.next = previous
            previous = current
            current = next
        }

        return previous!!
    }
}

data class ListNode(
    var `val`: Int,
    var next: ListNode? = null
)
