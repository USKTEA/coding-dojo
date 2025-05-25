import org.junit.jupiter.api.assertTimeoutPreemptively

class Solution {
    //[1, 2, 2, 1] => 1
    //linkedList가 주어졌을 때 대칭적인지 확인하고 대칭이라면 1 대칭이 아니라면 0을 반환하는 문제
    //linkedList를 역순으로 정렬하고 서로의 head부터 tail까지 비교한다. 만약 두 노드의 값이 다르다면 대칭적이지 않다
    fun solve(linkedList: ListNode): Int {
        var slowPointer: ListNode? = linkedList
        var fastPointer: ListNode? = linkedList

        while (slowPointer != null && fastPointer != null) {
            slowPointer = slowPointer.next
            fastPointer = fastPointer.next?.next
        }

        if (fastPointer != null) {
            slowPointer = slowPointer?.next
        }

        println(slowPointer)
        println(fastPointer)
        return 1
    }

    fun reverse(linkedList: ListNode): Pair<ListNode, ListNode> {
        val origin = ListNode(0)
        var originHead:ListNode? = origin

        var current: ListNode? = linkedList
        var previous: ListNode? = null

        while (current != null) {
            val next = current.next
            originHead?.next = ListNode(`val` = current.`val`)
            originHead = originHead?.next

            current.next = previous
            previous = current
            current = next
        }

        return Pair(origin.next!!, previous!!)
    }
}

data class ListNode(var `val`: Int, var next: ListNode? = null)
