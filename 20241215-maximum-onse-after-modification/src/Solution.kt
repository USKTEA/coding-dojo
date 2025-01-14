import kotlin.math.max

class Solution {
    //[1, 0, 0, 1, 1, 0, 1], 1 => 4
    //0과 1이 들어있는 정수형 배열 bits와 최대 0을 1로 변경할 수 있는 횟수 maximumZeroCounts가 주어졌을 때
    //최대 maximumZeroCounts만큼 0을 1로 변경했을 때의 최대 1로 이루어진 조각의 길이를 구하라
    //left = 0, rights = 0 //left <= bits.lastIndex, right <= bits.lastIndex
    //if (bits[right] == 0) ones += 1
    //while (ones > maximumZeroCounts)
    //if bits[left] == 0 maximumZeroCount -= 1
    //left += 1
    //result = max(max, right - left + 1)
    //result
    fun solve(bits: ArrayList<Int>, maximumZeroCounts: Int): Int {
        var right = 0
        var left = 0
        var ones = 0
        var result = 0

        while (right <= bits.lastIndex) {
            if (bits[right] == 0) {
                ones += 1
            }

            while (ones > maximumZeroCounts) {
                if (bits[left] == 0) {
                    ones -= 1
                }

                left += 1
            }

            result = max(result, right - left  +1)
            right += 1
        }

        return result
    }
}
