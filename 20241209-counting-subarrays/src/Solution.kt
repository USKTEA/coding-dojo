class Solution {
    //0보다 큰 정수가 들어있는 numbers 배열과 부분배열의 합의 최대 destination이 주어졌을 때
    //부분 배열의 합이 destination을 초과하지 않는 부분 배열의 갯수를 구하라
    //left right 있을 때
    //left가 numbers의 마지막 요소까지 순회하고
    //rights는 left 부터 시작해서 요소의 합이 destination가 작을 때 까지 right를 증가시킨다
    //요소의 합의 destination 보다 크거나 right가 numbers의 마지막 요소를 초과했다면 중단한다
    //left += 1 right = left가 된다
    fun solve(numbers: ArrayList<Int>, destination: Int): Int {
        var left = 0
        var right = 0
        var sum = 0
        var result = 0

        while (left <= numbers.lastIndex) {
            while (right <= numbers.lastIndex && sum + numbers[right] < destination) {
                sum += numbers[right]
                right += 1
            }

            result += right - left

            when (left < right) {
                true -> sum -= numbers[left]
                false -> right = left + 1
            }

            left += 1
        }

        return result
    }
}
