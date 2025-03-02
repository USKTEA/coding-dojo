class Solution {
    //[1, 0, 0, 1] => [0, 0, 1, 1]
    var zeroHead: ListNode? = null
    var zeroTail: ListNode? = null
    var oneHead: ListNode? = null
    var oneTail: ListNode? = null

    fun solve(linkedList: ListNode): ListNode {
        var current: ListNode? = linkedList

        while (current != null) {
            val next = current.next
            current.next = null
            val bit = current.`val`

            if (bit == 0) {
                addZero(current)
            }

            if (bit == 1) {
                addOne(current)
            }

            current = next
        }

        if (zeroHead == null) {
            return oneHead!!
        }

        zeroTail?.next = oneHead

        return zeroHead!!
    }

    private fun addZero(node: ListNode) {
        if (zeroHead != null) {
            zeroTail?.next = node
            zeroTail = node
        }

        if (zeroHead == null) {
            zeroHead = node
            zeroTail = node
        }
    }

    private fun addOne(node: ListNode) {
        if (oneHead != null) {
            oneTail?.next = node
            oneTail = node
        }

        if (oneHead == null) {
            oneHead = node
            oneTail = node
        }
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null
)
