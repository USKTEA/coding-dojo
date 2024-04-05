class Solution {
    // a => true
    // ab => true
    // aa => true
    // abb => true
    // aba => true
    // abca => true
    // abc => false
    // left = 0, right = s.lastIndex
    // if (s[left] == s[right]) left =+ 1, right -= 1
    // while left < right
    // if s[left] != s[right] count - 1
    // if count < 0 return false
    fun validPalindrome(s: String, count: Int = 1): Boolean {
        var left = 0
        var right = s.length - 1
        var result = true

        if (count == -1) {
            return false
        }

        while (left < right) {
            if (s[left] == s[right]) {
                left += 1
                right -= 1

                continue
            }


            result = validPalindrome(s.slice(left + 1..right), count - 1)
                    || validPalindrome(s.slice(left..<right), count - 1)

            break
        }

        return result
    }
}
