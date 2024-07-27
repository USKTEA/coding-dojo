class Solution {
    //[1, 3, 4, 7, 1, 2, 6] => [1, 3, 4, 1, 2, 6]
    //[1, 2, 3, 4] => [1, 2, 4]
    //[2, 1] => [2]
    //[1] => []
    fun deleteMiddle(head: ListNode?): ListNode? {
        val nodes = ArrayList(getNodes(head))
        val middle = getMiddle(nodes.size)

        val previousNode = nodes.getOrNull(middle - 1) ?: return null
        val middleNode = nodes.getOrNull(middle)
        val nextNode = middleNode?.next

        if (nextNode == null) {
            previousNode.next = null
        }

        if (nextNode != null) {
            previousNode.next = nextNode
        }

        return head
    }

    fun getNodes(head: ListNode?): List<ListNode> = buildList {
        var current: ListNode? = head
        while (current != null) {
            add(current)
            current = current.next
        }
    }

    fun getMiddle(nodeLength: Int): Int {
        return nodeLength / 2
    }
}

data class ListNode(
    var `val`: Int,
    var next: ListNode? = null,
)
