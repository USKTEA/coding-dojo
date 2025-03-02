class Solution {
    //[1, 5, 8], [6, 9] => [1, 5, 6, 8, 9]
    //numberIndex = 0, otherNumberIndex = 0
    //while (numberIndex <= number.lastIndex && otherNumberIndex <= otherNumbers.lastIndex) {
    // val number = numbers[index], val otherNumber = otherNumbers[index]
    // when (number > otherNumber) {
    // true -> number[index] = otherNumber
    // false -> otherNumberIndex += 1
    // }
    // }
    // while (otherNumberIndex < otherNumbers.lastIndex) {
    // numbers.add(otherNumber)
    // otherNumberIndex += 1;
    // }
    fun merge(numbers: ArrayList<Int>, otherNumbers: ArrayList<Int>) {
        var numbersIndex = 0
        var otherNumbersIndex = 0

        while (numbersIndex <= numbers.lastIndex && otherNumbersIndex <= otherNumbers.lastIndex) {
            val number = numbers[numbersIndex]
            val otherNumber = otherNumbers[otherNumbersIndex]

            when (number > otherNumber) {
                true -> {
                    numbers.add(numbersIndex, otherNumber)
                    otherNumbersIndex += 1
                }
                false -> {
                    numbersIndex += 1
                }
            }
        }

        while (otherNumbersIndex <= otherNumbers.lastIndex) {
            numbers.add(otherNumbers[otherNumbersIndex])
            otherNumbersIndex += 1
        }
    }
}
