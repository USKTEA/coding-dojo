class Solution {
    fun solve(letters: String): Int {
        val reversedLetterCombined = letters + "#" + letters.reversed()
        val lps = IntArray(reversedLetterCombined.length) { 0 }
        var lpsCount = 0
        var index = 1

        while (index < reversedLetterCombined.length) {
            if (reversedLetterCombined[index] == reversedLetterCombined[lpsCount]) {
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
