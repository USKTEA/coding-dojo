class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val lps = calculateLps(needle)
        var hayStackIndex = 0
        var needleIndex = 0

        while (hayStackIndex < haystack.length) {
            if (haystack[hayStackIndex] == needle[needleIndex]) {  // needleIndex 범위 체크 추가
                hayStackIndex += 1
                needleIndex += 1

                if (needleIndex == needle.length) {
                    return hayStackIndex - needleIndex
                }

                continue
            }
            if (lps[needleIndex] != 0) {
                needleIndex = lps[needleIndex - 1]

                continue
            }

            hayStackIndex += 1
        }

        return -1
    }

    fun calculateLps(needle: String): IntArray {
        val lps = IntArray(needle.length) { 0 }
        var lpsLength = 0
        var index = 1

        while (index < needle.length) {
            if (needle[index] == needle[lpsLength]) {
                lpsLength += 1
                lps[index] = lpsLength
                index += 1
                continue
            }

            if (lpsLength != 0) {
                lpsLength = lps[lpsLength - 1]

                continue
            }

            index += 1
            lps[lpsLength] = 0
        }

        return lps
    }
}
