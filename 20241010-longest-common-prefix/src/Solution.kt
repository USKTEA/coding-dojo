class Solution {

    //문자열 배열이 주어지고
    //longestCommonPrefix를 구하면 된다.
    //첫 logestCommonPrefix는 words[0]
    //이후 배열을 순회하면서 배열 요소의 첫 character 부터 끝까지 logestCommonPrefix와 일치하는지 확인
    //다르다면 다른 곳까지 substring
    //만약 logestCommonPrefix가 ""가 되었다면 바로 반환
    fun longestCommonPrefix(words: ArrayList<String>): String {
        val result = words[0]

        return words.fold(result) { result, word ->
            result.forEachIndexed { index, c ->
                if (index >= word.lastIndex) {
                    return@fold result
                }

                if (word[index] != c) {
                    return@fold result.substring(0, index)
                }
            }

            result
        }
    }
}
