class Solution {
    public long solution(int a, int b) {
        long distance = Math.abs(b - a) + 1;

        return (a + b) * distance / 2;
    }
}
