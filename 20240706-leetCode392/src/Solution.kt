class Solution {
    //abc, ahbgdc => true
    //axc, ahbgdc => false
    //a, '' => false
    //a, a => true
    //a, ab => true
    //ab, ac => false
    //ac, ac => true
    fun isSubsequence(word: String, otherWord: String): Boolean {
        if (word.isEmpty()) {
            return false
        }

        if (word.length > otherWord.length) {
            return false
        }

        var toMatch = word[0]
        var matched = 0

        for (letter in otherWord) {
            if (letter == toMatch) {
                matched += 1

                if (matched == word.length) {
                    return true
                }

                toMatch = word[matched]
            }
        }

        return false
    }
}
