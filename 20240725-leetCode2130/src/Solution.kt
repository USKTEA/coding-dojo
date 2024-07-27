class Solution {
    //[5, 4, 2, 1] => 6
    //[4, 2, 2, 3] => 7
    fun pairSum(head: ListNode): Int {
        val nodeSize = getNodeSize(head)
        val sums = IntArray(nodeSize / 2)
        var current: ListNode? = head
        var index = 0

        while (current != null) {
            sums[getPairIndex(index, nodeSize)] += current.`val`
            current = current.next
            index += 1
        }

        return sums.max()
    }

    fun getPairIndex(index: Int, nodeSize: Int): Int {
        if (index > nodeSize / 2 - 1) {
            return nodeSize - 1 - index
        }

        return index
    }

    fun getNodeSize(head: ListNode): Int {
        var size = 0
        var current: ListNode? = head

        while (current != null) {
            size += 1
            current = current.next
        }

        return size
    }
}

data class ListNode(
    var `val`: Int,
    var next: ListNode? = null
)
