class Solution {
    //[3, 2, 1, 5, 6, 4], 2 => 5
    //[3, 2, 3, 1, 2, 4, 5, 5, 6], 4 => 4
    //[0], 1 => 0
    //[1, 0], 2 => 0
    //[1, 2, 3], 3 => 3
    //숫자 순회
    //숫자를 어딘가에 집어넣어
    //집어넣는 어딘가는 사이즈가 k다
    //어딘가의 숫자와 비교해서 크다면 앞으로 넣고
    //작다면 뒤로 넣고
    //만약 사이즈가 k와 같다면 가장 작은 것을 (마지막 것을 제거하고 넣는다 어디에?
    //순서대로
    //마지막 값을 반환한다
    fun findKthLargest(nums: IntArray, k: Int): Int {
//
//        val ranking = Ranking(k)
//
//        nums.forEach { ranking.add(it) }
//
//        return ranking.at(k)
        val sort = QuickSort()
        val sorted = sort.process(nums)

        println(sorted.toList())
        return sorted[sorted.size - k]
    }
}

class Ranking(
    private val size: Int,
    private val numbers: MutableList<Int> = mutableListOf(),
    private val cache: MutableMap<Int, Int> = mutableMapOf(),
) {
    fun add(adden: Int) {
        if (numbers.size == 0) {
            numbers.add(adden)

            return
        }

        if (cache.contains(adden) && numbers.contains(adden)) {
            val index = numbers.indexOf(adden)
            numbers.add(index + 1, adden)
            cache[adden] = index + 1

            if (numbers.size > size) {
                numbers.removeLast()
            }

            return
        }

        for (i: Int in numbers.indices) {
            if (adden >= numbers[i]) {
                numbers.add(i, adden)
                cache[adden] = i

                if (numbers.size > size) {
                    numbers.removeLast()
                }

                return
            }
        }

        numbers.add(adden)
        cache[adden] = numbers.size - 1

        if (numbers.size > size) {
            numbers.removeLast()
        }
    }

    fun numbers(): MutableList<Int> {
        return numbers
    }

    fun at(k: Int): Int {
        return numbers[k - 1]
    }
}
