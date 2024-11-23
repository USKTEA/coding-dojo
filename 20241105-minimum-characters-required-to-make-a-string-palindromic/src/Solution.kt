class Solution {
    fun solve(letters: String): Int {
        val reversedLetterCombined = letters + "#" + letters.reversed()
        val lps = IntArray(reversedLetterCombined.length) { 0 }
        var lpsLength = 0
        var index = 1

        while (index < reversedLetterCombined.length) {
            if (reversedLetterCombined[index] == reversedLetterCombined[lpsLength]) {
                lpsLength += 1
                lps[index] = lpsLength
                index +=1

                continue
            }

            if (lpsLength != 0) {
                lpsLength = lps[lpsLength - 1]

                continue
            }

            index += 1
        }

        return letters.length - lps.last()
    }
}
