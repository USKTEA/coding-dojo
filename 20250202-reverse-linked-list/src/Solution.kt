class Solution {
    //[1, 2, 3, 4, 5, null] => [5, 4, 3, 2, 1, null]
    //링크드리스트가 주어졌을 때 노드를 역순으로 배치한 결과를 반환해라
    fun reverseList(linkedList: ListNode): ListNode {
        var current : ListNode? = linkedList
        var previous: ListNode? = null
        var temp: ListNode? = null

        while (current != null) {
            temp = current.next
            current.next = previous
            previous = current
            current = temp
        }

        return previous!!
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null
)
