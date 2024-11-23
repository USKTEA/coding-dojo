class Solution {
    //문자열이 주어지고 amazing substring을 구하라
    //amazing substring 모음으로 시작하는 부분 문자열이다
    //모음을 만나면 +1 그리고 다음 문자로 넘어가면 모음의 갯수만큼 더해
    //다음 모음을 만나면 +1 그리고 다음 문자로 넘어가
    //자음을 만나면 그냥 모음의 갯수만큼 더해
    //마지막으로 10003 나눠
    fun solve(letters: String): Int {
        var vowels = 0
        var amazingSubStrings = 0
        val vowelChars = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        for (letter in letters) {
            if (letter in vowelChars) {
                vowels += 1
            }

            amazingSubStrings += vowels
        }

        return amazingSubStrings % 10003
    }
}
