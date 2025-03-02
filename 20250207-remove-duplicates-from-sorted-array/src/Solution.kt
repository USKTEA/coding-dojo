class Solution {
    //중복된 숫자가 들어있는 정수형 배열 numbers가 주어졌을 때 중복되지 않은 숫자들의 갯수를 구해라
    //readIndex = 1, writeIndex = 0
    //while (readIndex <= numbers.lastIndex) {
    // val readIndexNumber = numbers[readIndex]
    // val writeIndexNumber = numbers[writeIndex]
    // when (readIndexNumber == writeIndexNumber) {
    //  true -> {
    //  readIndex += 1;
    //  }
    //  false -> {
    //  writeIndex += 1
    // numbers[writeIndex] = readIndexNumber
    // readIndex += 1
    //  }
    // }
    // }
    // writeIndex + 1
    fun removeDuplicates(numbers: ArrayList<Int>): Int {
        if (numbers.size < 2) {
            return 1
        }

        var writeIndex = 0
        var readIndex = 1

        while (readIndex <= numbers.lastIndex) {
            val writeIndexNumber = numbers[writeIndex]
            val readIndexNumber = numbers[readIndex]

            when (writeIndexNumber == readIndexNumber) {
                true -> {
                    readIndex += 1
                }
                false -> {
                    writeIndex += 1
                    numbers[writeIndex] = readIndexNumber
                    readIndex += 1
                }
            }
        }

        return writeIndex + 1
    }
}
