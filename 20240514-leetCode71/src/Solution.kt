class Solution {
    // /home/ => /home
    // /home//foo/ => /home/foo
    // /home/.. => /
    // /../ => /
    fun simplifyPath(path: String): String {
        val parsed = parse(path)
        val simplePath = ArrayDeque<String>()

        for (path in parsed) {
            when (path) {
                ".." -> {
                    if (simplePath.isNotEmpty()) {
                        simplePath.removeLast()
                        simplePath.removeLast()
                    }
                }

                "/" -> {
                    if (simplePath.isNotEmpty() && simplePath.last() != "/") {
                        simplePath.add(path)
                    }
                }

                "." -> continue
                else -> simplePath.add(path)
            }
        }

        if (simplePath.isNotEmpty() && simplePath.last() == "/") {
            simplePath.removeLast()
        }

        if (simplePath.isEmpty() || simplePath.first() != "/") {
            simplePath.addFirst("/")
        }

        return simplePath.fold("") { acc, path -> acc + path }
    }

    fun parse(pathToParse: String): MutableList<String> {
        val parsed = mutableListOf<String>()
        var current = 0
        var currentPath = ""

        while (current < pathToParse.length) {
            val character = pathToParse[current]

            if (character == '/') {
                if (currentPath.isNotEmpty()) {
                    parsed.add(currentPath)
                    currentPath = ""
                }

                parsed.add(character.toString())

                current += 1

                continue
            }

            currentPath += character

            current += 1
        }

        if (currentPath.isNotEmpty()) {
            parsed.add(currentPath)
        }

        return parsed
    }
}
