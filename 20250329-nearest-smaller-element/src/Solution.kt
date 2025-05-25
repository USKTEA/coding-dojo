class Solution {
    //정수형 배열 numbers가 주어졌을 때 numbers[j] (j < i) 중 가장 i와 근접하면서 크기가 numbers[i]보다 작은 값을 모아 봔한해라. 만약 없다면 -1이 해당 요소의 값이 된다
    //[1, 2, 3] => [-1, 1, 2]
    fun prevSmaller(numbers: ArrayList<Int>): ArrayList<Int> {
        val uniqueNumbers = numbers.toSet().toList()
        val result = arrayListOf<Int>()

        numbers.forEach { number ->
            var index = uniqueNumbers.indexOf(number)

            while (index >= 0) {
                val found = uniqueNumbers[index]

                if (found < number) {
                    result.add(found)

                    return@forEach
                }

                index -= 1
            }

            result.add(-1)
        }

        return result
    }
}
