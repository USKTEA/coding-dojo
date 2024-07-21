class Solution {
    fun predictPartyVictory(senators: String): String {
        var (radiants, dires) = countSenatorParties(senators)

        val senatorsDeque = ArrayDeque(senators.toList())
        var banDire = 0
        var banRadiant = 0

        while (true) {
            val senate = senatorsDeque.removeFirst()

            if (senate == 'R') {
                if (dires == 0) {
                    return "Radiant"
                }

                if (banRadiant != 0) {
                    radiants -= 1
                    banRadiant -= 1
                    continue
                }

                banDire += 1
                senatorsDeque.addLast(senate)
            }

            if (senate == 'D') {
                if (radiants == 0) {
                    return "Dire"
                }

                if (banDire != 0) {
                    dires -= 1
                    banDire -= 1
                    continue
                }

                banRadiant += 1
                senatorsDeque.addLast(senate)
            }
        }
    }

    fun countSenatorParties(senators: String): Pair<Int, Int> {
        return senators.fold(Pair(0, 0)) { counts, senate ->
            if (senate == 'R') {
                return@fold counts.copy(first = counts.first + 1)
            }

            return@fold counts.copy(second = counts.second + 1)
        }
    }
}
