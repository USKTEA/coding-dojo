import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun solution() {
        val result = solution.solution(
            friends = arrayOf("muzi", "ryan", "frodo", "neo"),
            gifts = arrayOf(
                "muzi frodo",
                "muzi frodo",
                "ryan muzi",
                "ryan muzi",
                "ryan muzi",
                "frodo muzi",
                "frodo ryan",
                "neo muzi"
            )
        )

        assertEquals(2, result)
    }

    @Test
    fun toFriendsMap() {
        val friendsMap = solution.toFriendsMap(arrayOf("muzi", "ryan", "frodo", "neo"))

        assertEquals(
            mapOf(
                "muzi" to Friend("muzi"),
                "ryan" to Friend("ryan"),
                "frodo" to Friend("frodo"),
                "neo" to Friend("neo")
            ), friendsMap
        )
    }

    @Test
    fun sendGifts() {
        val friends = mapOf(
            "muzi" to Friend("muzi"),
            "ryan" to Friend("ryan"),
            "frodo" to Friend("frodo"),
            "neo" to Friend("neo")
        )
        val gifts = arrayOf(
            "muzi frodo",
            "muzi frodo",
            "ryan muzi",
            "ryan muzi",
            "ryan muzi",
            "frodo muzi",
            "frodo ryan",
            "neo muzi"
        )

        val giftedFriends = solution.sendGifts(friends, gifts)

        println(giftedFriends)
        val muzi = giftedFriends.first { it.name == "muzi" }

        assertEquals(
            0, muzi.sendCount("ryan")
        )

        assertEquals(
            2, muzi.sendCount("frodo")
        )

        assertEquals(-3, muzi.giftPoint)

        val ryan = giftedFriends.first { it.name == "ryan" }

        assertEquals(
            0, ryan.sendCount("frodo")
        )

        assertEquals(
            3, ryan.sendCount("muzi")
        )

        assertEquals(2, ryan.giftPoint)
    }

    @Test
    fun getMaxGiftedCount() {
        val giftedFriends = listOf(
            Friend(name = "muzi", sendCounts = mutableMapOf("frodo" to 2), giftPoint = -3),
            Friend(name = "ryan", sendCounts = mutableMapOf("muzi" to 3), giftPoint = 2),
            Friend(name = "frodo", sendCounts = mutableMapOf("muzi" to 1, "ryan" to 1), giftPoint = 0),
            Friend(name = "neo", sendCounts = mutableMapOf("muzi" to 1), giftPoint = 1)
        )

        val result = solution.getMaxGiftedCount(giftedFriends)

        assertEquals(2, result)
    }
}
