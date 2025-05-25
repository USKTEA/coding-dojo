class Solution {
    //words를 순회
    //visit 시작
    //위치가 words를 벗어났다면 return
    //벗어나지 않았다면 word를 사전순으로 정렬
    //stirngBUilder += c
    //visit index + 1
    //remove stringbuilder last
    fun specialStrings(words: ArrayList<String>): ArrayList<String> {
        val sortedWords = words.map { it.toList().sorted() }
        val result = ArrayList<String>()
        val newWord = StringBuilder()

        fun backTracking(index: Int) {
            if (index >= words.size) {
                result.add(newWord.toString())
                return
            }

            sortedWords[index].forEach {
                newWord.append(it)
                backTracking(index + 1)
                newWord.deleteCharAt(newWord.length - 1)
            }
        }

        backTracking(index = 0)

        return result
    }
}
