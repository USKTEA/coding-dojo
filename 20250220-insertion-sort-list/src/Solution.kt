// ListNode 클래스 정의
data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {

    fun insertionSortList(head: ListNode): ListNode? {
        if (head.next == null) {
            return head
        }

        val dummy = ListNode(0) // 정렬된 리스트의 시작을 위한 더미 노드

        var current: ListNode? = head       // 원본 리스트의 현재 노드

        while (current != null) {
            val next = current.next   // 다음 노드를 저장

            // 정렬된 리스트(dummy)를 순회하며, current 노드를 삽입할 위치를 찾음
            var prev = dummy
            while (prev.next != null && prev.next!!.`val` < current.`val`) {
                prev = prev.next!!
            }

            // current 노드를 정렬된 리스트에 삽입
            current.next = prev.next
            prev.next = current

            current = next // 다음 노드로 이동
        }

        return dummy.next
    }
}
