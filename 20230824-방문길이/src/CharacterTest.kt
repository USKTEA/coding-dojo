import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CharacterTest {
    private val coordinate = Coordinate(5)

    @Test
    fun countUniquePathWillReturnOne() {
        val character = Character(
            coordinate = coordinate,
            directions = mutableListOf(
                Direction(intArrayOf(0, 0), intArrayOf(0, 1)),
                Direction(intArrayOf(0, 0), intArrayOf(0, 1)),
                Direction(intArrayOf(0, 0), intArrayOf(0, 1)),
                Direction(intArrayOf(0, 0), intArrayOf(0, 1)),
            )
        )

        val result = character.countUniquePath()

        assertEquals(1, result)
    }

    @Test
    fun countUniquePathWillAlsoReturnOne() {
        val character = Character(
            coordinate = coordinate,
            directions = mutableListOf(
                Direction(intArrayOf(0, 0), intArrayOf(0, 1)),
                Direction(intArrayOf(0, 1), intArrayOf(0, 0)),
                Direction(intArrayOf(0, 0), intArrayOf(0, 1)),
                Direction(intArrayOf(0, 0), intArrayOf(0, 1)),
            )
        )

        val result = character.countUniquePath()

        assertEquals(1, result)
    }

    @Test
    fun countUniquePathWillReturnTwo() {
        val character = Character(
            coordinate = coordinate,
            directions = mutableListOf(
                Direction(intArrayOf(0, 0), intArrayOf(0, 1)),
                Direction(intArrayOf(0, 1), intArrayOf(0, 0)),
                Direction(intArrayOf(0, 0), intArrayOf(-1, 0)),
                Direction(intArrayOf(0, 0), intArrayOf(0, 1)),
            )
        )

        val result = character.countUniquePath()

        assertEquals(2, result)
    }

    @Test
    fun countUniquePathWillAlsoReturnTwo() {
        val character = Character(
            coordinate = coordinate,
            directions = mutableListOf(
                Direction(intArrayOf(0, 0), intArrayOf(0, 1)),
                Direction(intArrayOf(0, 1), intArrayOf(0, 0)),
                Direction(intArrayOf(0, 0), intArrayOf(-1, 0)),
                Direction(intArrayOf(-1, 0), intArrayOf(0, 0)),
            )
        )

        val result = character.countUniquePath()

        assertEquals(2, result)
    }

    @Test
    fun `Character는 order대로 움직인다`() {
        val character = Character(
            coordinate = coordinate,
        )

        val previous = character.current()
        assertArrayEquals(intArrayOf(0, 0), previous)

        character.move('U')

        val afterOrderU = character.current()
        assertArrayEquals(intArrayOf(0, 1), afterOrderU)

        character.move('D')

        val afterOrderD = character.current()
        assertArrayEquals(intArrayOf(0, 0), afterOrderD)

        character.move('L')

        val afterOrderL = character.current()
        assertArrayEquals(intArrayOf(-1, 0), afterOrderL)

        character.move('R')

        val afterOrderR = character.current()
        assertArrayEquals(intArrayOf(0, 0), afterOrderR)
    }

    @Test
    fun `Character는 Coordinate의 경계를 벗어나지 못한다`() {
        val character = Character(
            coordinate = coordinate,
        )

        repeat(5) {
            character.move('U')
        }

        assertArrayEquals(intArrayOf(0, 5), character.current())

        repeat(5) {
            character.move('U')
        }

        assertArrayEquals(intArrayOf(0, 5), character.current())
    }

    @Test
    fun `Chracter는 움직일 때 마다 경로를 기록한다`() {
        val character = Character(
            coordinate = coordinate,
        )

        assertEquals(0, character.countDirections())

        character.move('U')

        assertEquals(1, character.countDirections())
    }
}
