class Solution {
    //문자열 word와 문자열 배열의 크기 row가 주어졌을 때
    //문자열 word를 배열에 순서대로 집어넣고, 배열의 순서대로 값을 출력한 결과를 반환해라
    //row가 0 또는 1일 때 word를 반환한다
    //row가 1이상이면 row만큼 크기를 가진 문자열 배열을 생성한다
    //word를 순회하면서, 문자열 배열도 같이 순회한다
    //문자열 배열은 0부터 시작하고 마지막 index까지 순회하면 역순으로 0까지 순회한다
    //문자열 배열의 요소를 순서대로 합친 결과를 반환한다
    fun convert(word: String, row: Int): String {
        val basket = WordBasket.withSize(row)

        word.forEach {
            basket.add(it)
        }

        return basket.wordWithIndex()
    }
}

data class WordBasket(
    var words: MutableList<String>,
    var pointer: Int = 0,
    var direction: Direction = Direction.RIGHT
) {
    fun wordWithIndex(): String {
        return words.joinToString("")
    }

    fun add(character: Char) {
        if (words.size <= 1) {
            words[pointer] = words[pointer] + character

            return
        }

        words[pointer] = words[pointer] + character

        if (direction == Direction.RIGHT) {
            pointer += 1
        }

        if (direction == Direction.LEFT) {
            pointer -= 1
        }

        if (pointer == words.lastIndex || pointer == 0) {
            direction = direction.switch()
        }
    }

    enum class Direction {
        RIGHT, LEFT;

        fun switch(): Direction {
            if (this == RIGHT) {
                return LEFT
            }

            return RIGHT
        }
    }

    companion object {
        fun withSize(row: Int): WordBasket {
            if (row <= 1) {
                return WordBasket(MutableList(1) { "" })
            }

            return WordBasket(MutableList(row) { "" })
        }
    }
}
