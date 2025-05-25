class Solution {
    private val opens = listOf('(')
    private val closes = listOf(')')

    fun isValid(brackets: String): Int {
        val stack = ArrayDeque<Char>()

        for (bracket in brackets) {
            when (bracket) {
                in opens -> {
                    stack.addLast(bracket)
                }
                in closes -> {
                    if (stack.isEmpty() || stack.removeLast() != getOpenBracket(bracket)) {
                        return 0
                    }
                }
            }
        }

        if (stack.isNotEmpty()) {
            return 0
        }

        return 1
    }

    private fun getOpenBracket(bracket: Char): Char {
        return when (bracket) {
            ')' -> '('
            else -> throw IllegalArgumentException("Invalid bracket: $bracket")
        }
    }
}
