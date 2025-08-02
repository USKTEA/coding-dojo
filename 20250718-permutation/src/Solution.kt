class Solution {
    fun permute(numbers: ArrayList<Int>): ArrayList<ArrayList<Int>> {
        val visited = BooleanArray(numbers.size)
        val permutations = ArrayList<ArrayList<Int>>()

        visit(
            numbers = numbers,
            permutations = permutations,
            visited = visited,
        )

        return permutations
    }

    fun visit(
        numbers: ArrayList<Int>,
        permutations: ArrayList<ArrayList<Int>>,
        current: MutableList<Int> = mutableListOf(),
        visited: BooleanArray,
    ) {
        if (current.size == numbers.size) {
            permutations.add(ArrayList(current))
            return
        }

        visited.forEachIndexed { index, isVisited ->
            if (isVisited) {
                return@forEachIndexed
            }

            visited[index] = true
            current.add(numbers[index])
            visit(
                numbers = numbers,
                current = current,
                permutations = permutations,
                visited = visited,
            )
            current.removeLast()
            visited[index] = false
        }
    }
}
