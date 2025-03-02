class Solution {
    //[1, 2, 3, 4, 5] => [1, 4, 3, 2, 5]
    //링크드리스트 linkedList와 start와 end 두 개의 숫자가 주어졌을때 start부터 end까지의 노드만 반대방향으로 변경하는 문제
    //링크드리스트를 순회하면서 이전 노드를 기억하고 있는다
    //노드의 순서가 start와 동일하다면 현재 노드를 기억한다
    //현재 노드부터 end까지 next를 반대로 할당한다
    //end에 도달했다면 처음에 기억했던 노드의 next를 현재 노드로 할당 이전에 기록했던 노드의 next를 현재 노드의 next로 할당한다.
    fun reverseBetween(linkedList: ListNode, start: Int, end: Int): ListNode {
        var currentIndex = start

        val (head, middle, tail) = slice(linkedList, start)

        var current = tail
        var previous: ListNode? = null
        var last: ListNode? = null

        while (currentIndex <= end) {
            if (previous == null) {
                last = current
            }

            val next = current?.next

            current?.next = previous
            previous = current
            current = next

            currentIndex += 1
        }


        if (head == null) {
            last?.next = current

            return previous!!
        }

        last?.next = current
        middle?.next = previous

        return head
    }

    fun slice(linkedList: ListNode, number: Int): Triple<ListNode?, ListNode?, ListNode?> {
        var currentNumber = 1
        val head = ListNode(0)
        head.next = linkedList

        var current: ListNode? = head.next

        if (number == currentNumber) {
            return Triple(null, current, linkedList)
        }

        while (currentNumber < number - 1) {
            val next = current?.next

            currentNumber += 1
            current = next
        }

        val last = current?.next

        current?.next = null

        return Triple(head.next!!, current, last)
    }
}

data class ListNode(
    val value: Int,
    var next: ListNode? = null
)
