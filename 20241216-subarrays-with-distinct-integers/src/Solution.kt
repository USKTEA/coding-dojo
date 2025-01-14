class Solution {
    //0보다 큰 정수형 배열 numbers 주어졌을 때 부분 배열이 가진 중복되지 않은 숫자의 수가 distinctNumberCount와 일치할 때
    //해당 부분 배열은 좋은 부분 배열이라고 한다
    //numbers의 좋은 부분 배열의 수를 반환해라
    //[1, 2, 1, 2, 3], 2 => 7
    //특정한 수의 부분 배열은 (특정 수) - (특정 수 -1) 로 얻을 수 있다
    //특정 수의 모든 부분 배열을 구하고, 특정 수 -1의 모든 부분 배열을 구해서 빼면 답이 나온다

    fun solve(numbers: ArrayList<Int>, distinctNumberCount: Int): Int {
        return goodSubArrays(numbers, distinctNumberCount) - goodSubArrays(numbers, distinctNumberCount - 1)
    }

    private fun goodSubArrays(numbers: ArrayList<Int>, distinctNumberCount: Int): Int {
        var right = 0
        var left = 0
        var goodSubArrayCount = 0
        val count = Count()

        while (right <= numbers.lastIndex) {
            count.add(numbers[right])

            while (count.distinctNumber > distinctNumberCount) {
                count.remove(numbers[left])
                left += 1
            }

            goodSubArrayCount += right - left + 1
            right += 1
        }

        return goodSubArrayCount
    }
}

data class Count(
    val numberCount: MutableMap<Int, Int> = mutableMapOf()
) {
    val distinctNumber: Int
        get() = numberCount.keys.size

    fun add(number: Int) {
        val count = numberCount.getOrDefault(number, 0)
        numberCount[number] = count + 1
    }

    fun remove(number: Int) {
        val count = numberCount.getValue(number)

        if (count == 1) {
            numberCount.remove(number)
            return
        }

        numberCount[number] = count - 1
    }
}
