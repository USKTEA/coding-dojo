class Solution {
    fun getIntersectionNode(list: ListNode, otherList: ListNode): ListNode? {
        var node: ListNode? = list
        var otherNode: ListNode? = otherList

        while (node != otherNode) {
            node = if (node == null) otherList else node.next
            otherNode = if (otherNode == null) list else otherNode.next
        }

        return node
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null
)
