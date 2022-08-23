import java.util.Scanner;

public class Solution {
    public static String solution(int num) {
        String odd = "Odd";
        String even = "Even";

        if (num % 2 == 0) {
            return even;
        }

        return odd;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String answer = solution(number);

        System.out.println(answer);
    }
}
