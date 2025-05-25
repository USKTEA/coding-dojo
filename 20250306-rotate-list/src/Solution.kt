
class Solution {
    //[1, 2, 3, 4, 5], 2 => [4, 5, 1, 2, 3]
    //calculateMove(number, length) length - (number % length)
    //current
    // next = null
    //while (move != 0) {
    // next = current.next
    //
    //
    // }
    //current.next = null
    fun rotateRight(linkedList: ListNode, number: Int): ListNode {
        val (circleLinkedList, length) = toCircle(linkedList)
        val tailIndex = calculateTailIndex(number, length)
        var currentIndex = 0
        var current: ListNode? = circleLinkedList
        var previous: ListNode? = null

        while (currentIndex < tailIndex) {
            previous = current
            current = current?.next
            currentIndex += 1
        }

        previous?.next = null

        return current!!
    }

    fun calculateTailIndex(number: Int, length: Int): Int {
        return length - (number % length)
    }

    fun toCircle(linkedList: ListNode): Pair<ListNode, Int> {
        var current: ListNode? = linkedList
        var length = 1

        while (current?.next != null) {
            current = current.next
            length += 1
        }

        current?.next = linkedList

        return Pair(linkedList, length)
    }
}

data class ListNode(val `val`: Int, var next: ListNode? = null)
