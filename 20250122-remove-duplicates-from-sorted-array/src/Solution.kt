class Solution {
    //[1, 1, 1, 2] => 3
    //정렬된 정수형 배열 numbers가 주어졌을 때 동일한 요소가 최대 2번 출현할 수 있도록 하라
    //여기서 최대 2번 출현한다는 것은 특정 index 이전에 최대 2번 출현할 수 있다는 것
    //left, right
    //while right <= number.lastIndex
    //if (left == right) {
    //  if (count == 1) {
    //      left = right
    //      right = left + 1
    //  continue
    //  }
    //  numbers[left] = numbers[right]
    //  left += 1
    // right = left + 1
    // }
    fun removeDuplicates(numbers: ArrayList<Int>): Int {
        if (numbers.size <= 2) {
            return numbers.size
        }
        var readIndex = 0
        var writeIndex = 0
        var previousNumber: Int? = null
        var count = 0

        while (readIndex <= numbers.lastIndex) {
            val currentNumber = numbers[readIndex]

            if (currentNumber == previousNumber) {
                count += 1
            }

            numbers[writeIndex] = currentNumber

            previousNumber = currentNumber
            readIndex += 1

            if (count == 2) {
                while (readIndex <= numbers.lastIndex && previousNumber == numbers[readIndex]) {
                    readIndex += 1
                }
            }

            count = 1
            writeIndex += 1
        }

        repeat(readIndex - writeIndex) {
            numbers.removeLast()
        }

        return numbers.size
    }
}
