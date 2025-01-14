class Solution {
    //[1, 2, 3] => [3, 2, 1]
    //현재 노드의 다음 노드의 다음 노드가 현재 노드로 변경되고
    //현재 노드가 이전 노드가 되면 된다.
    fun reverseList(linkedList: ListNode): ListNode {
        var currentNode: ListNode? = linkedList
        var previousNode: ListNode? = null

        while (currentNode != null) {
            val temp = currentNode.next

            currentNode.next = previousNode
            previousNode = currentNode
            currentNode = temp
        }

        return checkNotNull(previousNode)
    }
}

data class ListNode(
    var `val`: Int,
    var next: ListNode? = null
)
