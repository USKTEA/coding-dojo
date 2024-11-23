class Solution {

    //XOR => 1 xor 1 => 0
    //요소가 모든 subarray에 등장하는 횟수
    //(i + 1) * (N - i)
    //(i + 1)는 왼쪽 (N - i)는 오른쪽
    //1 * 3 => 3
    //[3, 4, 5], 3일 경우 [3], [3, 4], [3, 4, 5]
    //4일 경우 => [4], [3, 4], [4, 5], [3, 4, 5]
    //(i + 1) + (N - i) = N + 1
    fun solve(numbers: ArrayList<Int>): Int {
        if (numbers.size % 2 == 0) {
            return 0
        }

        var result = 0

        for (i in 0..numbers.lastIndex step 2) {
            result = result xor numbers[i]
        }

        return result
    }
}
