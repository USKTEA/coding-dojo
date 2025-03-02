class Solution {
    //[1, 2, 3, 4, 5, null] => [5, 4, 3, 2, 1, null]
    //링크드리스트가 주어지고 in place로 링크드리스트를 뒤집는 문제
    //current는 nodes가 되고 다음은 next이다
    //next가 null일 때 까지 반복하면 되려나?
    //current기 nodes이면 next는 Null이다.
    //그럼 current.nexrt의 next가 current이고 current가 null일 때 까지 반복하면 된다
    fun reverseList(nodes: ListNode): ListNode {
        var current: ListNode? = nodes
        var previous: ListNode? = null
        var temp: ListNode?

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
    var `val`: Int,
    var next: ListNode? = null
)
