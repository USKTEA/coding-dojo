import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = n * m;

        for (int i = 0; i < sum; i += 1) {
            if (i != 0 && i % n == 0) {
                System.out.println();
            }

            System.out.print("*");
        }
    }
}
