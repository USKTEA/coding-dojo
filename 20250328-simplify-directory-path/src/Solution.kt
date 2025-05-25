class Solution {
    // /home/ -> /home
    // .. -> pop
    // . -> 무시
    // removeTrailing /
    // root -> /
    // ////... 하나로
    fun simplifyPath(path: String): String {
        val stack = ArrayDeque<String>()

        path.split("/").forEach { directory ->
            if (directory.isBlank() || directory == ".") {
                return@forEach
            }

            if (directory == "..") {
                stack.removeLast()

                return@forEach
            }

            stack.add("/$directory")
        }

        if (stack.isEmpty()) {
            return "/"
        }

        return stack.joinToString("")
    }
}
