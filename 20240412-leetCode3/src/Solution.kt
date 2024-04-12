class Solution {
    //"" => 0
    //a => 1
    //ab => 2
    //abcd => 4
    //aa => 1
    //abcabcbb => 3
    //left = 0, right = 0
    //cache = mutableSet()
    //for(i: Int in left..right)
    //if cache.contains(s[i]) left += 1 right = left continue , if cache.size > logenst.length , logest = cache.toString
    //cache.add(s[i]) right += 1
    fun lengthOfLongestSubstring(s: String): Int {
        var max = 0
        var hashSet = LinkedHashSet<Char>()

        for (char in s) {
            while (hashSet.contains(char)) {
                if (hashSet.size > max) {
                    max = hashSet.size
                }
                hashSet.remove(hashSet.first())
            }

            hashSet.add(char)
        }

        if (hashSet.size > max) {
            max = hashSet.size
        }

        return max
    }
}
