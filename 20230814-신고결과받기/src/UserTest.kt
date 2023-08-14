import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UserTest {

    @Test
    fun `유저 당 한 번의 신고만 기록된다`() {
        val user = User("muzi")

        user.addReport("frodo")

        assertEquals(1, user.reportSize())

        user.addReport("frodo")

        assertEquals(1, user.reportSize())
    }
}
