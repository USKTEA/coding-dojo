class Solution {
    //[0, 1] => 2
    //[0, 1, 0] => 1
    //[0] => 0
    //[1] => 0
    //[0, 1, 0, 1] => 4
    //[0, 1, 1, 0] => 4
    //[0, 0, 1, 1] => 4
    //mutableMap<Int, Record>()
    //for(i: Int in nums.indices) {
    //if(nums[i] == 0) {
    //val record = mutalbeMap.getOrDefault(i, Record(0, 0))
    //record.addOne, addZero
    //mutableMap[i] = record
    // }
    //
    //for (i: Int map.size - 1 down to 0) {
    // map[i] = record
    // if (record.isContiguous) {
    // return record.size
    // }
    open fun findMaxLength(nums: IntArray): Int {
        val map: MutableMap<Int, Int> = HashMap()
        map[0] = -1
        var maxlen = 0
        var count = 0

        //0 => -1
        //-1 => 0
        //count = 0
        //maxLen = 2

        //[0, 1, 0, 1]
        //0
        //1
        //0
        //1

        for (i in nums.indices) {
            if (nums[i] == 1) {
                count += 1
            }

            if (nums[i] == 0) {
                count -= 1
            }

            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.getValue(count))
            }

            if (!map.containsKey(count)) {
                map[count] = i
            }
        }
        return maxlen
    }
}

