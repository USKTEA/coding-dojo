class Solution {
    //연산자와 숫자로 이루어진 문자열 표현식이 주어질 때 RPN 방식을 사용해 결과 값을 구하라
    //rpn은 연산자가 operands 이후에 달려있는 표기법을 말한다. 1 1 + => 2
    //expression을 끝에서 부터 순회하면서 만약 연산자라면 stack에 쌓는다
    //만약 숫자라면 숫자 stack에 쌓는다
    //만약 숫자 stack의 크기가 2가 되었다면
    //stack.add(operators.pop(stack.pop(), stack.pop))
    //stack.last
    private val operationMap = mapOf(
        "+" to { leftOperand: Int, rightOperand: Int -> leftOperand + rightOperand },
        "-" to { leftOperand: Int, rightOperand: Int -> leftOperand - rightOperand },
        "*" to { leftOperand: Int, rightOperand: Int -> leftOperand * rightOperand },
        "/" to { leftOperand: Int, rightOperand: Int -> leftOperand / rightOperand },
    )
    private val numbers = ArrayDeque<Int>()

    fun evalRPN(expression: ArrayList<String>): Int {
        if (expression.last() !in operationMap.keys) {
            return expression.last().toInt()
        }

        expression.forEach { word ->
            if (word in operationMap.keys) {
                val operation = operationMap.getValue(word)

                numbers.addLast(operation(numbers.removeLast(), numbers.removeLast()))
            }

            if (word !in operationMap.keys) {
                numbers.addLast(word.toInt())
            }
        }

        return numbers.last()
    }
}
