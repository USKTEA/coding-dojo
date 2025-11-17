import java.util.PriorityQueue

class Solution {
    fun solve(matrix: ArrayList<ArrayList<Int>>): ArrayList<Int> {
        val numbers = PriorityQueue(matrix.flatten())
        val result = arrayListOf<Int>()

        while (numbers.isNotEmpty()) {
            result.add(numbers.poll())
        }

        return result
    }
}
