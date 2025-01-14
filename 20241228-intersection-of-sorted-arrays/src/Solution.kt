class Solution {
    //[1, 2, 3, 3, 4, 5, 6], [3, 3, 5] => [3, 3, 5]
    //otherNumberIndex = 0
    //index <= number.lastIndex || otherNumberIndex <= otherNumbers.lastIndex
    //if (number == otherNumber) {
    // result.add(number)
    // otherNumberIndex += 1
    // while (number > otherNumber) {
    //  otherNumberIndex += 1
    // }
    // }

    fun intersect(numbers: List<Int>, otherNumbers: List<Int>): ArrayList<Int> {
        var numberIndex = 0
        var otherNumberIndex = 0
        val result = arrayListOf<Int>()

        while (numberIndex <= numbers.lastIndex && otherNumberIndex <= otherNumbers.lastIndex) {
            val number = numbers[numberIndex]
            var otherNumber = otherNumbers[otherNumberIndex]

            while (number > otherNumber && otherNumberIndex < otherNumbers.lastIndex) {
                otherNumberIndex += 1
                otherNumber = otherNumbers[otherNumberIndex]
            }

            if (number == otherNumber) {
                result.add(number)
                otherNumberIndex += 1
            }

            numberIndex += 1
        }

        return result
    }
}
