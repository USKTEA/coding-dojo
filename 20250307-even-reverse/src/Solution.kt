import kotlin.reflect.KFunction
import org.junit.jupiter.api.assertTimeoutPreemptively

class Solution {
    //[1, 2, 3, 4] => [1, 4, 3, 2]
    //링크드리스트가 주어졌을 떄 짝수 인덱스에 있는 노드들의 순서의 방향을 역전한 결과를 반환
    //odds, evens
    //oddsHead
    //evensHead
    //oddTail
    //evensTail
    //current
    //while current != null
    //if index == even eventTail.next = current || odd oddTail.next = current oddTail = current
    //result
    fun solve(linkedList: ListNode?): ListNode? {
        if (linkedList == null) {
            return null
        }

        val (odds, evens) = getOddsAndEvens(linkedList)
        val reversedEvens = reverse(evens)
        val merged = merge(odds = odds, reversedEvens = reversedEvens)

        return merged
    }

    private fun merge(odds: ListNode?, reversedEvens: ListNode?): ListNode? {
        val head = ListNode(0)
        var temp: ListNode? = head
        var oddsCurrent = odds
        var evensCurrent = reversedEvens
        var order = 1

        while (oddsCurrent != null && evensCurrent != null) {
            if (order % 2 == 1) {
                temp?.next = oddsCurrent
                temp = oddsCurrent
                oddsCurrent = oddsCurrent.next
            }

            if (order % 2 == 0) {
                temp?.next = evensCurrent
                temp = evensCurrent
                evensCurrent = evensCurrent.next
            }

            order += 1
        }

        if (oddsCurrent != null) {
            temp?.next = oddsCurrent
        }

        if (evensCurrent != null) {
            temp?.next = evensCurrent
        }

        return head.next
    }

    private fun reverse(evens: ListNode?): ListNode? {
        if (evens == null) {
            return null
        }

        var current: ListNode? = evens
        var previous: ListNode? = null

        while (current != null) {
            val next = current.next

            current.next = previous
            previous = current
            current = next
        }

        return previous!!
    }

    private fun getOddsAndEvens(linkedList: ListNode): Pair<ListNode?, ListNode?> {
        val odds = ListNode(0)
        val evens = ListNode(0)
        var oddsTail = odds
        var evensTail = evens

        var current:ListNode? = linkedList
        var order = 1

        while (current != null) {
            val next = current.next
            if (order % 2 == 0) {
                evensTail.next = current
                evensTail = current
            }

            if (order % 2 == 1) {
                oddsTail.next = current
                oddsTail = current
            }

            current.next = null
            current = next
            order += 1
        }

        return Pair(odds.next, evens.next)
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null
)
