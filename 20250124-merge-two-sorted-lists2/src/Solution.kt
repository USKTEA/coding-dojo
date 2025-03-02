class Solution {
    //[1, 5, 8], [6, 9] => [1, 5, 6, 8, 9]
    //정렬된 정수형 배열 numbers와 otherNumbers가 주어졌을 때
    //numbers에 otherNumbers의 숫자를 정렬에 맞춰서 집어넣는 문제
    //numbers가 빈 배열이라면 numbers.addAll otherNumbers
    //otherNumbers가 빈 배열이라면 끝
    //numbersIndex, otherNumberIndex
    //number[index], otherNumber[index]
    //while numberIndex <= numbers.lastIndex
    //when(number > otherNumber)
    //true -> {numbers[index] = otherNumber, otherNumberIndex += 1}
    //false -> {numbersIndex += 1}
    //if (otherNumbersIndex < otherNumbers.lastIndex) { add.All()}
    fun merge(numbers: ArrayList<Int>, otherNumbers: ArrayList<Int>) {
        if (numbers.isEmpty()) {
            numbers.addAll(otherNumbers)

            return
        }

        if (otherNumbers.isEmpty()) {
            return
        }

        var numbersIndex = 0
        var otherNumbersIndex = 0

        while (numbersIndex <= numbers.lastIndex && otherNumbersIndex <= otherNumbers.lastIndex) {
            val number = numbers[numbersIndex]
            val otherNumber = otherNumbers[otherNumbersIndex]

            when (number >= otherNumber) {
                true -> {
                    numbers.add(numbersIndex, otherNumber)
                    otherNumbersIndex += 1
                }

                false -> {
                    numbersIndex += 1
                }
            }
        }

        if (otherNumbersIndex <= otherNumbers.lastIndex) {
            numbers.addAll(otherNumbers.slice(otherNumbersIndex..otherNumbers.lastIndex))
        }
    }
}
