import java.util.*

class Solution {
    //lee(t(c)o)de) => lee(t(c)o)de
    //a)b(c)d => ab(c)d
    //))(( => ""
    //s.fold(Accumulator()) { acc, char -> acc.add(char) }
    //acculator.add(char) { if(char == ')' but ( count <= 0 return
    // if (char == '(' but ) count <= 0 return
    // return value
    fun minRemoveToMakeValid(s: String): String {
        val word = mutableListOf<CustomChar>()
        val parentheses: Stack<CustomChar> = Stack()

        for (char in s) {
            if (char != '(' && char != ')') {
                word.add(CustomChar.letter(char))

                continue
            }

            val parenthesis = CustomChar.parenthesis(char)

            if (parenthesis.value == ')') {
                if (parentheses.isNotEmpty() && parentheses.peek().value == '(') {
                    val popped = parentheses.pop()
                    parenthesis.valid = true
                    popped.valid = true
                    word.add(parenthesis)

                    continue
                }
            }

            word.add(parenthesis)
            parentheses.push(parenthesis)
        }

        return word.fold("") { acc, customChar ->
            if (customChar.valid) {
                return@fold acc + customChar.value
            }

            acc
        }
    }
}

data class CustomChar(
    val value: Char,
    var valid: Boolean,
) {

    companion object {
        fun letter(char: Char): CustomChar {
            return CustomChar(value = char, valid = true)
        }

        fun parenthesis(char: Char): CustomChar {
            return CustomChar(value = char, valid = false)
        }
    }
}

