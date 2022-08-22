import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < m; i += 1) {
            for (int j = 0; j < n; j += 1) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
