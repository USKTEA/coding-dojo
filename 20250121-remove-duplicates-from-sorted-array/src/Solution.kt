class Solution {
    //[1, 1, 2] => 2
    //정렬되어 있는 정수형 배열 numbers가 주어졌을 때 numbers를 [1, 2, 3]이런식으로 중복되지 않는 요소만 만들고
    //중복되지 않은 요소의 수를 반환해랏
    //left = 0, right = 1
    //while (left <= numbers.lastIndex)
    //while (numbers[left] == numbers[right] && right <= numbers.lastIndex) {
    // right += 1
    // }
    //if ( != )
    //val inidces.add(left)
    //left = right
    //right = left += 1
    //indices.forEacch(numbers[0] = numbers[index])...
    fun removeDuplicates(numbers: ArrayList<Int>): Int {
        var left = 0
        var right = 1
        val indices = mutableListOf<Int>()

        while (left <= numbers.lastIndex && right <= numbers.lastIndex) {
            indices.add(left)

            val leftNumber = numbers[left]
            var rightNumber = numbers[right]

            while (leftNumber == rightNumber && right < numbers.lastIndex) {
                right += 1
                rightNumber = numbers[right]
            }

            left = right
            right = left + 1

            if (leftNumber != rightNumber && left == numbers.lastIndex) {
                indices.add(left)
            }
        }

        indices.forEachIndexed { index, i ->
            numbers[index] = numbers[i]
        }

        return indices.size
    }
}
