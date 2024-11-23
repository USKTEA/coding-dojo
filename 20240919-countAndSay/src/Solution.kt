class Solution {

    //1 => 1
    //2 => 11
    //3 => 21
    //4 => 1211
    //초기값은 1이다.
    //재귀를 돌면서 number를 1만큼 낮춘다
    //숫자는 index 0부터 새면서 다른 숫자를 만날 때 까지 갯수를 카운트한다
    //다른 숫자를 만난다면 갯수 + 숫자를 append하고 현재 index를 옮긴다
    //two pointer전략이다
    fun countAndSay(toCount: Int, number: String = "1"): String {
        if (toCount == 1) {
            return number
        }

        var left = 0
        var right = 0
        var count = 0
        val current = StringBuilder()

        while (right <= number.lastIndex) {
            if (number[left] == number[right]) {
                count++
                right++

                continue
            }

            if (number[left] != number[right]) {
                current.append(count).append(number[left])
                left = right
                count = 0
            }
        }

        current.append(count).append(number[left])

        return countAndSay(toCount - 1, current.toString())
    }
}
