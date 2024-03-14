class Solution {
    //"s" => 1
    //"ss" => 2
    //"s ss" => 2
    //"s ss s" => 1
    //"s ss s " => 1
    fun lengthOfLastWord(s: String): Int {
        return s.trim().split(' ').last().length
    }
}
