class Solution {
    fun countSalutes(soldiers: String): Long {
        var right = soldiers.lastIndex
        var rightSoldiers = 0
        var salutes = 0L

        while (right >= 0) {
            if (soldiers[right] == '<') {
                rightSoldiers += 1
            }

            if (soldiers[right] == '>') {
                salutes += rightSoldiers
            }

            right -= 1
        }

        return salutes
    }
}
