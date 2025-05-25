
class Solution {
    fun simplifyPath(unixPath: String): String {
        val removed = removeConsecutiveSlashes(unixPath)
        val paths = removed.split("/").filter { it.isNotEmpty() }
        val result = ArrayDeque<String>()

        paths.forEach { path ->
            if (path == ".") {
                return@forEach
            }

            if (path == "..") {
                if (result.isNotEmpty()) {
                    result.removeLast()

                    return@forEach
                }
            }

            result.addLast("/$path")
        }

        if (result.isEmpty()) {
            return "/"
        }

        return result.joinToString("")
    }

    fun removeConsecutiveSlashes(path: String): String {
        return path.replace(Regex("/+"), "/")
    }
}
