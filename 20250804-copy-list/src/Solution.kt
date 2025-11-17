class Solution {
    fun copyRandomList(head: RandomListNode): RandomListNode {
        val copyHead = RandomListNode(0)

        copy(head)

        var current = head.next

        return head
    }


    private fun copy(node: RandomListNode) {
        copy

    }
    data class RandomListNode(
        var label: Int,
        var next: RandomListNode? = null,
        var random: RandomListNode? = null
    )
}
