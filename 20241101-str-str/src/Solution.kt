class Solution {
    //haystack에서 처음으로 만나는 needle의 index를 구하라
    //없다면 -1을 반환한다
    fun strStr(haystack: String, needle: String): Int {
        val needleSum = needle.sumOf { it.code }
        var currentHaystackSum = haystack.substring(0, needle.length).sumOf { it.code }

        if (found(needle, haystack, needleSum, currentHaystackSum, 0)) {
            return 0
        }

        oneBasedRepeat(haystack.length - needle.length) { sequence ->
            currentHaystackSum =
                currentHaystackSum - haystack[sequence - 1].code + haystack[sequence - 1 + needle.length].code

            if (found(needle, haystack, needleSum, currentHaystackSum, sequence)) {
                return sequence
            }
        }

        return -1
    }

    private fun found(needle: String, haystack: String, needleSum: Int, currentHaystackSum: Int, index: Int): Boolean {
        return currentHaystackSum == needleSum && haystack.substring(index, index + needle.length) == needle
    }
}

inline fun oneBasedRepeat(number: Int, action: (number: Int) -> Unit) {
    for (i in 1..number) {
        action(i)
    }
}
