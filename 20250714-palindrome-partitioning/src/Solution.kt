class Solution {

    //palindrome은 앞뒤로 읽어도 모두 동일한 문자 즉 회문이다.
    //회문은 [index += i] = [lastIndex -= i] while lastIndex > index 까지 비교하는 것으로 알 수 있다.
    //letters의 첫 번째 캐릭터 부터 순회를 한다.
    //현재 문자가 회문이라면 현재까지 문자를 result에 집어넣고, 다음 인덱스 캐릭터를 순회한다. removeLast
    //index가 lastIndex보다 크다먄 종료
    fun partition(letters: String): ArrayList<ArrayList<String>> {
        val answer = mutableListOf<List<String>>()
        val palindromes = mutableListOf<String>()

        fun backTracking(index: Int, current: String) {
            if (index > letters.lastIndex) {
                    answer.add(
                        buildList {
                            addAll(palindromes)
                        }
                    )

                return
            }

            (index..letters.lastIndex).fold("") { acc, currentIndex ->
                val added = current + acc + letters[currentIndex]

                if (isPalindrome(added)) {
                    palindromes.add(added)
                    backTracking(currentIndex + 1, "")
                    palindromes.removeLast()
                }

                acc + letters[currentIndex]
            }
        }

        backTracking(0, "")

        answer.sortWith { o1, o2 ->
            var index = 0

            while (index < o1.lastIndex) {
                val o1Letter = o1[index]
                val o2Letter = o2[index]

                if (o1Letter > o2Letter) {
                    return@sortWith 1
                }

                if (o1Letter < o2Letter) {
                    return@sortWith -1
                }

                index += 1
            }

            0
        }

        return ArrayList(answer.map { ArrayList(it) })
    }

    fun isPalindrome(word: String): Boolean {
        var forward = 0
        var backward = word.lastIndex

        while (backward > forward) {
            val forwardLetter = word[forward]
            val backwardLetter = word[backward]

            if (backwardLetter != forwardLetter) {
                return false
            }

            forward += 1
            backward -= 1
        }

        return true
    }
}
