import java.util.PriorityQueue

class Solution {
    fun mergeKLists(nodes: ArrayList<ListNode>): ListNode? {
        if (nodes.isEmpty()) return null

        val minHeap = PriorityQueue(nodes)

        val dummy = ListNode(0)
        var current = dummy

        while (minHeap.isNotEmpty()) {
            val smallest = minHeap.poll()
            current.next = smallest
            current = smallest

            smallest.next?.let {
                minHeap.offer(it)
            }
        }

        return dummy.next
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null,
) : Comparable<ListNode> {
    override fun compareTo(other: ListNode): Int {
        return `val`.compareTo(other.`val`)
    }
}
