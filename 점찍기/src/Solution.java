public class Solution {
    private void test() {
        System.out.println("원점과 최대 거리가 4이고 x가 0일 경우 y값의 최대치는 4이다. " + (maxY(0, 4) == 4));
        System.out.println("원점과 최대 거리가 4이고 x가 2일 경우 y값의 최대치는 3이다. " + (maxY(2, 4) == 3));
        System.out.println("y값이 4이고 k값이 2인 경우 최대 찍을 수 있는 점의 개수는 3개이다. " + (dots(4, 2) == 3));
    }

    public long solution(int k, int d) {
        test();

        long answer = 0;

        for (int i = 0; i <= d; i += k) {
            int maxY = maxY(i, d);
            answer += dots(maxY, k);
        }

        return answer;
    }

    private int maxY (int x, int distance) {
        return (int) Math.sqrt(Math.pow(distance, 2) - Math.pow(x, 2));
    }

    private int dots(int maxY, int k) {
        return maxY / k + 1;
    }
}
