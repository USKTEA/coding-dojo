class Solution {
    //"" => true
    //",.?" => true
    //A man, a plan, a canal: Panama => true
    //race a car => false
    fun isPalindrome(s: String): Boolean {
        val fixedPhrase = fix(s)

        var left = 0
        var right = fixedPhrase.length - 1

        while (left < right) {
            if (fixedPhrase[left] == fixedPhrase[right]) {
                left += 1
                right -= 1

                continue
            }

            return false
        }

        return true
    }

    private fun fix(s: String): String {
        return s.map { char ->
            if (char.isAlphabet()) {
                return@map char.lowercaseChar().toString()
            }

            return@map ""
        }.filter { it.isNotBlank() }
            .joinToString("")
    }
}

private fun Char.isAlphabet(): Boolean {
    return (this.code in 65..90) || (this.code in 97..122) || (this.code in 48..57)
}
