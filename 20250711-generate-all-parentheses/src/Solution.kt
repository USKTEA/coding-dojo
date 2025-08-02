import kotlin.compareTo
import kotlin.text.compareTo

class Solution {
    fun generateParenthesis(parenthesisSize: Int): ArrayList<String> {
        return build(
            openParenthesisLast = parenthesisSize,
            closeParenthesisLast = parenthesisSize,
        )
    }

    private tailrec fun build(
        openParenthesisLast: Int,
        closeParenthesisLast: Int,
        currentParenthesis: List<String> = listOf(),
        result: ArrayList<String> = arrayListOf(),
    ): ArrayList<String> {
        if (openParenthesisLast < 0) {
            return result
        }

        if (openParenthesisLast == 0 && closeParenthesisLast == 0) {
            result.add(currentParenthesis.joinToString(""))
            return result
        }

        val openCloseDiff = openParenthesisLast - closeParenthesisLast

        if (openCloseDiff > 0) {
            throw IllegalArgumentException("Invalid parenthesis")
        }

        build(
            openParenthesisLast = openParenthesisLast - 1,
            closeParenthesisLast = closeParenthesisLast,
            currentParenthesis = buildList {
                addAll(currentParenthesis)
                add("(")
            },
            result = result,
        )

        if (openCloseDiff < 0) {
            build(
                openParenthesisLast = openParenthesisLast,
                closeParenthesisLast = closeParenthesisLast - 1,
                currentParenthesis = buildList {
                    addAll(currentParenthesis)
                    add(")")
                },
                result = result,
            )
        }

        return result
    }
}
