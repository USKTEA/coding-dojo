class Solution {
    // 1 => 1
    // 1
    // 2 => 2
    // 1+1, 2
    // 3 => 3
    // 1+1+1, 1+2, 2+1
    // add(current, 1), add(current, 2)
    // if (sum == n) return 1 else 0
    //

    fun climbStairs(n: Int): Int {
        // climb 함수에 memo 배열을 전달하여 중복 계산을 피함
        val memo = IntArray(n + 1) { -1 }

        return climb(current = 0, top = n, stair = 1, memo) + climb(current = 0, top = n, stair = 2, memo)
    }

    fun climb(current: Int, top: Int, stair: Int, memo: IntArray): Int {
        val climbed = current + stair

        // 목표에 도달한 경우 1을 반환
        if (climbed == top) {
            return 1
        }

        // 목표를 넘어간 경우 0을 반환
        if (climbed > top) {
            return 0
        }

        // 이미 계산한 값이 있다면 이를 반환
        if (memo[climbed] != -1) {
            return memo[climbed]
        }


        // 현재 위치에서 1계단 또는 2계단씩 올라가는 경우의 수를 계산하여 누적
        val result = climb(current = climbed, top = top, stair = 1, memo) + climb(current = climbed, top = top, stair = 2, memo)

        // 결과를 memo 배열에 저장하고 반환
        memo[climbed] = result

        return result
    }
}
