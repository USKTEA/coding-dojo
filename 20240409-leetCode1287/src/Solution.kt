class Solution {
    //[1, 2, 2, 6, 6, 6, 6, 7, 10] => 6
    //[1, 1] => 1
    //[1] => 1
    //[1, 1, 1, 2] => 1
    //left = 0 right = 0
    //while (left < arr.size -1)
    //if (right == arr.size -1) {return arr[left]}
    //if (arr[right == arr[left]] { right += 1}
    //if (arr[right != arr[left]] { occurs = right - left , left += 1}
    fun findSpecialInteger(arr: IntArray): Int {
        var left = 0
        var right = 0

        if (arr.size == 1) {
            return arr[0]
        }

        while (left < arr.size - 1) {
            if (right == arr.size - 1) {
                return arr[left]
            }

            if (arr[left] != arr[right]) {
                var occurs = right - left

                if (occurs.toFloat() / arr.size.toFloat() > 0.25f) {
                    return arr[left]
                }

                left = right

                continue
            }

            right += 1
        }

        return 1
    }
}
