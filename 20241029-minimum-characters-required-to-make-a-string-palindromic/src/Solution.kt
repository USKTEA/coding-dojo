class Solution {
    fun solve(letters: String): Int {
        val suffixAndPrefix = letters + "#" + letters.reversed()
        val lps = Array(suffixAndPrefix.length) { 0 }
        var suffixLength = 0
        var index = 1

        while (index < suffixAndPrefix.length) {
            if (suffixAndPrefix[suffixLength] == suffixAndPrefix[index]) {
                suffixLength += 1
                lps[index] = suffixLength
                index += 1

                continue
            }

            if (suffixAndPrefix[suffixLength] != suffixAndPrefix[index]) {
                if (suffixLength != 0) {
                    suffixLength = lps[suffixLength - 1]
                    continue
                }

                lps[index] = 0;
                index += 1
            }
        }

        return letters.length - lps.last()
    }
}
