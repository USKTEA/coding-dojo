class Solution {
    private var maxString = ""

    fun solve(input: String, maxSwaps: Int): String {
        val digits = input.toCharArray()
        dfs(digits, maxSwaps, 0)
        return maxString
    }

    private fun dfs(digits: CharArray, swapsLeft: Int, currentIndex: Int) {
        val currentString = String(digits)

        if (currentString > maxString) {
            maxString = currentString
        }

        if (swapsLeft == 0 || currentIndex >= digits.size) {
            return
        }

        // 현재 인덱스 이후에서 가장 큰 문자를 찾는다
        val maxDigit = digits.slice(currentIndex until digits.size).maxOrNull() ?: return

        // 가장 큰 문자가 현재 자리에 이미 있다면 swap 없이 다음 단계로 진행
        if (digits[currentIndex] == maxDigit) {
            dfs(digits, swapsLeft, currentIndex + 1)
            return
        }

        // 뒤에서부터 가장 큰 숫자와 swap 시도
        for (i in digits.lastIndex downTo currentIndex + 1) {
            if (digits[i] == maxDigit) {
                swap(digits, currentIndex, i)
                dfs(digits, swapsLeft - 1, currentIndex + 1)
                swap(digits, currentIndex, i) // backtrack
            }
        }
    }

    private fun swap(array: CharArray, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}

