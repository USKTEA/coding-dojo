class Solution {
    fun solve(a: ArrayList<Int>): Int {
        val result = a.fold(Result.default) { acc: Result, i: Int ->
            acc.next(i)
        }

        return result.sum
    }
}

data class Result(
    val min: Int,
    val max: Int,
) {

    val sum: Int
        get() = max + min

    fun next(number: Int) : Result {
        if (min == 0 && max == 0) {
            return Result(number, number)
        }

        if (min > number) {
            return Result(number, max)
        }

        if (max < number) {
            return Result(min, number)
        }

        return this
    }

    companion object {
        val default: Result = Result(min = 0, max = 0)
    }
}
