import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BMI 측정기");
        System.out.print("신장(m): ");

        double height = scanner.nextDouble();

        System.out.print("체중(kg): ");

        double weight = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        String result = "";

        if (bmi < 18.5) {
            result = "저체중";
        }

        if (bmi >= 25) {
            result = "비만";
        }

        if (bmi >= 23 && bmi < 25) {
            result = "과체중";
        }

        if (bmi >= 18.5 && bmi < 23) {
            result = "정상";
        }

        System.out.println("비만도 결과: " + result);
        System.out.println("BMI: " + bmi);
    }
}
