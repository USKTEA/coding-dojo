class Solution {
    //numbersIndex = 0, number < numbers.lastIndex
    //while (numberIndex <= numbers.lastIndex) {
    // val currentNumber = numbers[numbersIndex]
    // var otherCurrentNumber = otherNumbers[otherNumbersIndex]
    // while (otherCurrentNumber >! currentNumber) {
    // numbers.add(otherCurrentNumber, numbersIndex)
    // numbersIndex += 1
    // otherIndex += 1
    // }
    fun merge(numbers: ArrayList<Int>, otherNumbers: ArrayList<Int>) {
        var currentIndex = 0
        var otherIndex = 0

        while (currentIndex < numbers.size && otherIndex < otherNumbers.size) {
            val currentNumber = numbers[currentIndex]
            val otherNumber = otherNumbers[otherIndex]

            if (currentNumber >= otherNumber) {
                numbers.add(currentIndex, otherNumber)
                otherIndex++
                currentIndex++
            } else {
                currentIndex++
            }
        }

        while (otherIndex < otherNumbers.size) {
            numbers.add(otherNumbers[otherIndex])
            otherIndex++
        }
    }
}
