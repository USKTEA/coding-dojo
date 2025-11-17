import java.util.Comparator
import java.util.PriorityQueue

class Solution {
    //사이즈가 N인 정수형 배열 2개가 주어졌을 때 두 배열 요소의 합이 가장 큰 N개의 숫자를 반환해라.
    //즉 A[i] + B[j] 합의 내림차순으로 반환해라
    //numbers와 otherNumbers를 우선순위 큐로 감싸고 가장 큰 숫자를 가져온다 둘 모두 같다면 other를 다음 작은 것을 가져온다
    fun solve(numbers: ArrayList<Int>, otherNumbers: ArrayList<Int>): ArrayList<Int> {
        val sortedNumbers = numbers.sortedDescending()
        val otherSortedNumbers = otherNumbers.sortedDescending()

        val pq = PriorityQueue<Node>()
        val visited = mutableSetOf<Pair<Int, Int>>()
        val result = arrayListOf<Int>()
        pq.add(Node(sortedNumbers[0] + otherSortedNumbers[0], 0, 0))
        visited.add(Pair(0, 0))

        repeat(numbers.size) {
            val node = pq.poll()
            result.add(node.sum)

            val i = node.i
            val j = node.j

            if (i + 1 < numbers.size && !visited.contains(Pair(i + 1, j))) {
                pq.add(Node(sortedNumbers[i + 1] + otherSortedNumbers[j], i + 1, j))
                visited.add(Pair(i + 1, j))
            }

            if (j + 1 < numbers.size && !visited.contains(Pair(i + 1, j + 1))) {
                pq.add(Node(sortedNumbers[i] + otherSortedNumbers[j + 1], i, j + 1))
                visited.add(Pair(i + 1, j))
            }
        }

        return result
    }

    data class Node(val sum: Int, val i: Int, val j: Int) : Comparable<Node> {
        override fun compareTo(other: Node): Int {
            return other.sum.compareTo(sum)
        }
    }
}
