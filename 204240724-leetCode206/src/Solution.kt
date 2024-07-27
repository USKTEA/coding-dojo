class Solution {
    //[1, 2, 3, 4, 5] => [5, 4, 3, 2, 1]
    //[1, 2, 3] => [3, 2, 1]
    //[1, 2] => [2, 1]
    //[1] => [1]
    //[] => []
    fun reverseList(head: ListNode?): ListNode? {
        var current: ListNode? = head ?: return null
        var next: ListNode? = null
        var prev: ListNode? = null

        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }

        return prev
    }
}

data class ListNode(
    var `val`: Int,
    var next: ListNode? = null,
)
