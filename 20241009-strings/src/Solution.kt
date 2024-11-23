class Solution {
    fun vowelsAndConsonants(letters: String): Int {
        var vowels = 0
        var consonants = 0
        var result = 0
        val mod = 1000000007

        for (letter in letters) {
            if (isVowel(letter)) {
                result = (result + consonants) % mod
                vowels += 1

                continue
            }

            result = (result + vowels) % mod
            consonants += 1
        }

        return result
    }

    private fun isVowel(letter: Char): Boolean {
        return letter in listOf('a', 'e', 'i', 'o', 'u')
    }

    fun solve(A: String, B: Int): String {
        var ans = ""
        var i = 0
        while (i < A.length) {
            var j = i + 1
            while (j < A.length && A[j] == A[i]) {
                j++
            }

            if (j - i != B) {
                ans += A.substring(i, j)
            }

            i = j
        }
        return ans
    }
}
