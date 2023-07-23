class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        return targets.map { target ->
            calculateTries(target, keymap)
        }.toIntArray()
    }

    fun calculateTries(target: String, keymaps: Array<String>): Int {
        return target.toCharArray().fold(0) { tries, character ->
            val currentTries = keymaps.map { keymap -> keymap.indexOfFirst { it == character } }
                .filterNot { it == -1 }
                .minOrNull()

            if (currentTries == null) {
                return -1
            }

            tries + currentTries + 1
        }
    }
}