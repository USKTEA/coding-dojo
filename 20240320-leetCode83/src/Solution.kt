class Solution {
    //[] => []
    //[1] => [1]
    //[1, 1] => [1]
    //[1, 1, 2] => [1, 2]
    //[1, 1, 2, 3] => [1, 2, 3]
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var resultNode = head?.let {
            ListNode(it.value)
        } ?: return null

        val resultHead = resultNode
        var next = head.next
        
        while (next != null) {
            if (resultNode.value != next.value) {
                resultNode.next = ListNode(next.value)
                resultNode = resultNode.next!!
            }

            next = next.next
        }

        return resultHead
    }
}

data class ListNode(
    val value: Int,
    var next: ListNode? = null,
)
