class Solution {
    //[0] => 0
    //[1] => 0
    //[1, 1] => 0
    //[1, 2] => 1
    //[1, 2, 3] => 2
    //[3, 2] => 0
    //[7, 1, 5, 3, 6, 4] => 5
    //[7, 6, 4, 3, 1] => 0
    //for i in 0 .. prices.size
    //for j in i..price.size
    //maxProfit = Math.max(maxProofit, prices[i] - prices[j])

    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var buyed = 0
        var sellDate = 0

        for (i: Int in prices.indices) {
            val buy = prices[i]

            if (buy > buyed && i > sellDate && sellDate != 0) {
                continue
            }

            for (j: Int in i..<prices.size) {
                val sell = prices[j]

                if (sell - buy > maxProfit) {
                    maxProfit = sell - buy
                    buyed = buy
                    sellDate = j
                }
            }
        }

        return maxProfit
    }
}
