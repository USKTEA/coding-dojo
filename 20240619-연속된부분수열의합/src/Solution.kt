class Solution {
    fun solution(sequence: IntArray, k: Int): IntArray {
        var right = 0
        var left  = 0
        var result = intArrayOf(-1, -1)
        var current = 0

        while (right < sequence.size) {
            // 현재 값을 현재 합에 추가
            current += sequence[right]

            // 현재 합이 k보다 크면, left를 움직이며 현재 합을 줄임
            while (current > k && left <= right) {
                current -= sequence[left]
                left += 1
            }

            // 현재 합이 k와 같으면, 결과를 갱신
            if (current == k) {
                if (result[0] == -1 || right - left < result[1] - result[0]) {
                    result = intArrayOf(left, right)
                }
            }

            // right를 움직여 다음 요소로 진행
            right += 1
        }

        return result
    }
}
