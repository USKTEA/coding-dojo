class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val lps = getLps(needle)
        var haystackIndex = 0
        var needleIndex = 0

        while (haystackIndex < haystack.length) {
            if (haystack[haystackIndex] == needle[needleIndex]) {
                haystackIndex += 1
                needleIndex += 1

                if (needleIndex == needle.length) {
                    return haystackIndex - needleIndex
                }

                continue
            }

            if (lps[needleIndex] != 0) {
                needleIndex = lps[needleIndex - 1]

                continue
            }

            haystackIndex += 1
        }
        return -1
    }

    fun getLps(needle: String): IntArray {
        val lps = IntArray(needle.length) { 0 }
        var lpsCount = 0
        var index = 1

        while (index < needle.length) {
            if (needle[index] == needle[lpsCount]) {
                lpsCount += 1
                lps[index] = lpsCount
                index += 1

                continue
            }

            if (lpsCount != 0) {
                lpsCount = lps[lpsCount - 1]

                continue
            }

            lps[index] = 0
            index += 1
        }

        return lps
    }
}
