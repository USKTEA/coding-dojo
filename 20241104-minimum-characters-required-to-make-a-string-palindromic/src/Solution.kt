class Solution {
    fun solve(letters: String): Int {
        val reversedLettersCombined = letters + "#" + letters.reversed()
        val lps = Array(reversedLettersCombined.length) { 0 }
        var combinedLettersIndex = 1
        var lpsLength = 0

        while (combinedLettersIndex < reversedLettersCombined.length) {
            if (reversedLettersCombined[combinedLettersIndex] == reversedLettersCombined[lpsLength]) {
                lpsLength += 1
                lps[combinedLettersIndex] = lpsLength
                combinedLettersIndex++

                continue
            }

            if (reversedLettersCombined[combinedLettersIndex] != reversedLettersCombined[lpsLength]) {
                if (lpsLength != 0) {
                    lpsLength = lps[lpsLength - 1]

                    continue
                }

                lps[combinedLettersIndex] = 0
                combinedLettersIndex += 1
            }
        }

        return letters.length - lps.last()
    }
}
