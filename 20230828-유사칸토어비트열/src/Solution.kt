class Solution {
    fun solution(n: Int, left: Long, right: Long): Int {
        return Cantor(n)
            .slice(left, right)
            .count('1')
    }
}

data class Cantor(
    val number: Int
) {
    private val exchange = mapOf('0' to "00000", '1' to "11011")
    private var bitArray: String = "1"

    init {
        repeat(number) {
            val stringBuilder = StringBuilder()

            bitArray.forEach { stringBuilder.append(exchange[it]) }

            this.bitArray = stringBuilder.toString()
        }
    }

    fun bitArray(): String {
        return bitArray
    }

    fun slice(left: Long, right: Long): Cantor {
        this.bitArray = this.bitArray.filterIndexed { index: Int, c: Char ->
            if (index >= left - 1 && index < right) {
                return@filterIndexed true
            }

            false
        }

        return this
    }

    fun count(bit: Char): Int {
        return this.bitArray.count { it == bit }
    }
}
