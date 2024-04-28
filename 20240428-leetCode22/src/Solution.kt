class Solution {
    //1 => ["()"]
    //3 => ["((()))","(()())","(())()","()(())","()()()"]
    //시작은 무조건 open
    //마지막은 무조건 close
    //open이 있다면 무조건 close가 있어야 한다
    //if (n == 1) {
    // when n * 2 = open + close
    // return ""
    // }
    //if (opens.size == closes.size) {
    // val Parentheses = getParentheses()
    // if (open < n) {
    //
    // }
    // if (close < open) {
    //}
    //
    // }

    fun generateParenthesis(
        n: Int,
        open: Int = 0,
        close: Int = 0,
        current: String = "",
        parenthesis: MutableList<String> = mutableListOf(),
    ): List<String> {
        if (n * 2 == open + close) {
            parenthesis.add(current)

            return parenthesis
        }

        if (open == close || open < n) {
             generateParenthesis(
                n = n,
                open = open + 1,
                close = close,
                current = "$current(",
                parenthesis = parenthesis
            )
        }

        if (close < open) {
            generateParenthesis(
                n = n,
                open = open,
                close = close + 1,
                current = "$current)",
                parenthesis = parenthesis
            )
        }

        return parenthesis
    }
}
