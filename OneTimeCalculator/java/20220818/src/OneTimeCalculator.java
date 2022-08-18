import java.util.Scanner;

public class OneTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0;

        String operator1 = " + (더하기)";
        String operator2 = " - (빼기)";
        String operator3 = " * (곱하기)";
        String operator4 = " / (나누기)";

        System.out.println("급할 때 사용하는 일회용 계산기 숫자를 입력해 주세요: ");

        double number1 = scanner.nextDouble();

        System.out.println("연산자를 선택해주세요:");
        System.out.printf("1.%s\n2.%s\n3.%s\n4.%s\n", operator1, operator2, operator3, operator4);

        int userChoice = scanner.nextInt();

        String chosenOperator = "";

        if (userChoice == 1) {
            chosenOperator = "+";
        }

        if (userChoice == 2) {
            chosenOperator = "-";
        }

        if (userChoice == 3) {
            chosenOperator = "*";
        }

        if (userChoice == 4) {
            chosenOperator = "/";
        }

        System.out.println("숫자를 입력해 주세요:");

        double number2 = scanner.nextDouble();

        if (chosenOperator.equals("+")) {
            result = number1 + number2;
        }

        if (chosenOperator.equals("-")) {
            result = number1 - number2;
        }

        if (chosenOperator.equals("*")) {
            result = number1 * number2;
        }

        if (chosenOperator.equals("/")) {
            result = number1 / number2;
        }

        System.out.println("계산 결과: " + result);
    }
}
