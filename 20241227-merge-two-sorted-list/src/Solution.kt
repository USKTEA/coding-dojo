class Solution {
    //[1, 5, 8], [6, 9] => [1, 5, 6, 8, 9]
    //정렬되어 있는 정수형 배열 numbers와 otherNumbers가 주어졌을 때
    //numbers에 otherNumber의 요소를 정렬 순으로 넣어라
    //numbers를 순회하면서 number가 otherNumber[index] 보다 작거나 같다면 continue
    //number가 otherNumber보다 크다면 numbers.add[otherNumber] index += 1
    //while index <= otherNumbers.lastIndex
    //numbers.add(otherNumbers[index])
    fun merge(numbers: ArrayList<Int>, otherNumbers: ArrayList<Int>) {
        var numberIndex = 0
        var otherNumberIndex = 0

        while (numberIndex <= numbers.lastIndex) {
            var number = numbers[numberIndex]
            var otherNumber = otherNumbers[otherNumberIndex]

            while (number >= otherNumber) {
                numbers.add(numberIndex, otherNumber)
                otherNumberIndex += 1

                number = otherNumber
                otherNumber = otherNumbers[otherNumberIndex]
            }

            numberIndex += 1
        }

        while (otherNumberIndex <= otherNumbers.lastIndex) {
            numbers.add(otherNumbers[otherNumberIndex])
            otherNumberIndex += 1
        }
    }
}
