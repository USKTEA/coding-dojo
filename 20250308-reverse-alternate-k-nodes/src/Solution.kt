class Solution {
    //[1, 2, 3, 4, 5, 6], 2 => [2, 1, 3, 4, 6, 5]
    //링크드리스트 linkedList와 숫자 number가 주어졌을 떄 number 간격으로 링크드리스트의 방향을 반전시킨 결과를 반환해라
    //evens, odds
    //evens reverse
    //reverseed + odd merge
    fun solve(linkedList: ListNode, number: Int): ListNode {
        val (odds, evens) = split(linkedList, number)
        val reversedOdds = reverse(odds, number)
        val merged = merge(reversedOdds, evens, number)

        return merged
    }

    private fun merge(reversedOdds: ListNode?, evens: ListNode?, number: Int): ListNode {
        val head = ListNode(0)
        var temp = head

        var reversedOddsTail = reversedOdds
        var evensTail = evens

        var order = 1
        var odd = true

        while (reversedOddsTail != null && evensTail != null) {
            if (order > number) {
                odd = !odd
                order = 1
            }

            if (odd) {
                temp.next = reversedOddsTail
                temp = reversedOddsTail
                reversedOddsTail = reversedOddsTail.next
            }

            if (!odd) {
                temp.next = evensTail
                temp = evensTail
                evensTail = evensTail.next
            }

            order += 1
        }

        if (reversedOddsTail == null) {
            temp.next = evensTail
        }

        if (evensTail == null) {
            temp.next = reversedOddsTail
        }

        return head.next!!
    }

    fun reverse(odds: ListNode?, number: Int): ListNode? {
        val head = ListNode(0)
        var temp: ListNode? = head

        var current: ListNode? = odds
        var tail: ListNode? = null

        while (current != null) {
            var next = current.next
            var order = 0
            var previous: ListNode? = null
            var nextSlice: ListNode? = null

            while (order < number) {
                if (order == 0) {
                    tail = current
                }

                next = current?.next

                if (order == number - 1) {
                    nextSlice = next
                }

                current?.next = previous
                previous = current
                current = next
                order += 1
            }

            tail?.next = nextSlice
            temp?.next = previous
            temp = tail
        }

        return head.next!!
    }

    fun split(linkedList: ListNode, number: Int): Pair<ListNode?, ListNode?> {
        val odds = ListNode(0)
        val evens = ListNode(0)
        var oddsTail: ListNode? = odds
        var evenTail: ListNode? = evens
        var up = true

        var current: ListNode? = linkedList
        var order = 1

        while (current != null) {
            val next = current.next

            if (order > number) {
                up = !up
                order = 1
            }

            if (up) {
                oddsTail?.next = current
                oddsTail = current
                current.next = null
            }

            if (!up) {
                evenTail?.next = current
                evenTail = current
                current.next = null
            }

            order += 1

            current = next
        }

        return Pair(odds.next, evens.next)
    }
}

data class ListNode(val value: Int, var next: ListNode? = null)
