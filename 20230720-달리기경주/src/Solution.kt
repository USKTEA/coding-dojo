class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val answer = callings.fold(players) { acc, name ->
            val ranking = acc.indexOf(name)

            switch(acc, ranking)
        }

        return answer
    }

    fun switch(acc: Array<String>, ranking: Int): Array<String> {
        val copied = acc.copyOf()

        val temp = copied[ranking - 1]
        copied[ranking - 1] = copied[ranking]
        copied[ranking] = temp

        return copied
    }
}
