class Solution {
    //[1, 4, 10],
    //[2, 15, 20],
    //[10, 12]

    //max(abs(1- 2), abs(2 - 3), abs(3 -1)) = 2
    //max(1, 2, 3) - min(1, 2, 3) = 2
    //배열은 정렬되어 있음
    //max - min이니까 min을 크게 하면 결과 값은 작아짐
    //그럼 min이 a일 때 aIndex += 1 ....
    //언제까지? min이 더 이상 커지지 않을 떄 까지

    //max를 줄이면서 간다면...?

    //[1], [2], [3] => 2
    //[1, 2], [2], [3] => 1

    fun minimize(numbers: List<Int>, otherNumbers: List<Int>, theOtherNumbers: List<Int>): Int {
        var numberIndex = 0
        var otherNumberIndex = 0
        var theOtherNumberIndex = 0
        var minimizeMax = 0

        while (numberIndex <= numbers.lastIndex && otherNumberIndex <= otherNumbers.lastIndex && theOtherNumberIndex <= theOtherNumbers.lastIndex) {
            val number = numbers[numberIndex]
            val otherNumber = otherNumbers[otherNumberIndex]
            val theOtherNumber = theOtherNumbers[theOtherNumberIndex]

            val minNumber = minOf(number, otherNumber, theOtherNumber)
            val maxNumber = maxOf(number, otherNumber, theOtherNumber)

            minimizeMax = maxNumber - minNumber

            when (minNumber) {
                number -> numberIndex += 1
                otherNumber -> otherNumberIndex += 1
                theOtherNumber -> theOtherNumberIndex += 1
            }
        }

        return minimizeMax
    }

    fun minimize_2(numbers: List<Int>, otherNumbers:List<Int>, theOtherNumbers: List<Int>): Int {
        var numberIndex = numbers.lastIndex
        var otherNumberIndex = otherNumbers.lastIndex
        var theOtherNumberIndex = theOtherNumbers.lastIndex
        var minimizeMax = 0

        while (numberIndex > 0 && otherNumberIndex > 0 && theOtherNumberIndex > 0) {
            val number = numbers[numberIndex]
            val otherNumber = otherNumbers[otherNumberIndex]
            val theOtherNumber = theOtherNumbers[theOtherNumberIndex]

            val minNumber = minOf(number, otherNumber, theOtherNumber)
            val maxNumber = maxOf(number, otherNumber, theOtherNumber)

            minimizeMax = maxNumber - minNumber

            when (maxNumber) {
                number -> numberIndex -= 1
                otherNumber -> otherNumberIndex -= 1
                theOtherNumber -> theOtherNumberIndex -= 1
            }
        }

        return minimizeMax
    }
}
