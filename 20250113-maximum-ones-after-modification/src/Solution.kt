import kotlin.math.max

class Solution {
    //[1, 0 ,0 , 1, 1, 0, 1], 1 => 4
    //0과 1이 들어있는 정수형 배열 bits와 0을 1로 변경할 수 있는 횟수를 나타내는 maximumZeroCounts가 주어졌을 때
    //최대 maximumZeroCounts 만큼 0을 1로 변경했을 때 만들 수 있는 가강 긴 1 부분배열의 길이를 반환해라

    fun solve(bits: ArrayList<Int>, maximumZeroCounts: Int): Int {
        var left = 0
        var maximumOneCount = 0

        while (left <= bits.lastIndex) {
            var right = left
            var currentZeros = 0

            while (currentZeros <= maximumZeroCounts) {
                if (right == bits.lastIndex) {
                    return max(maximumOneCount, (right - left) + 1)
                }

                if (currentZeros == maximumZeroCounts && bits[right] == 0) {
                    break
                }

                if (bits[right] == 0) {
                    currentZeros += 1
                }

                right += 1
            }

            maximumOneCount = max(maximumOneCount, right - left)

            while (currentZeros == maximumZeroCounts) {
                if (bits[left] == 0) {
                    currentZeros -= 1
                }

                left += 1
            }
        }

        return maximumOneCount
    }
}
