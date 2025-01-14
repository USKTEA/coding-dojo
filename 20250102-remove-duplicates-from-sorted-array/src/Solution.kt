class Solution {
    //[1, 1, 1, 2] -> 3, [1, 1, 2]
    //readIndex = 0
    //var previousNumber = null
    //var count = 0
    //while (readIndex <= numbers.lastIndex) {
    //val currentNumber = numbers[readIndex]
    //
    //if (currentNumber == previousNumber) {
    //count += 1
    // }
    //readIndex += 1
    //previousNumber == currentNumber

    //if count == 2
    //while (previousNumber == numbers[readIndex]) {
    // readIndex += 1
    // }
    //

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
