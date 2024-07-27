class Solution {
    //[1, 2, 3, 4, 5] => [1, 3, 5, 2, 4]
    //[1, 2, 3] => [1, 3, 2]
    //[1, 2] => [1, 2]
    //[1, 2, 3, 4] => [1, 3, 2, 4]
    //middle => if (5) => 2, if (0) => 0

    fun oddEvenList(head: ListNode?): ListNode? {
        if (head?.next == null) return head // 노드가 0개 또는 1개인 경우

        var odd = head
        var even = head.next
        val evenHead = even // 짝수 노드의 시작점을 저장

        while (even?.next != null) {
            odd?.next = even.next
            odd = odd?.next
            even.next = odd?.next
            even = even.next
        }

        odd?.next = evenHead

        return head
    }
}

data class ListNode(
    var `val`: Int,
    var next: ListNode? = null
)
