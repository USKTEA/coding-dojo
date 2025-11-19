class Solution {
    //0과 1로 이루어진 정수형 배열 flowerbed와 정수 flower 가 주어졌을 때 flowerbed에 flower를 서로 인접한게 없으면서 모두 배치할 수 있는지 결과를 반환해라
    //[0,0,0], 1 -> true
    //[0,0,0], 2 -> false
    //[1,0,0], 1 -> true
    //index를 통해 인접한 요소 중 1이 있는지 확인한다 만약 1이 있다면 넘어간다. 만약 1이 없다면 flower -= 1
    //index가 0 일 때는 +1만 확인하고 index 가 flowerbed.lastIndx와 동일할 때는 -1만 확인하낟
    fun canPlaceFlowers(flowerbed: IntArray, flower: Int): Boolean {
        if (flowerbed.size == 1) {
            return flowerbed[0] == 0 || flower == 0
        }

        var currentFlower = flower

        flowerbed.forEachIndexed { index, embed ->
            if (currentFlower == 0) {
                return true
            }

            when (index) {
                0 -> {
                    if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                        flowerbed[index] = 1
                        currentFlower -= 1

                    }
                }

                flowerbed.lastIndex -> {
                    if (flowerbed[flowerbed.lastIndex - 1] == 0 && flowerbed[flowerbed.lastIndex] == 0) {
                        flowerbed[index] = 1
                        currentFlower -= 1
                    }
                }

                else -> {
                    val left = index - 1
                    val right = index + 1

                    if (flowerbed[index] == 0 && flowerbed[left] == 0 && flowerbed[right] == 0) {
                        flowerbed[index] = 1
                        currentFlower -= 1
                    }
                }
            }
        }

        return currentFlower == 0
    }
}
