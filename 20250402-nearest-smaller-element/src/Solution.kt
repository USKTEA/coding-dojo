class Solution {
    fun prevSmaller(numbers: ArrayList<Int>): ArrayList<Int> {
        val result = arrayListOf<Int>()
        val stack = ArrayDeque<Int>()

        for (number in numbers) {
            while (stack.isNotEmpty() && stack.last() >= number) {
                stack.removeLast()
            }

            when (stack.isEmpty()) {
                true -> {
                    stack.addLast(number)
                    result.add(-1)
                }
                false -> {
                    result.add(stack.last())
                }
            }
        }

        return result
    }
}
