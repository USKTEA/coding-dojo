class Solution {
    //[1, 2, 3, 4] => [1, 4, 2, 3]
    //[1, 2, 3] => [1, 3, 2]
    //[1, 2] => [1, 2]
    //[1] => [1]
    //링크드리스트 linkedList가 주어졌을 때 노드의 순서를 0, n - 0, 1, n - 1 순서로 변환해서 반환해라
    //linkedList의 순서를 역전하고 head 포인터를 가진 reversed를 반환하면서 linkedList의 길이도 계산한다
    //만약 linkedList의 길이가 짝수라면 마지막 노드들은 길이/2 + 길이/2 - n일거고 아니라면 길이/n일 것이다
    //origin과 reversed의 노드를 하나씩 번갈아가면서 순서가 n / 2 까지 조합한다
    fun reorderList(linkedList: ListNode): ListNode? {
        val (head, tail) = split(linkedList)
        val merged = merge(head, tail)

        return merged
    }

    fun merge(head: ListNode?, tail: ListNode?): ListNode? {
        var temp: ListNode? = head

        var headCurrent: ListNode? = head
        var tailCurrent: ListNode? = tail

        while (headCurrent != null && tailCurrent != null) {
            val headNext = headCurrent.next
            val tailNext = tailCurrent.next

            temp?.next = headCurrent
            temp = temp?.next
            temp?.next = tailCurrent
            temp = temp?.next

            headCurrent = headNext
            tailCurrent = tailNext
        }

        if (headCurrent != null) {
            temp?.next = headCurrent
        }

        return head
    }

    fun split(linkedList: ListNode): Pair<ListNode?, ListNode?> {
        val length = getLength(linkedList)
        val (head, tail) = getHeadAndTail(linkedList, length)
        val reversedTail = reverse(tail)

        return Pair(head, reversedTail)
    }

    fun reverse(tail: ListNode?): ListNode? {
        if (tail == null) {
            return null
        }

        var current: ListNode? = tail
        var previous: ListNode? = null

        while (current != null) {
            val next = current.next

            current.next = previous
            previous = current
            current = next
        }

        return previous
    }

    fun getHeadAndTail(linkedList: ListNode, length: Int): Pair<ListNode?, ListNode?> {
        var order = 1
        val head = ListNode(0)
        var temp: ListNode? = head

        var current: ListNode? = linkedList

        while (order <= length / 2) {
            temp?.next = current
            temp = temp?.next
            current = current?.next
            order += 1
        }

        if (length % 2 == 1) {
            temp?.next = current
            temp = temp?.next
        }

        val tail = temp?.next
        temp?.next = null

        return Pair(head.next!!, tail)
    }

    private fun getLength(linkedList: ListNode): Int {
        var current: ListNode? = linkedList
        var length = 0

        while (current != null) {
            length += 1
            current = current.next
        }

        return length
    }
}

data class ListNode(
        val `val`: Int,
        var next: ListNode? = null
)
