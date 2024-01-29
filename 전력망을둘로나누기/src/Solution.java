public class Solution {
    public int solution(int n, int[][] wires) {

        CustomTree customTree = toTree(wires);

        return customTree.getMinimumDifference();
    }

    public CustomTree toTree(int[][] wires) {
        return CustomTree.of(wires);
    }
}
