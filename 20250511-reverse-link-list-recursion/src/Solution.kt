class Solution {
    //재귀를 이용해 주어진 연결리스트를 reverse 시켜라
    //이전 노드, 현재 노드, 다음 노드가 필요하다
    //현재 노드의 다음은 이전 노드이고, 현재 노드는 다음 노드가 된다.
    //시작 부분은 어딘가에 남겨두어야 한다
    fun reverseList(linkedList: ListNode): ListNode? {
        var current : ListNode? = linkedList
        var previousNode : ListNode? = null

        while (current != null) {
            val temp = current.next

            current.next = previousNode
            previousNode = current
            current = temp
        }

        return previousNode
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null,
)
