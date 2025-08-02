class Solution {
    //well-formed 괄호는 (로 시작하고 )로 끝나는 괄호를 말한다
    //정수형 parenthesesSize이 주어졌을 때 parenthesesSize만큼 well-formed 괄호의 모든 경우의 수를 구해라
    //여는 괄호는 parenthesesSize 만큼 나타날 수 있다
    //여는 괄호는 닫는 괄호의 나타난 숫자와 상관없이 나타날 수 있다
    //닫는 괄호는 parenthesesSize 만큼 나타날 수 있다
    //닫는 괄호는 열린 괄호 만큼만 추가할 수 있다
    //닫는 괄호는 열린 괄호보다 먼저 나타날 수 없다
    fun generateParenthesis(parenthesesSize: Int): ArrayList<String> {
        val result = mutableListOf<String>()

        fun innerGenerateParenthesis(openLast: Int, closeLast: Int, currentParentheses: List<String> = listOf()) {
            if (openLast < 0) {
                return
            }

            if (openLast == 0 && closeLast == 0) {
                result.add(currentParentheses.joinToString(""))
                return
            }

            val openCloseDifference = openLast - closeLast

            if (openCloseDifference > 0) {
                throw RuntimeException("Parent heses cannot be lower than close parentheses")
            }

            if (openCloseDifference < 0) {
                innerGenerateParenthesis(
                    openLast = openLast - 1,
                    closeLast = closeLast,
                    currentParentheses = buildList {
                        addAll(currentParentheses)
                        add("(")
                    }
                )

                innerGenerateParenthesis(
                    openLast = openLast,
                    closeLast = closeLast - 1,
                    currentParentheses = buildList {
                        addAll(currentParentheses)
                        add(")")
                    }
                )
            }

            if (openCloseDifference == 0) {
                innerGenerateParenthesis(
                    openLast = openLast - 1,
                    closeLast = closeLast,
                    currentParentheses = buildList {
                        addAll(currentParentheses)
                        add("(")
                    }
                )
            }
        }

        innerGenerateParenthesis(
            openLast = parenthesesSize,
            closeLast = parenthesesSize,
        )

        return ArrayList(result)
    }
}
