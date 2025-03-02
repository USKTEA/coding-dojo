class Solution {
    //[5, 8, 20], [4, 11, 15] => [4, 5, 8, 11, 15, 20]
    //두 링크드리스트가 주어졌을 때 두 링크드리스트를 오름차순으로 합친 결과를 반환하는 문제
    //head
    //while 두 개 not null
    //val 크기 비교
    //작은거 할당, current  = next
    //if list not null
    //if otherList not null
    fun mergeTwoLists(list: ListNode, otherList: ListNode): ListNode {
        val head = ListNode(0)
        var headCurrent: ListNode? = head
        var listCurrent: ListNode? = list
        var otherListCurrent: ListNode? = otherList

        while (listCurrent != null && otherListCurrent != null) {
            val listCurrentValue = listCurrent.`val`
            val otherListCurrentValue = otherListCurrent.`val`

            when (listCurrentValue >= otherListCurrentValue) {
                true -> {
                    headCurrent?.next = otherListCurrent
                    headCurrent = headCurrent?.next
                    otherListCurrent = otherListCurrent.next
                }
                false -> {
                    headCurrent?.next = listCurrent
                    headCurrent = headCurrent?.next
                    listCurrent = listCurrent.next
                }
            }
        }

        if (listCurrent != null) {
            headCurrent?.next = listCurrent
        }

        if (otherListCurrent != null) {
            headCurrent?.next = otherListCurrent
        }

        return head.next!!
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null
)
