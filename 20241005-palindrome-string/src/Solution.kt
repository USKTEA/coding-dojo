class Solution {
    //문자열이 주어진다
    //문자는 대소문자를 구분하지 않고 영문,숫자가 아닌 다른 공백과 특수문자는 제외한다.
    //왼쪽은 0, 오른쪽은 stirng 마지막 인덱스에서 시작한다
    //만약 왼쪽 문자와 오른쪽 문자가 같다면 왼쪽 +1, 오른쪽 -1
    //왼쪽 <= 오른쪽이 될 때 까지 지속한다

    fun isPalindrome(string: String): Int {
        val parsed = parse(string)

        var left = 0
        var right = parsed.lastIndex

        while (left <= right) {
            if (parsed[left] != parsed[right]) {
                return 0
            }

            left += 1
            right -= 1
        }

        return 1
    }

    fun parse(string: String): String {
        return string
            .filter(filterNotAlphaNumeric())
            .map(toLowercase())
            .joinToString("")
    }

    private fun filterNotAlphaNumeric(): (Char) -> Boolean {
        return { character ->
            character in 'a'..'z' || character in 'A'..'Z' || character in '0'..'9'
        }
    }

    private fun toLowercase(): (Char) -> Char {
        return { character -> character.lowercaseChar() }
    }
}
