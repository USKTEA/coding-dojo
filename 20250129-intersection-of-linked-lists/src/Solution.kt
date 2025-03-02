class Solution {
    //[1, 2], [2] => [2]
    fun getIntersectionNode(list: ListNode, otherList: ListNode): ListNode? {
        var node: ListNode? = list
        var otherNode: ListNode? = otherList

        while (node != otherNode) {
            node = if (node == null) otherList else node.next
            otherNode = if (otherNode == null) list else otherNode.next
        }

        return node
    }

//    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
//        var a = headA
//        var b = headB
//
//        while (a != b) {
//            a = if (a == null) headB else a.next
//            b = if (b == null) headA else b.next
//        }
//
//        return a
//    }
}

data class ListNode(
    var `val`: Int,
    var next: ListNode? = null
)
