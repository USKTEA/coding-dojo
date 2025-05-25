class Solution {
    //[1, 2, 3], 3 => [3, 2, 1]

    fun reverseList(linkedList: ListNode, number: Int): ListNode {
        val head = ListNode(0)
        var temp: ListNode? = head

        var current: ListNode? = linkedList
        var tail: ListNode? = null

        while (current != null) {
            var next = current.next
            var currentIndex = 0
            var previous: ListNode? = null
            var nextSlice: ListNode? = null

            while (currentIndex < number) {
                if (currentIndex == 0) {
                    tail = current
                }

                next = current?.next

                if (currentIndex == number - 1) {
                    nextSlice = next
                }

                current?.next = previous
                previous = current
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

data class ListNode(val value: Int, var next: ListNode? = null)
