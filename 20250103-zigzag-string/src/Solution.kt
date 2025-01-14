class Solution {
    //PAYPALISHIRING, 3 => PAHNAPLSIIGYIR
    //문자열과 문자열을 담는 2차원 배열이 주어졌을 때 2차원 배열의 배열에 문자를 하나씩 순서대로 넣고 합친 결과를 반환한다
    //2차원 배열을 만든다
    //word를 순회하면서 하나씩 2차원 배열에 집어넣는다
    //순서는 0부터 시작하고 마지막 index까지 도달했다면 -1, 0이라면 +1
    //합친 결과를 반환한다
    fun convert(word: String, row: Int): String {
        val zigZagList = ZigZagList.withSize(row)

        zigZagList.addAll(word.toList())

        return zigZagList.joinToString("")
    }
}

data class ZigZagList(
    private val list: MutableList<String>,
) : MutableList<String> by list {
    private var pointer = 0
    private var direction = Direction.DOWN

    val elements: MutableList<String>
        get() = list

    fun addAll(elements: List<Char>) {
        for (element in elements) {
            this.add(element.toString())
        }
    }

    override fun add(element: String): Boolean {
        if (list.size <= 1) {
            list[pointer] = list[pointer] + element

            return true
        }

        list[pointer] = list[pointer] + element

        when (direction) {
            Direction.DOWN -> {
                when (pointer == lastIndex) {
                    true -> {
                        direction = Direction.UP
                        pointer -= 1
                    }
                    false -> {
                        pointer += 1

                    }
                }
            }
            Direction.UP -> {
                when (pointer == 0) {
                    true -> {
                        direction = Direction.DOWN
                        pointer += 1
                    }
                    false -> {
                        pointer -= 1
                    }
                }
            }
        }

        return true
    }

    enum class Direction {
        DOWN, UP
    }

    companion object {
        fun withSize(row: Int): ZigZagList {
            return ZigZagList(
                list = MutableList(row) { "" }
            )
        }
    }
}
