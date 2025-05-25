
class Solution {
    //[1, 2, 3, 4] => [2, 1, 4, 3]
    fun swapPairs(linkedList: ListNode): ListNode {
        val head = ListNode(0)
        var temp: ListNode? = head
        var current: ListNode? = linkedList
        var tail: ListNode? = null
        var previous: ListNode? = null

        while (current != null) {
            var next: ListNode? = current.next
            var currentIndex = 0
            var nextSlice: ListNode? = null

            while (currentIndex < 2) {
                if (currentIndex == 0) {
                    tail = current
                }

                next = current?.next

                if (currentIndex == 1) {
                    nextSlice = next
                }

                current?.next = previous
                previous =  current
                current = next

                currentIndex += 1
            }

            tail?.next = nextSlice
            temp?.next = previous
            temp = tail
        }

        return head.next!!
    }
}

data class ListNode(var `val`: Int = 0, var next: ListNode? = null)
