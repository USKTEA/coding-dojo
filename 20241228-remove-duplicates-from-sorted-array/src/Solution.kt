class Solution {
    //[1, 1, 2] => [1, 2, 0]
    //정렬되어 있는 정수형 배열 numbers가 주어졌을 때 numbers의 고유한 정수의 갯수를 반환하고
    //numbers에는 고유한 정수가 연결되도록 반환해라.

    //numbers를 index로 순회한다
    //현재 넘버는 numbers[index]
    //while (currentNumber == nextNumber) {
    // numbers.addLast(0), numbers.removeAt()
    // }
    // index += 1
    //
    fun removeDuplicates(numbers: ArrayList<Int>): Int {
        if (numbers.isEmpty()) {
            return 0
        }

        var uniqueIndex = 0

        for (i in 1 until numbers.size) {
            if (numbers[i] != numbers[uniqueIndex]) {
                uniqueIndex++
                numbers[uniqueIndex] = numbers[i]
            }
        }

        return uniqueIndex + 1
    }
}
