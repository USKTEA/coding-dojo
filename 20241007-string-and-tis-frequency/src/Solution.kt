class Solution {
    //letters를 하나씩 순회를 한다.
    //letter이걸 hashMap에 조회를 하고 없다면 1을 넣어주고 있다면 기존 값에 1을 더해
    //hashMap을 keyValue값을 문자열로 반환하면 된다
    fun solve(letters: String): String {
        return letters.fold(mutableMapOf<String, Int>()) { acc, letter ->
            acc[letter.toString()] = acc.getOrDefault(letter.toString(), 0) + 1
            acc
        }.entries.joinToString("") {
            it.key + it.value
        }
    }
}
