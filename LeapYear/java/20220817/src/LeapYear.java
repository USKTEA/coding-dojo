import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연도: ");

        int inputYear = scanner.nextInt();
        boolean isLeapYear = false;

        if (inputYear < 1900 || inputYear > 2022) {
            System.out.println("1900 ~ 2022의 자연수로 입력해주세요");

            return;
        }

        if (inputYear % 4 == 0 && !(inputYear % 100 == 0) || inputYear % 400 == 0) {
            isLeapYear = true;
        }

        System.out.println(isLeapYear);
    }
}
