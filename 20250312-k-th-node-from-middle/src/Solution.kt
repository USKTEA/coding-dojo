class Solution {
    //[1, 14, 6, 15, 4, 10], 2  => 14
    //중간점은 (n / 2 + 1)이다
    fun solve(linkedList: ListNode, number: Int): Int {
        val middle = getMiddle(linkedList)
        var currentNode: ListNode? = linkedList
        var currentIndex = 1

        if (middle - currentIndex < number) {
            return -1
        }

        while (middle - currentIndex != number) {
            currentIndex += 1
            currentNode = currentNode?.next
        }

        return currentNode?.`val`!!
    }

    fun getMiddle(linkedList: ListNode): Int {
        var fastNode: ListNode? = linkedList
        var slowNodeIndex = 1
        var fastNodeIndex = 1

        while (fastNode?.next?.next != null) {
            slowNodeIndex += 1
            fastNodeIndex += 2
            fastNode = fastNode.next?.next
        }

        if (fastNode?.next != null) {
            return slowNodeIndex + 1
        }

        return slowNodeIndex
    }
}

data class ListNode(val `val`: Int, var next: ListNode? = null)
