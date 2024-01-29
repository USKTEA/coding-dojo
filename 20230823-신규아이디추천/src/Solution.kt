class Solution {
    fun solution(newId: String): String {
        val combined = pipe(
            this::toLower,
            this::removeSpecialCharacter,
            this::distinctDot,
            this::removedFirstAndLastDots,
            this::substituteWithA,
            this::sliceToLength15AndRemoveLastDot,
            this::repeatLastCharacter
        )

        return combined(newId)
    }

    fun repeatLastCharacter(sliced: String): String {
        return sliced.padEnd(3, sliced.last())
    }

    fun sliceToLength15AndRemoveLastDot(substituted: String): String {
        if (substituted.length > 15) {
            return substituted.slice(0 until 15).removeSuffix(".")
        }

        return substituted.removeSuffix(".")
    }

    fun substituteWithA(removedFirstAndLastDots: String): String {
        if (removedFirstAndLastDots.isEmpty()) {
            return "a"
        }

        return removedFirstAndLastDots
    }

    fun removedFirstAndLastDots(distincted: String): String {
        return distincted.removePrefix(".").removeSuffix(".")
    }

    fun distinctDot(removed: String): String {
        val shouldRemove = removed.foldIndexed(mutableListOf<Int>()) { index, acc, c ->
            when (index) {
                0 -> acc
                else -> {
                    if (c == '.' && removed[index - 1] == '.') {
                        acc.add(index - 1)
                    }

                    acc
                }
            }
        }

        return removed.filterIndexed { index: Int, c: Char ->
            !shouldRemove.contains(index)
        }
    }

    fun removeSpecialCharacter(lowered: String): String {
        val blackList = setOf(
            '~',
            '!',
            '@',
            '#',
            '$',
            '%',
            '^',
            '&',
            '*',
            '(',
            ')',
            '=',
            '+',
            '[',
            '{',
            ']',
            '}',
            ':',
            '?',
            '<',
            '>',
            '/',
        )

        return lowered.filterNot { blackList.contains(it) }
    }

    fun toLower(newId: String): String {
        return newId.lowercase()
    }

    private fun <T> pipe(vararg functions: (T) -> T): (T) -> T {
        return functions.reduce { acc, function -> { t: T -> function(acc(t)) } }
    }
}

