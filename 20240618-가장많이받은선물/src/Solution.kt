import kotlin.math.max

class Solution {
    //friends to Friend (friend to Int), 선물지수 주면 +, 받으면 -
    //배열 순회

    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        val friendsMap = toFriendsMap(friends)
        val giftedFriends = sendGifts(friendsMap, gifts)
        val maxGiftedCount = getMaxGiftedCount(giftedFriends)

        return maxGiftedCount
    }

    fun getMaxGiftedCount(giftedFriends: List<Friend>): Int {
        var max = 0

        for (i in 0..giftedFriends.lastIndex) {
            val friend = giftedFriends[i]
            var current = 0

            for (j in 0 ..giftedFriends.lastIndex) {
                if (i == j) {
                    continue
                }

                if (giftedFriends[j].willSendGift(friend)) {
                    current += 1
                }
            }


            max = max(max, current)
        }

        return max
    }

    fun sendGifts(friendsMap: Map<String, Friend>, gifts: Array<String>): List<Friend> {
        val send = gifts.fold(friendsMap) { friend, gift ->
            val sender = gift.split(" ")[0]
            val receiver = gift.split(" ")[1]

            friendsMap.getValue(sender).send(receiver)
            friendsMap.getValue(receiver).received()

            friend
        }

        return send.values.toList()
    }

    fun toFriendsMap(friends: Array<String>): Map<String, Friend> {
        return friends.fold(mutableMapOf()) { friends, name ->
            friends[name] = Friend(name)
            friends
        }
    }
}

data class Friend(
    val name: String,
    val sendCounts: MutableMap<String, Int> = mutableMapOf(),
    var giftPoint: Int = 0,
) {
    fun sendCount(name: String): Int {
        return sendCounts.getOrDefault(name, 0)
    }

    fun send(receiver: String) {
        sendCounts[receiver] = sendCounts.getOrDefault(receiver, 0) + 1
        giftPoint += 1
    }

    fun received() {
        giftPoint -= 1
    }

    fun willSendGift(friend: Friend): Boolean {
        if (sendCounts.getOrDefault(friend.name, 0) < friend.sendCount(this.name)) {
            return true
        }

        if (sendCounts.getOrDefault(friend.name, 0) == friend.sendCount(this.name)
            || (sendCounts.getOrDefault(friend.name, 0) == 0 && friend.sendCount(this.name) == 0)
        ) {
            return this.giftPoint < friend.giftPoint
        }

        return false
    }
}
