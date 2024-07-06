class Solution {
    //PAYPALISHIRING => PAHNAPLSIIGYIR
    //P, 3 => P
    //PA, 3 => PA
    //PAY, 3 => PAY
    //PAYP, 3 => PAPY
    //PAYPA, 3 => PAAPY
    //PAYPAL, 3 => PAAPLY
    fun convert(s: String, numRows: Int): String {
        val matrix = getMatrix(s, numRows)


        return matrix.map { line -> line.map { it } }.toString()
    }

    fun getMatrix(s: String, numRows: Int): Array<Array<String>> {
        val divider = (numRows - 1) * 2
        val subtracted = s.length - numRows
        val row = 1 + (subtracted / divider) * 2
        val reminder = subtracted % divider

        //3 => 1, 2
        //4 => 1, 2, 3
        //5 => 1, 2, 3, 4

        println(reminder)
        println(row)

        if (reminder >= numRows) {
            return Array(numRows) { Array(row + numRows - 1) { "" } }
        }

        return Array(numRows) { Array(row + reminder) { "" } }
    }
}
