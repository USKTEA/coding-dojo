class Solution {
    //a => a
    //bb => bb
    //abba => abba
    //babad => bab // aba
    //cbbd => bb
    //for(i:Int in s.indices) for(j: Int in i .. s.size - 1) {
    // if(isPalidrome(s.slice(i, j)) { if (s.slice(i, j).size > palidrome) { palidrome = s.slice(i, j)})} }
    //cache(Pair(s[i], i), palidrome) { return }
    fun longestPalindrome(s: String): String {
        var longestPalindrome = ""
        for (i: Int in s.indices) {
            for (j: Int in i..<s.length) {
                val sliced = s.slice(i..j)

                if(isPalindrome(sliced)) {
                    if(sliced.length > longestPalindrome.length) {
                        longestPalindrome = sliced
                    }
                }
            }
        }

        return longestPalindrome
    }

    fun isPalindrome(word: String): Boolean {
        var left = 0
        var right = word.length - 1

        while (left < right) {
            if (word[left] != word[right]) {
                return false
            }

            left += 1
            right -= 1
        }

        return true
    }
}
