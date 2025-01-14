class Solution {
    //[1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]
    fun reverseList(list: ListNode): ListNode? {
        var head: ListNode? = list
        var previous: ListNode? = null

        while (head != null) {
            val temp = head.next
            head.next = previous
            previous = head
            head = temp
        }

        return previous
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null
)
