class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val robotDog = RobotDog(park)

        robotDog.execute(routes)

        return robotDog.location()
    }
}