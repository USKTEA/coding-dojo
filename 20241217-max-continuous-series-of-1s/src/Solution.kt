import kotlin.math.max

class Solution {
    //[1, 1, 0, 1, 1, 0, 0, 1, 1, 1], 1 => [0, 1, 2, 3, 4]
    //0과 1이 담긴 비트 배열과 최대 수용할 수 있는 0의 갯수가 주어졌을 때
    //가장 긴 1의 갯수를 가진 부분배열이 차지하는 인덱스를 반환해라
    //만약 두 부분 배열의 갯수가 동일하다면 startIndex가 낮은 부분 배열을 반환한다
    //right <= bits.lastIndex 까지 반복한다
    //if bits[right] == 1라면 ones += 1
    //if bits[right] == 1라면 zeros += 1
    //if (zeros > maxZeroCount) {
    //val bit = bits[left]
    //if bit == 0 { zeros -= 1} left += 1
    //if (one = maxOnes) { result = [left .. right]}
    //right += 1
    fun maxone(bits: ArrayList<Int>, maxZeroCount: Int): ArrayList<Int> {
        var right = 0
        var left = 0
        var ones = 0
        var zeros = 0
        var maxOnes = 0
        var result: Pair<Int, Int> = Pair(0, 0)

        while (right <= bits.lastIndex) {
            val rightBit = bits[right]

            if (rightBit == 1) {
                ones += 1
            }

            if (rightBit == 0) {
                zeros += 1
            }

            while (zeros > maxZeroCount) {
                val leftBit = bits[left]

                if (leftBit == 0) {
                    zeros -= 1
                }

                if (leftBit == 1) {
                    ones -= 1
                }

                left += 1
            }

            if (ones + zeros > maxOnes) {
                maxOnes = ones + zeros
                result = Pair(left, right)
            }

            right += 1
        }

        return ArrayList((result.first..result.second).map { it })
    }
}
