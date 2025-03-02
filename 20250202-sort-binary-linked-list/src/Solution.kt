class Solution {
    // [1, 0, 0, 1] => [0, 0, 1, 1]
    fun solve(node: ListNode): ListNode? {
        var current: ListNode? = node

        var zerosHead: ListNode? = null
        var zerosTail: ListNode? = null
        var onesHead: ListNode? = null
        var onesTail: ListNode? = null

        while (current != null) {
            val temp = current.next
            current.next = null // 현재 노드를 분리

            if (current.`val` == 0) {
                if (zerosHead == null) {
                    zerosHead = current
                    zerosTail = current
                } else {
                    zerosTail?.next = current
                    zerosTail = zerosTail?.next
                }
            } else { // current.`val` != 0, 즉 1인 경우
                if (onesHead == null) {
                    onesHead = current
                    onesTail = current
                } else {
                    onesTail?.next = current
                    onesTail = onesTail?.next
                }
            }
            current = temp
        }

        // 0 리스트와 1 리스트를 이어 붙임
        if (zerosTail != null) {
            zerosTail.next = onesHead
            return zerosHead
        } else {
            return onesHead
        }
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null,
)
