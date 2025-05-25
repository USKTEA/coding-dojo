class Solution {
    //[1, 2, 3, 4, 5, 6], 2 => [2, 1, 4, 3, 6, 5]
    //[1, 2], 2 => [2, 1]
    //링크드리스트 linkedList와 정수형 숫자 number가 주어졌을 때 number 번째 node를 기준으로 이전 노드들의 방향을 역전한 겂을 구하는 문제
    //1, 2
    //head = null
    //prev = null
    //while current != null
    //var currentNode = 1
    //var next = current.next
    //while currentNode % number != 0
    //head.next = previous
    //
    fun reverseList(linkedList: ListNode, number: Int): ListNode {
        if (number == 1) {
            return linkedList
        }

        var current: ListNode? = linkedList
        val head = ListNode(0)
        var temp: ListNode? = head

        while (current != null) {
            var currentIndex = 0
            var previous: ListNode? = null
            var next: ListNode? = null
            var nextSlice: ListNode? = null
            var tail: ListNode? = null

            while (currentIndex != number) {
                if (currentIndex == 0) {
                    tail = current
                }

                next = current?.next

                if (currentIndex == number - 1) {
                    nextSlice = next
                }

                current?.next = previous
                previous = current
                current = next

                currentIndex += 1
            }
            tail?.next = nextSlice
            temp?.next = previous
            temp = tail
        }

        return head.next!!
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null,
)
