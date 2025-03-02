import kotlin.time.measureTime

class Solution {
    //[1, 3, 2] => [1, 2, 3]
    //[3, 1] => [1, 3]
    //[2, 1, 1] => [1, 1, 2]
    //정렬되지 않는 링크드리스트가 주어졌을 때 각 노드의 값이 오름차순으로 정렬될 수 있도록 insertionSort 로직을 구현해라
    //while (current != null) {
    // next = current.next
    //
    // while (previous.next != null && current.val > previous.next.val) {
    // previous = previous.next
    // }
    // exchange()
    // }


    fun insertionSortList(linkedList: ListNode): ListNode {
        val head = ListNode(0)
        var previous: ListNode? = head
        var current: ListNode? = linkedList
        var next: ListNode?

        while (current != null) {
            next = current.next

            while (previous?.next != null && previous.next!!.`val` < current.`val`) {
                previous = previous.next
            }

            current.next = previous?.next
            previous?.next = current
            previous = head
            current = next
        }

        return head.next!!
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null,
)
