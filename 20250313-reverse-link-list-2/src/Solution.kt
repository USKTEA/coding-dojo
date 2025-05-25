class Solution {
    //[1, 2, 3, 4, 5], 2 , 4 => [1, 4, 3, 2, 5]
    //링크드리스트 linkedList와 노드의 순서를 나타내는 start와 end가 주어졌을 때 linkedList의 start 부터 end까지 순서를 반전한 결과를 반환해라
    //현재 노드의 순서가 start와 일치할 때 까지 다음 노드로 이동한다
    //다음 노드로 이동하면서 현재 노드를 이전 노드로 저장해둔다
    //현재 노드의 순서가 start와 일치하게 되었다면, 현재 노드의 순서가 end와 동일하게 될 때 까지 순서를 역전시킨다
    //만약 현재 노드의 순서가 end와 일치하게 되었다면 역전된 노드의 다음은 end 노드의 다음 노드가 된다
    //그리고 처음에 저장해둔 이전 노드의 다음 노드로 역전된 노드를 할당한다
    //head -> reversed -> tail
    fun reverseBetween(linkedList: ListNode, start: Int, end: Int): ListNode {
        val (head, tail, last) = moveToStart(linkedList, start)

        if (last == null) {
            return head!!
        }

        val reversed = reverseToEnd(last, start, end)

        if (head == null) {
            return reversed
        }

        tail?.next = reversed

        return head
    }

    fun reverseToEnd(last: ListNode, start: Int, end: Int): ListNode {
        var currentOrder = start

        var previous: ListNode? = null
        var current: ListNode? = last
        val tail = current

        while (currentOrder <= end) {
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
