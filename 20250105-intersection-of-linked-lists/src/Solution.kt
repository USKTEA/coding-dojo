class Solution {
    //두 linkedList를 뒤집는다
    //뒤집은 linkedList를 순회한다
    //뒤집은 linkedList의 첫 번째 요소가 동일하지 않다면 null을 반환한다
    //요소가 동일하지 않는다면 그 이전까지가 intersectionPoint
    //interSectionPoint를 뒤집어서 반환한다
    fun getIntersectionNode(list: ListNode, otherList: ListNode): ListNode? {
        val reversedList = reverse(list)
        val reversedOtherList = reverse(otherList)

        var currentNode = reversedList
        var otherCurrentNode = reversedOtherList

        var previousNode: ListNode? = null
        var otherPreviousNode: ListNode? = null

        while (currentNode.`val` == otherCurrentNode.`val`) {
            val next = currentNode.next
            val otherNext = otherCurrentNode.next

            if (next != null && otherNext != null) {
                currentNode.next = previousNode
                otherCurrentNode.next = otherPreviousNode

                previousNode = currentNode
                otherPreviousNode = otherCurrentNode

                currentNode = next
                otherCurrentNode = otherNext
                continue
            }

            if (next != null) {
                previousNode = currentNode
                return reverse(previousNode)
            }

            if (otherNext != null) {
                otherPreviousNode = otherCurrentNode
                return reverse(otherPreviousNode)
            }
        }


        return null
    }

    fun reverse(list: ListNode): ListNode {
        var currentNode: ListNode? = list
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
    val `val`: Int, var next: ListNode? = null
)
