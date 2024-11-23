import kotlin.math.min

class Solution {
    //[20, 15, 10, 17], 7 => 15
    //자를 수 있는 최대 길이는 woods.max()
    //자를 수 있는 최소 길이는 0
    //middle만큼 woods를 순회하며 자르는데 도중 needs 보다 크면 max를 middle - 1 로 설정하고 이진탐색
    //middle만큼 woods를 순회하며 자르는데 needs보다 작다면 min을 middle + 1로 설정하고 이진탐색
    //middle만큼 woods를 순호히며 자르는데 need와 일치하면 middle 반환
    //start > end 라면 start 반환
    fun solve(woods: ArrayList<Int>, needs: Int): Int {
        return cut(woods, needs, 0, woods.max())
    }

    private fun cut(woods: ArrayList<Int>, needs: Int, start: Int, end: Int): Int {
        if (start > end) {
            return end
        }

        val toCut = start + (end - start) / 2
        val cutted = woods.sumOf { wood -> maxOf(wood - toCut, 0) }

        if (cutted == needs) {
            return toCut
        }

        if (cutted > needs) {
            return cut(woods, needs, toCut + 1, end)
        }

        return cut(woods, needs, start, toCut - 1)
    }
}
