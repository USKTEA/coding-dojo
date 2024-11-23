class Solution {
    //문자열 hayStack과 needle이 주어졌을 떄 needle이 처음으로 hayStack에서 출현하는 index를 반환해라.
    //needle을 찾을 수 없거나 hayStack과 needle이 빈 문자열일 때 -1을 반환한다
    //hayStack을 순회하면서 hayStack[i]가 needle[0]과 일치하다면 for i i < hayStack.lastIndex로 needle[i - i]와 비교한다
    //만약 모두 일치하다면 i를 반환
    fun strStr(hayStack: String, needle: String): Int {
        for (i in hayStack.indices) {
            if (hayStack[i] == needle[0]) {
                for (j in i ..needle.lastIndex) {
                    if (hayStack[j] == needle[j - i]) {
                        if (j - i == needle.lastIndex) {
                            return i
                        }

                        continue
                    }

                    break
                }
            }
        }

        return -1
    }
}
