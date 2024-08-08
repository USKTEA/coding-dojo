class Solution {
    //6, 9 => 3
    //3| 6, 9
    //   2, 3

    //
    fun gcd(number1: Int, number2: Int): Int {
        if (number1 == 0 || number2 == 0) {
            if (number1 == 0) {
                return number2;
            }

            return number1;
        }

        var currentDivisor = 2
        var currentNumber1 = number1
        var currentNumber2 = number2
        var gcd = 1

        while (currentDivisor <= currentNumber1 && currentDivisor <= currentNumber2) {
            if (currentNumber1 % currentDivisor == 0 && currentNumber2 % currentDivisor == 0) {
                while (currentNumber1 % currentDivisor == 0 && currentNumber2 % currentDivisor == 0) {
                    gcd *= currentDivisor

                    currentNumber1 /= currentDivisor
                    currentNumber2 /= currentDivisor
                }
            }

            currentDivisor += 1
        }


        return gcd
    }
}
