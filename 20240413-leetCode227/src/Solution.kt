import java.util.*

class Solution {
    //1+1 => 2
    //1+9 => 10
    //2-1 => 1
    //2-10 => -8
    //2*2 => 4
    //2/3 => 9
    //7/3 => 2
    //7/4 => 1
    //3+2*2 => 7
    //3/2 => 1
    //3+5 / 2 => 5
    //s.fold(Calculator()) { calculator.read(c) caculator}
    //when char.isDigit
    //var number = number * 10 + char.toInt()
    //when char.isOperator
    //when + numbers.push number
    //when - numbers.push -numberx
    //when * numbers.push(numbers.pop * number)
    //when / numbers.push(numbers.pop / number)
    //return calculator.result()
    //result => return += numbers...
    fun calculate(s: String): Int {
        val calculator = s.fold(Calculator()) { acc, c ->
            acc.read(c)
            acc
        }

        return calculator.calculate()
    }
}

class Calculator(
    var currentNumber: Int = 0,
    private var previousOperator: Char = '+',
    private val numbers: Stack<Int> = Stack(),
) {
    private val operations = mutableMapOf(
        '+' to { numbers.push(currentNumber) },
        '-' to { numbers.push(currentNumber) },
        '*' to { numbers.push((numbers.pop() * currentNumber)) },
        '/' to { numbers.push((numbers.pop() / currentNumber)) },
    )

    fun read(char: Char) {
        if (char.isDigit()) {
            if (isMinus(previousOperator)) {
                currentNumber = currentNumber * 10 - char.digitToInt()

                return
            }

            currentNumber = currentNumber * 10 + char.digitToInt()
        }

        if (isOperator(char)) {
            operations[previousOperator]?.invoke()
            previousOperator = char
            currentNumber = 0
        }
    }

    fun calculate(): Int {
        operations[previousOperator]?.invoke()

        return numbers.fold(0) { acc, i ->
            acc + i
        }
    }

    private fun isMinus(char: Char): Boolean {
        return char == '-'
    }

    private fun isOperator(char: Char): Boolean {
        return char == '+' || char == '-' || char == '/' || char == '*'
    }
}
