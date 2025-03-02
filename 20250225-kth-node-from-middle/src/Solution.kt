class Solution {
    //[3, 4, 7, 5, 6, 16, 15, 61, 16], 3 => 4
    //링크드리스트와 숫자를 주면 링크드리스트의 중간지점으로 부터 링크드리스트 방향으로 해당 숫자만큼 떨어져있는 노트의 값을 반환하는 문제
    //중간지점을 구하는 공식은 링크드리스트의 (길이 / 2) + 1, 만약 해당 노드가 존재하지 않는다면 -1을 반환해라
    //링크드리스트를 1번 순회해서 길이를 알아내 중간지점은 몇 번째 노드인지 알아낸다
    //첫 번째 노드부터 시작해 전체 - 현재 위치 = 숫자가 될 때까지 current를 next로 이동한다
    fun solve(linkedList: ListNode, number: Int): Int {
        val middle = getMiddle(linkedList)

        if (number >= middle) {
            return -1
        }

        var current = 1
        var currentNode: ListNode? = linkedList

        while (middle - current != number) {
            currentNode = currentNode?.next
            current += 1
        }

        return currentNode?.`val`!!
    }

    fun getMiddle(linkedList: ListNode): Int {
        var current: ListNode? = linkedList
        var index = 0

        while (current != null) {
            current = current.next
            index += 1
        }

        return (index / 2) + 1
    }
}

data class ListNode(
    val `val`: Int,
    var next: ListNode? = null
)
