class Solution {
    //[2, 4, 3], [5, 6, 4] => [7, 0, 8]
    //[0], [0] => [0]
    //[0, 1], [1, 1] => [1, 2]
    //[9], [1] => [0, 1]
    //[9], [1, 1] => [0, 2]
    //current = l2
    //while (current != null) { merge(l1, current), current = current.next }
    //merge(l1, node) { if(l1.val + node.val) >= 10 { val = (l1.val + node.val) % 10 }}}
    //if(l1.next != null) { l1.next.merge(Node(1, next = null)) }
    //if(l1.next == null) { l1.next = Node(1, null)}
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1Current = l1
        var l2current = l2
        var l1Previous : ListNode? = null

        while (l1Current != null && l2current != null) {
            l1Current.merge(l2current)

            l1Previous = l1Current

            l1Current = l1Current.next
            l2current = l2current.next
        }

        if (l1Current == null && l2current != null) {
            l1Previous?.next = l2current
        }

        return l1
    }
}

data class ListNode(
    var `val`: Int,
    var next: ListNode? = null,
) {
    fun merge(otherNode: ListNode) {
        val added = this.`val` + otherNode.`val`

        if (added < 10) {
            this.`val` = added

            return
        }

        this.`val`= added % 10

        if (this.next == null) {
            this.next = ListNode(1)

            return
        }

        this.next?.merge(ListNode(1))
    }
}
