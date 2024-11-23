class Solution {
    fun solve(letters: String): Int {
        val reversed = letters.reversed()
        val combined = "$reversed#$letters"
        val lps = IntArray(combined.length) { 0 }
        var lpsCount = 0
        var index = 1

        while (index < combined.length) {
            if (combined[index] == combined[lpsCount]) {
                lpsCount += 1
                lps[index] = lpsCount
                index += 1

                continue
            }

            if (lpsCount != 0) {
                lpsCount = lps[lpsCount - 1]

                continue
            }

            index += 1
        }

        return letters.length - lps.last()
    }
}
