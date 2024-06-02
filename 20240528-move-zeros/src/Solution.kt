class Solution {
    //[0, 1, 0, 3, 12] => [1, 3, 12, 0, 0]
    //[0] => [0]
    //[0, 1] = [1, 0]
    //[0, 0, 1] => [1, 0, 0]
    //[0, 1 ,1] => [1, 1, 0]
    //[0, 1]
    //[] => exchange()
    //numbers.lastIndex = 0
    //numbers.lastIndex -1
    //numbers.lastIndex -2
    //if 0
    fun solve(numbers: ArrayList<Int>): ArrayList<Int> {
        val notZeros = numbers.fold(mutableListOf<Int>()) { acc, i ->
            if (i != 0) {
                acc.add(i)
            }

            acc
        }

        notZeros.forEachIndexed { index, i ->
            numbers[index] = i
        }

        for (i: Int in notZeros.size..numbers.lastIndex) {
            numbers[i] = 0
        }

        return numbers
    }
}
