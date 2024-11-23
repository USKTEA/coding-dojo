class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.length > haystack.length) {
            return -1
        }

        val lps = calculateLps(needle)

        var hayStackIndex = 0
        var needleIndex = 0

        while (hayStackIndex < haystack.length) {
            if (haystack[hayStackIndex] == needle[needleIndex]) {
                needleIndex += 1
                hayStackIndex += 1

                if (needleIndex == needle.length) {
                    return hayStackIndex - needleIndex
                }

                continue
            }

            if (needleIndex != 0) {
                needleIndex = lps[needleIndex - 1]

                continue
            }

            hayStackIndex += 1
        }

        return -1
    }

    private fun calculateLps(needle: String): IntArray {
        val lps = IntArray(needle.length) { 0 }
        var matched = 0
        var index = 1

        while (index < needle.length) {
            if (needle[index] == needle[matched]) {
                lps[index] = matched + 1
                matched += 1
                index += 1

                continue
            }

            if (matched != 0) {
                matched = lps[index - 1]

                continue
            }
            lps[index] = 0
            index += 1
        }

        return lps
    }
}
