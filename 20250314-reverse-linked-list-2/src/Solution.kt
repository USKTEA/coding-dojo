class Solution {
    //[1, 2, 3, 4, 5], 2, 4 => [1, 4, 3, 2, 5]
    //링크드리스트 linkedList와 노드의 순서를 가르키는 정수 start와 end가 주어졌을 때 linkedList에서 stat부터 end의 순서를 역전한 결과를 반환해라
    //toStartPoint [1, 2, 3, 4, 5], start => [1][1][2,3,4,5]
    //reverseUntil [2, 3, 4, 5], end - start => [4, 2, 3, 5]
    //merge [1][4, 2, 3, 5] => [1, 4, 2, 3, 5]
    fun reverseBetween(linkedList: ListNode, start: Int, end: Int): ListNode {
        val (head, tail, last) = moveToStart(linkedList, start)

        if (last == null) {
            return head!!
        }

        val reversed = reverseUntil(last, end - start)

        if (head == null) {
            return reversed
        }

        merge(tail, reversed)

        return head
    }

    private fun merge(tail: ListNode?, reversed: ListNode) {
        tail?.next = reversed
    }

    fun reverseUntil(last: ListNode, number: Int): ListNode {
        var currentOrder = 1

        var previous: ListNode? = null
        var current: ListNode? = last
        val tail = current

        while (currentOrder <= number + 1) {
            val next = current?.next

            current?.next = previous
            previous = current
            current = next
            currentOrder += 1
        }

        tail?.next = current

        return previous!!
    }

    fun moveToStart(linkedList: ListNode, start: Int): Triple<ListNode?, ListNode?, ListNode?> {
        var order = 1

        val head = ListNode(0)
        var temp: ListNode? = head
        var current: ListNode? = linkedList

        while (order != start) {
            temp?.next = current
            temp = temp?.next
            current = current?.next
            order += 1
        }

        temp?.next = null

        return Triple(head.next, temp, current)
    }
}

data class ListNode(val `val`: Int, var next: ListNode? = null)
