public class Solution {
    public void test() {
        System.out.println(getBrown(3, 3) == 8);
        System.out.println(getYellow(3, 3) == 1);
        System.out.println(getYellow(4, 4) == 4);
    }

    public int[] solution(int brown, int yellow) {
        test();

        int width = 3;
        int height = 3;

        while (!(getBrown(width, height) == brown) && !(getYellow(width, height) == yellow)) {
            width += 1;

            if (getBrown(width, height) > brown) {
                height += 1;
                width = height;

                continue;
            }

            if ((getBrown(width, height) == brown) && (getYellow(width, height) != yellow)) {
                height += 1;
                width = height;
            }
        }

        return new int[]{width, height};
    }

    public int getBrown(int width, int height) {
        return width * 2 + ((height - 2) * 2);
    }

    public int getYellow(int width, int height) {
        return (width - 2) * (height - 2);
    }
}
