class Solution {
    //정수형 배열 nums가 주어졌을 때 answer[i]는 number[0 < i] * number[i < nums.lastIndex] 인 값이 나타나게 함수를 구현하라
    //nums 요쇼의 곱은 정수를 초과하지 않는다.
    //o(n)의 시간복잡도와 나눗셈을 사용하면 안된다.
    //[1, 2, 3, 4] -> [24, 12, 8, 6]

    //num 배열을 우측 부터 계산한 multiplyAsc, multiplyDesc 로 만든다
    //multiplyDesc = [num[i] * ..num[num.lastIndex], num[i + 1]...]
    //multiplyAsc = [num[i]], num[i] * num[i + 1]....]
    //nums.mapIndexed { index, _, ->
    //multiplyDesc[index + 1] * multiplyAsc[index - 1]
    //만약 index -1 < 0 = 1
    //만약 index + 1 > nums.lastIndex = 1
    // }
    fun productExceptSelf(nums: IntArray): IntArray {
        val multiplyDesc = multiplyDesc(nums)
        val multiplyAsc = multiplyAsc(nums)
        val result = IntArray(nums.size)

        (0..nums.lastIndex).forEach { index ->
            val left = getLeft(index, multiplyAsc)
            val right = getRight(index, multiplyDesc)

            result[index] = left * right
        }

        return result
    }

    fun getLeft(index: Int, multiples: IntArray): Int {
        if (index == 0) {
            return 1
        }

        return multiples[index - 1]
    }

    fun getRight(index: Int, multiples: IntArray): Int {
        if (index == multiples.lastIndex) {
            return 1
        }

        return multiples[index + 1]
    }

    fun multiplyDesc(nums: IntArray): IntArray {
        var accumulator = 1
        val result = IntArray(nums.size)

        (nums.lastIndex downTo 0).forEach { i ->
            accumulator *= nums[i]
            result[i] = accumulator
        }

        return result
    }

    fun multiplyAsc(nums: IntArray): IntArray {
        var accumulator = 1
        val result = IntArray(nums.size)

        (0..nums.lastIndex).forEach { i ->
            accumulator *= nums[i]
            result[i] = accumulator
        }

        return result
    }
}
