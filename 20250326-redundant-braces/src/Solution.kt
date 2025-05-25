class Solution {
    //사칙연산식과 괄호가 포함된 문자열이 주어졌을 때 괄호가 낭비되었다면 1 낭비되지 않았다면 0을 반환해라
    //괄호가 낭비되었는지 확인하는 방법은 하나의 완벽한 괄호에는 하나의 연삭자만 있어야한다
    //만약 괄호가 열렸고 1개 미만의 연산식만 있다면 그것은 낭비되지 않은 것
    private val operations = listOf('+', '-', '*', '/')

    fun braces(expression: String): Int {
        val openBraces = ArrayDeque<Char>()
        var operatorExists = false

        for (chracter in expression) {
            if (chracter == '(') {
                openBraces.addLast(chracter)
                operatorExists = false
            }

            if (chracter == ')') {
                if (!operatorExists) {
                    return 1
                }
            }

            if (chracter in operations && openBraces.isNotEmpty()) {
                operatorExists = true
                openBraces.removeLast()
            }
        }

        if (openBraces.isNotEmpty()) {
            return 1
        }

        return 0
    }
}
