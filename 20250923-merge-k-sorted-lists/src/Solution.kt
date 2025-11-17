import java.util.PriorityQueue

class Solution {
    //PQ 생성 비교는 node.val
    //merged -> head .
    //while pq isNotEmpty poll if next not null offer pq node
    fun mergeKLists(nodes: ArrayList<ListNode>): ListNode {
        val priorityQueue = PriorityQueue(Comparator<ListNode> { a, b -> a.`val` - b.`val` })
        priorityQueue.addAll(nodes)

        val mergedHead = ListNode(0)
        var next: ListNode? = mergedHead

        while (priorityQueue.isNotEmpty()) {
            val node = priorityQueue.poll()
            next?.next = node
            next = next?.next

            if (node.next != null) {
                priorityQueue.offer(node.next)
            }
        }

        return mergedHead.next!!
    }

    data class ListNode(val `val`: Int, var next: ListNode? = null)
}
