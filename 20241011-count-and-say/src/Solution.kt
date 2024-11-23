class Solution {

    //1이 주어지면 11을 반환한다
    //11이 주어지면 21을 반환한다
    //21이 주어지면 1211을 반환한다
    //즉 갯수 + 숫자의 조합을 반환한다
    //left = 0
    //right = 0
    //left < number.toString().size
    //count = 0
    //current = number[left]
    //rightCurrent = number[right]
    //while (current == rightCurrent && right <= number.index) {
    // count += 1
    // right += 1
    // if (right <= number.lastIndex) {
    //  right = number[right]
    // }
    // }
    // result += count + number[left]
    // left = right

    fun countAndSay(number: Int): String {
        var left = 0
        var numberString = ""

        repeat(number) {
            if (it == 0) {
                numberString = "1"
                return@repeat
            }

            var result = ""
            while (left < numberString.length) {
                var right = left
                val currentLeft = numberString[left]
                var currentRight = numberString[right]
                var count = 0

                while (currentLeft == currentRight && right <= numberString.lastIndex) {
                    count += 1
                    right += 1

                    if (right <= numberString.lastIndex) {
                        currentRight = numberString[right]
                    }
                }

                result += count.toString() + currentLeft
                left = right
            }

            left = 0
            numberString = result
        }


        return numberString
    }
}
