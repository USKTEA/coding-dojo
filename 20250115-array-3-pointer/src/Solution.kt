class Solution {
    fun minimize(numbers: List<Int>, otherNumbers: List<Int>, theOtherNumbers: List<Int>): Int {
        var minDff = Int.MAX_VALUE
        var numbersIndex = 0
        var otherNumbersIndex = 0
        var theOtherNumbersIndex = 0

        while (numbersIndex <= numbers.lastIndex && otherNumbersIndex <= otherNumbers.lastIndex && otherNumbersIndex <= theOtherNumbers.lastIndex) {
            val number = numbers[numbersIndex]
            val otherNumber = otherNumbers[otherNumbersIndex]
            val theOtherNumber = theOtherNumbers[theOtherNumbersIndex]

            val min = minOf(number, otherNumber, theOtherNumber)
            val max = maxOf(number, otherNumber, theOtherNumber)

            minDff = minOf(minDff, max - min)

            when (min) {
                number -> numbersIndex += 1
                otherNumber -> otherNumbersIndex += 1
                theOtherNumber -> theOtherNumbersIndex += 1
            }
        }

        return minDff
    }
}
