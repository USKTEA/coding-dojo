class Solution {
    //[1, 1, 1, 2] -> [1, 1, 2], 3
    //정렬되어 있는 정수형 배열이 주어졌을 때 각 요소가 최대 2회 출현하도록 주어진 배열을 조작하고, 조작된 배열의 길이를 반환해라
    //상수 메모리 공간을 사용해야 한다
    fun removeDuplicates(numbers: ArrayList<Int>): Int {
        var currentIndex = 0
        var appeared = 0
        var previousNumber: Int? = null

        while (currentIndex <= numbers.lastIndex) {
            var currentNumber = numbers[currentIndex]

            if (currentNumber != previousNumber) {
                previousNumber = currentNumber
                currentIndex += 1
                appeared = 1

                continue
            }

            while (currentNumber == previousNumber) {
                if (appeared < 2) {
                    appeared += 1
                    currentIndex += 1

                    if (currentIndex > numbers.lastIndex) {
                        break
                    }

                    previousNumber = currentNumber
                    currentNumber = numbers[currentIndex]

                    continue
                }

                numbers.removeAt(currentIndex)

                if (currentIndex > numbers.lastIndex) {
                    break
                }

                previousNumber = currentNumber
                currentNumber = numbers[currentIndex]
            }
        }

        return numbers.size
    }
}
