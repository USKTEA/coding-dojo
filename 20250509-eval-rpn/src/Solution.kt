class Solution {
    //연산자와 숫자로 이루어진 문자열 표현식 expression이 주어졌을 때 표현식을 RPN을 이용해 계산한 결과를 반환해라
    //연산자는 +, -, *, /가 있을 수 있고 숫자는 int 타입이다
    //RPN은 3, 4 + => 7 뒤에 연산자가 있는 notation
    //expression을 순회하면서 요소가 숫자라면 숫자 배열에 넣는다
    //만약 연산자를 만난다면 숫자 배열에서 가장 마지막에 추가된 숫자 2개를 빼 연산후 다시 마지막에 집어넣는다

    private val operations = mapOf(
        "+" to {leftOperand: Int, rightOperand: Int -> leftOperand + rightOperand},
        "-" to {leftOperand: Int, rightOperand: Int -> leftOperand - rightOperand},
        "/" to {leftOperand: Int, rightOperand: Int -> leftOperand / rightOperand},
        "*" to {leftOperand: Int, rightOperand: Int -> leftOperand * rightOperand},
    )
    private val numbers = ArrayDeque<Int>()

    fun evalRPN(expression: ArrayList<String>): Int {
        if (!isOperation(expression.last())) {
            return expression.first().toInt()
        }

        expression.forEach { word ->
            val isOperation = isOperation(word)

            if (isOperation) {
                val operation = operations.getValue(word)

                numbers.addLast(operation(numbers.removeLast(), numbers.removeLast()))
            }

            if (!isOperation) {
                numbers.addLast(word.toInt())
            }
        }

        return numbers.last()
    }

    private fun isOperation(word: String): Boolean {
        return word in operations.keys
    }
}
