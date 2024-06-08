class Solution {
    //[3, 30, 34, 5, 9] => 9534330
    //[9, 10] => 910
    //[1, 2, 3] => 321
    //[1, 2, 3, 0] => [1, 2, 3, 0]
    //[99, 991] => 99991
    //[91, 991, 9, 9] => 9999191
    fun largestNumber(numbers: List<Int>): String {
        val stringNumbers = numbers.map { Number(it.toString()) }

        val sorted = stringNumbers.sorted().fold(StringBuilder()) { builder, number ->
            builder.append(number.value)
        }

        if (sorted[0] == '0') {
            return "0"
        }

        return sorted.toString()
    }
}

data class Number(
    val value: String
) : Comparable<Number> {
    override fun compareTo(other: Number): Int {
        return (other.value + this.value).compareTo(this.value + other.value)
    }
}
