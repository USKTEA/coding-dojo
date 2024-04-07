class Solution {
    //3 => ["1", "2", "Fizz"]
    //1 => "1"
    //2 => "2"
    //3 => "Fizz"
    //5 => "Buzz"
    //15 => "FizzBuzz"
    //1 => [1]
    //2 => [1, 2]
    fun fizzBuzz(n: Int): List<String> {
        val numbers = toList(n)

        return numbers.map { number -> convert(number) }
    }

    private fun convert(number: Int): String {
        val dividedByFive = number % 5
        val dividedByThree = number % 3

        if (dividedByFive == 0 && dividedByThree == 0) {
            return "FizzBuzz"
        }

        if (dividedByFive == 0) {
            return "Buzz"
        }

        if (dividedByThree == 0) {
            return "Fizz"
        }

        return number.toString()
    }

    fun toList(i: Int): List<Int> {
        return List(i) { index: Int -> index + 1 }
    }
}
