import kotlin.concurrent.fixedRateTimer

class Solution {
    fun partition(linkedList: ListNode, number: Int): ListNode {
        var firstPartitionHead: ListNode? = null;
        var firstPartitionTail: ListNode? = null;
        var secondPartitionHead: ListNode? = null;
        var secondPartitionTail: ListNode? = null;
        var current: ListNode? = linkedList


        while (current != null) {
            val next = current.next
            current.next = null
            val value = current.`val`

            if (value < number) {
                if (firstPartitionHead == null) {
                    firstPartitionHead = current
                    firstPartitionTail = current
                } else {
                    firstPartitionTail?.next = current
                    firstPartitionTail = current
                }
            }

            if (value >= number) {
                if (secondPartitionHead == null) {
                    secondPartitionHead = current
                    secondPartitionTail = current
                } else {
                    secondPartitionTail?.next = current
                    secondPartitionTail = current
                }
            }

            current = next
        }

        if (firstPartitionHead == null) {
            return secondPartitionHead!!
        }

        firstPartitionTail?.next = secondPartitionHead

        return firstPartitionHead
    }
}

data class ListNode(var `val`: Int = 0, var next: ListNode? = null)
