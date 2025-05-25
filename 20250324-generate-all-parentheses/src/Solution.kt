import java.util.Stack


class Solution {
    //()[]{} 괄호만 들어있는 문자열이 주어졌을 때 괄호들이 올바른 순서로 열리고 닫혔는지 검증하고 올바르다면 1 올바르지 않다면 0을 반환해라
    //괄호는 무조건 여는 괄호가 있어야 닫는 괄호가 있을 수 있고 닫는 괄호는 바로 여는 괄호 뒤에 있어야 한다
    //Stack
    //characters.fold(stack) {
    // if (character.is 열림) {
    // stack.add 열림괄호
    // }
    // if (charcter.is 닫힘) {
    // if stack is empty return 0
    // if stack.peek is not 그거 닫힘 return 0
    // }
    // return 1
    // }
    fun isValid(characters: String): Int {
        val open = listOf('(', '{', '[')
        val close = listOf(')', '}', ']')
        val deque = ArrayDeque<Char>()

        for (character in characters) {
            if (character in open) {
                deque.addLast(character)
            }

            if (character in close) {
                if (deque.isEmpty()) {
                    return 0
                }

                if (deque.last() != character.matchingOpenBracket()) {
                    return 0
                }

                deque.removeLast()
            }
        }

        if (deque.isNotEmpty()) {
            return 0
        }

        return 1
    }
}

private fun Char.matchingOpenBracket(): Char {
    return when (this) {
        ')' -> '('
        ']' -> '['
        '}' -> '{'
        else -> throw IllegalArgumentException()
    }
}
