class Solution {
    //중복 노드가 포함된 링크드리스트 linkedList가 주어졌을 때 중복된 요소는 모두 제거하는 문제
    //previous = null, previous = current, next = current.next
    //previous.next =
    fun deleteDuplicates(head: ListNode?): ListNode? {
        // 더미 노드를 생성하여 head 앞에 붙여 경계 조건을 쉽게 처리합니다.
        val dummy = ListNode(0)
        dummy.next = head

        var prev: ListNode? = dummy  // 중복이 없는 마지막 노드를 가리킵니다.
        var current = head           // 순회용 포인터

        while (current != null) {
            val next = current.next

            if (current.`val` == next?.`val`) {
                val duplicateVal = current.`val`

                while (current?.`val` == duplicateVal) {
                    current = current.next
                }

                prev?.next = current
            } else {
                prev = current
                current = current.next
            }
        }

        return dummy.next
    }
}

data class ListNode(var `val`: Int = 0, var next: ListNode? = null)
