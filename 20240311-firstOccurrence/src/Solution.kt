class Solution {
    // "a", "a" => 0
    // "a", "b" => -1
    // "a", "ab" => -1
    // "ab", "a" => 0
    // sad, sad => 0
    // sad, sadd => 0
    // leetcode, leeto => -1
    // hello, ll => 2
    fun strStr(haystack: String, needle: String, start: Int = 0, current: Int = 0, word: String = ""): Int {
        if (haystack == needle) {
            return 0
        }

        if (start == haystack.length) {
            return - 1
        }

        val added = word + haystack[current]

        if (added == needle) {
            return start
        }

        if (current == haystack.length - 1) {
            return strStr(haystack, needle, start + 1, start + 1, "")
        }

        return strStr(haystack, needle, start, current + 1, added)
    }
}
