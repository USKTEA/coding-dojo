class Solution {
    //파라미터로 문자열 characters가 들어왔을 때 순서대로 characters를 순회하면서 첫 번째 중복되지 않은 character를 이용해 조합한 문자열을 만들어 반환해라
    //만약 중복되지 않은 문자가 없다면 #으로 변환한다
    //a -> a
    //aa -> a#
    //ab -> aa
    //aba -> aab
    //워하는게 뭐야?
    //문자를 넣었을 때, 가장 오래전에 삽입되었고 현재까지 중복되게 사용되지 않은 문자를 반환하는 함수
    //abadbc
    private val queue = ArrayDeque<Char>()
    private val result = mutableListOf<Char>()
    private val founded = mutableSetOf<Char>()

    fun solve(characters: String): String {
        characters.forEach { character ->
            val isFirst = founded.add(character)

            if (isFirst) {
                queue.addLast(character)
                result.add(queue.first())

                return@forEach
            }

            queue.removeFirst()

            if (queue.isEmpty()) {
                result.add('#')

                return@forEach
            }

            result.add(queue.first())
        }

        return result.joinToString("")
    }
}
