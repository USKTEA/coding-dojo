class Solution {
    //123
    //123123

    //1 2 3 1

    fun permute(numbers: ArrayList<Int>): ArrayList<ArrayList<Int>> {
        val visits = BooleanArray(numbers.size) { false }
        val result = mutableListOf<List<Int>>()
        val current = mutableListOf<Int>()

        fun backtrack() {
            if (current.size == numbers.size) {
                result.add(current.toList())
                return
            }

            numbers.forEachIndexed { index, i ->
                if (visits[index]) {
                    return@forEachIndexed
                }

                visits[index] = true
                current.add(numbers[index])
                backtrack()
                current.removeAt(current.size - 1)
                visits[index] = false
            }
        }

        backtrack()

        return ArrayList(result.map { ArrayList(it) })
    }
}
